package org.lukawska.pipline_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo2Test {

    @Test
    void sayHello() {
        Demo2 demo2 = new Demo2();
        assertEquals("Hello World!", demo2.sayHello());
    }
}