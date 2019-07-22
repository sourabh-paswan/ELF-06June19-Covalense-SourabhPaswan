package com.covalense.java.junittestfiles;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, BooleanOprTest.class, MathOprTest.class, StringOprTest.class,
		StringOutputMulValues.class })

public class AllTests {

}
