package org.lukawska.pipline_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {

    @Test
    void sayHello() {
        DemoService demoService = new DemoService();
        assertEquals("Hello!", demoService.sayHello());
    }
}