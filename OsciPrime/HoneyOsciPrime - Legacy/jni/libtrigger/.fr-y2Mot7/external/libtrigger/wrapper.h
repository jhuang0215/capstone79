/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class TestBench */

#ifndef _Included_TestBench
#define _Included_TestBench
#ifdef __cplusplus
extern "C" {
#endif
#undef TestBench_TYPE_NATIVE
#define TestBench_TYPE_NATIVE 0L
#undef TestBench_TYPE_JAVA
#define TestBench_TYPE_JAVA 1L
#undef TestBench_NATIVE_BUFFER_SIZE
#define TestBench_NATIVE_BUFFER_SIZE 198144L
/*
 * Class:     TestBench
 * Method:    trigger
 * Signature: (Ljava/nio/ByteBuffer;IB)I
 */
JNIEXPORT jint JNICALL Java_Trigger_trigger
  (JNIEnv *, jclass, jobject, jint, jbyte);
  

/*
 * Class:     TestBench
 * Method:    allocByteBuffer
 * Signature: (I)Ljava/nio/ByteBuffer;
 */
JNIEXPORT jobject JNICALL Java_Trigger_allocByteBuffer
  (JNIEnv *, jclass, jint);

#ifdef __cplusplus
}
#endif
#endif
