#include "Hello.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_Hello_displayHelloWorld
(JNIEnv *, jobject)
{
    printf("Hello World!\n");
    return;
}