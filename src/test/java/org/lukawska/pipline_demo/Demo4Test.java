package org.lukawska.pipline_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo4Test {
    @Test
    void sayHello() {
        Demo4 demo4 = new Demo4();
        assertEquals("Hello World!", demo4.sayHello());
    }
}