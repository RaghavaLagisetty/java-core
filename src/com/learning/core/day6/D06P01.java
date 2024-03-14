package com.learning.core.day6;
import java.util.LinkedHashMap;
import java.util.Map;

public class D06P01 {
public static void main(String[] args) {
	LinkedHashMap<String,String> pb=new LinkedHashMap<>();
	
	pb.put("Amal","998787823");
	pb.put("Manvitha","937842978");
	pb.put("Joseph","7882221113");
	pb.put("Smith","8293893311");
	pb.put("Kathe","7234560011");
	
	for (Map.Entry<String, String> entry : pb.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
}
