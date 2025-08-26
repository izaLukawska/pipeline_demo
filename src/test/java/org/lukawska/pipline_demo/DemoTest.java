package org.lukawska.pipline_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

	@Test
	void hello() {
		Demo demo = new Demo();
		assertEquals("Hello", demo.hello());
	}
}