package com.fortunaglobal.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
   // public static webDriver driver;
    @BeforeSuite
    public void setUp(){}
    @AfterSuite
    public void tearDown(){}
}
