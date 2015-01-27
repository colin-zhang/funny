#include <stdio.h>
#include <string.h>

#if 0
#define N 10
int main()
{
    char a[N] = {0};
    int i=0;
    while(fgets(a, N, stdin)) {
        fprintf(stdout, "%d %s@%d\n", i, a, strlen(a));
        fflush(stdout);
        i++;
    }
    return 0;
}
#else

int main ()
{
	FILE *f = NULL;
	char tmp[1024]={0};
	int i=0,t;
	char *p = NULL;
	f = fopen("tmp.iii","r");
	if(NULL == f){
		fprintf(stderr, "%s\n", "Open File Error!");
	}
#if 0
	fgets(tmp,1024,f);
	printf("%s", tmp);

	fgets(tmp,1024,f);
	printf("%s", tmp);

	fgets(tmp,1024,f);
	printf("%s", tmp);
#endif
	while(fgets(tmp,1024,f)){
		i++;
		//printf("%d.%s",i,tmp);
		p = strstr(tmp,"=");		
		if(p){
			//printf("%s\n",p);
			t = atoi(p+1);
			printf("%d\n", t);
		}
	}

	fclose(f);

	return 0;
}




#endif