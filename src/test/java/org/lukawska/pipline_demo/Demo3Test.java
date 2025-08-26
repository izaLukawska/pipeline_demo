package org.lukawska.pipline_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Demo3Test {

    @Test
    void sayHello() {
        Demo3 demo3 = new Demo3();
        assertEquals("Hello World!", demo3.sayHello());
    }
}