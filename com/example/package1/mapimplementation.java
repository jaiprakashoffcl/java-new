package com.example.package1;

import java.util.*;

public class mapimplementation {

	public static void main(String[] args) {
		
		Map<String,Integer> scores = new HashMap<>();
		scores.put("John", 90);
		scores.put("Vemal", 80);
		scores.put("Ajay", 70);
		scores.put("Ajay", 70);
		
		System.out.println(scores.get("John"));
		System.out.println(scores.containsKey("Vemal"));
		System.out.println(scores.containsValue(80));
		System.out.println(scores.size());
		System.out.println(scores.remove("John"));

	}

}
