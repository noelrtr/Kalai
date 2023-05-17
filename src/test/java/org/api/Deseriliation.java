package org.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deseriliation {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file =new File("src\\test\\resources\\json\\new.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		RootClass readValue = mapper.readValue(file, RootClass.class);
		
	    System.out.println(readValue.getId());
	    System.out.println(readValue.getName());
	    System.out.println(readValue.isworkingstatus());
	    
	    studentinfo studentinfo = readValue.getStudentinfo();
	    
	    System.out.println(studentinfo.getId());
	    System.out.println(studentinfo.getName());
	    
	    ArrayList course = readValue.getCourse();
	    
	    for (int i = 0; i < course.size(); i++) {
	    	System.out.println(course.get(i));
	    	
			
		}
	    
		
	

	}

}
