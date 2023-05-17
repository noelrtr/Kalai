package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void report(String jsonfile) {

		
		File file =new File("C:\\Users\\DELL\\Desktop\\CucumberPractice\\src\\test\\resources\\Report");
		
		Configuration config=new Configuration(file, "Facebook");
		config.addClassifications("os", "windows");
		config.addClassifications("testno", "3");
		config.addClassifications("Browser", "Chrome");
		
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonfile);
		
		ReportBuilder builder= new ReportBuilder(jsonFiles, config);
		
		builder.generateReports();
		
		
		
	}
}
