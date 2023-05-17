package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Noel\\hooks.feature",glue="org.hooks",monochrome=true
)
 
public class TestRunnerFile {
	
	
}
