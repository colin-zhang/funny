#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main()
{
	char hostname[128];
	
	memset(hostname,0,sizeof hostname);

	gethostname(hostname,128);

	printf("host name is: %s \n",hostname);

	exit(0);
}
