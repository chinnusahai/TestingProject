package org.junitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ProjectJunit {
	@Test
	public void tc5()	{
		System.out.println(" test case 5");
	}@Before
	public void startdate() {
		System.out.println("tc start Date and time");
	}@After
	public void Enddate() {
		System.out.println("tc End  Date and time");
	}@BeforeClass
	public static void launch() 
	//should be public and static
	{
		System.out.println("launch the browser");
	}@AfterClass
	public static void launchclose() 
	//should be public and static
	{
		System.out.println("close the browser");
	}
	@Test
	@Ignore
	public void tc3() 
	{
		System.out.println(" test case 3");
	}@Test
	public void tc1() 
	{
		System.out.println(" test case 1");
	}@Test
	public void tc4() 
	{
		System.out.println(" test case 4");
	}@Test
	public void tc2() 
	{
		System.out.println(" test case 2");
	}
}
