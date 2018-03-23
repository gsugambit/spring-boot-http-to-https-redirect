package com.raymond;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.gsugambit.Application;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { Application.class })
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
