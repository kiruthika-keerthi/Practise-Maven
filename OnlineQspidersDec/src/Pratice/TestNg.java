package Pratice;

import org.testng.annotations.Test;


public class TestNg {

	@Test(invocationCount = 4)
	public void create()
	{
System.out.println("m1 running");
	}
	
	@Test
	public void modify()
	{
		System.out.println("m2 running");
	}
	

	@Test
	public void delete()
	{
		System.out.println("m3 running");
	}
}
