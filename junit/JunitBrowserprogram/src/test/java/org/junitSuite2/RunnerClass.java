package org.junitSuite2;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunnerClass {
	@Test
	public void tc1() {
		Result rc = JUnitCore.runClasses(A.class,B.class,FbLoginJunit.class);
		
		System.out.println("total tc run	"+ rc.getRunCount());
		System.out.println("total tc run time	"+ rc.getRunTime());
		System.out.println("total tc failure count	"+ rc.getFailureCount());
		System.out.println("total tc ignored"+ rc.getIgnoreCount());
		System.out.println("total tc failure"+ rc.getFailures());
	}
}
