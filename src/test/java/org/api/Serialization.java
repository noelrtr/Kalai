package org.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {
	
	public static void main(String[] args) throws  IOException {
	
	File file = new File("src\\test\\resources\\json\\new1.json");
	
	ObjectMapper mapper = new ObjectMapper();
	
	ArrayList<String >course = new ArrayList<String>();
	course.add("java");
	course.add("selenium");
	
	studentinfo studentinfo = new studentinfo(122, "Kalaifrnd");
	
	RootClass root = new RootClass(111, "Kalaifrnd", true, studentinfo, course);
	
	mapper.writeValue(file, root);
	
	
	
	}	

}
