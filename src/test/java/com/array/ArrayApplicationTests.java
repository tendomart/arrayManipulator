package com.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.StringWriter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ArrayApplicationTests {

	@Autowired
	ArrayReader arrayReader;
	@Test
	void contextLoads() {
		 arrayReader = new ArrayReader();
	}

	public void shouldReadArray(){ }
}
