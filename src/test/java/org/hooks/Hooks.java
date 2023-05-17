package org.hooks;

import org.base.BaseClass;
import org.junit.After;

import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void method() {

		browserLaunch("https://www.facebook.com/");
		System.out.println("step1");
		
	
		
	}
	@After
	public void method2() {
		System.out.println("successful login");
		System.out.println("step4");

	}

}
