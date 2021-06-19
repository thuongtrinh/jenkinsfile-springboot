package com.txt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinsPiplelineApplicationTests {

	@Test
	public void contextLoads() {
		assertEquals(0, 0);
	}

	@Test
	public void contextTest_001() {
		assertEquals(1, 1);
	}
}
