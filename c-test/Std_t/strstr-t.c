#include<string.h>
#include<stdio.h>
#include<stdlib.h>

int main()
{
 char *p="hello worldxxx";
 char *p2="world";
 char *p3= NULL;
 p3 = strstr(p,p2);
 printf("p3 %s\n",p3);
 int a ;
 a = system("ls"); 
 printf("a=%d\n",a);
}

/*
cygwin

$ ./strstr-t.exe
ctime-test.c  FILE_t  strstr-t.c  strstr-t.exe  strtok.c  strtok.exe
p3 worldxxx
a=0

*/