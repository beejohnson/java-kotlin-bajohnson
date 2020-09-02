package com.example.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    // 8 primitive types in Java

    //boolean - true or false
    //byte - -128 .. 127
    //char - 0 .. 65_536 (used to be any 1 unicode char LIE).
    //int - (4 bytes -2 billion .. +2 billion)
    //short - -32_768 .. 32_767
    //long (8 bytes -(2^63-1) .. +2^63
    //float - IEEE float 4 bytes 7 digits of precision 10^( pm 30 )
    //double - IEEE double 8 bytes 15 digits of precision 10^(pm 300)

    // All other values are references (pointers) to Objects or null (null pointer)
}