package org.lukawska.pipline_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo1Test {

    @Test
    void sayHello() {
        Demo1 demo1 = new Demo1();
        assertEquals("Hello World!", demo1.sayHello());
    }
}