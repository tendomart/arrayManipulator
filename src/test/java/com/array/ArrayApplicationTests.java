package com.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArrayApplicationTests {

	@Autowired
	ArrayReader arrayReader;
	@Test
	void contextLoads() {
		 arrayReader = new ArrayReader();
	}

	@Test
	public void shouldReadArray(){

	}
}
