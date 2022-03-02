package com.example;



import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


 
  
  
  
 // @RunWith(Cucumber.class)
  
  @CucumberOptions(
  features="D:\\Training workspace\\Demo-PAroject\\src\\test\\java\\feature\\Demo.feature"
  , glue={"com.example"}, plugin= {"pretty",
  "json:target/HTmlreports2.json"},monochrome=true,dryRun=true,
  tags="@tag1") public class TestRunner extends AbstractTestNGCucumberTests{
  
  }
  
 