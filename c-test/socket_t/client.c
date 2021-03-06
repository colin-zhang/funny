#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <string.h>
#include <netdb.h>
#include <sys/types.h>
#include <netinet/in.h>
#include <sys/socket.h>

#define SERVPORT 3333
#define MAXDATASIZE 100

int main(int argc, char *argv[]){
	int sockfd, recvbytes;
	char buf[MAXDATASIZE];
	struct hostent *host;
	struct sockaddr_in serv_addr;
#if 0
	if(argc < 2){
		printf("enter the server's hostname!\n");
		exit(1);
	}

	if(host = gethostbyname(argv[1]) == NULL){
		printf("gethostbyname error!\n");
		exit(1);
	}
#endif
	if((sockfd = socket(AF_INET, SOCK_STREAM, 0)) == -1){
		perror("socket create error!\n");
		exit(1);
	} 
	serv_addr.sin_family = AF_INET;
	serv_addr.sin_port = htons(SERVPORT);
	serv_addr.sin_addr.s_addr  = inet_addr("127.0.0.1"); 
//	serv_addr.sin_addr = *((struct in_addr*)host->h_addr);
	bzero(&(serv_addr.sin_zero), 8);
	if(connect(sockfd, (struct sockaddr *)&serv_addr, sizeof(struct sockaddr)) == -1){
		printf("clinet:connect error!\n");
		exit(1);
	}

	if(recvbytes = recv(sockfd, buf, MAXDATASIZE, 0) == -1){
		printf("recv error!\n");
		exit(1);
	}
	printf("DEBUG(%s) buf = %s\n", __func__, buf);
	return 1;
}
