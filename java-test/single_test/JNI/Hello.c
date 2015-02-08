#include "Hello.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_Hello_displayHelloWorld
(JNIEnv * d, jobject f)
{
    printf("Hello World!\n");
    return;
}