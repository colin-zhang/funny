TARGET_LIB=hello.dll
 
CFLAGS  = -Wall  -Wl,--kill-at -D_JNI_IMPLEMENTATION  -shared -I.  -I"C:\Program Files\Java\jdk1.7.0_67\include" -I"C:\Program Files\Java\jdk1.7.0_67\include\win32"
CC      = gcc    

all:$(TARGET_LIB)
$(TARGET_LIB):hello.c
	$(CC) $(CFLAGS) -o $@ $<
	
clean:  
	rm -rf *.o $(TARGET_LIB)   
  
.PHONY: all clean install  