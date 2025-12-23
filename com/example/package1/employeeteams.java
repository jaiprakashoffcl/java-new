package com.example.package1;

import java.util.*;

public class employeeteams {

	public static void main(String[] args) {
		        Set<String> teamA = new HashSet<>();
		        Set<String> teamB = new HashSet<>();

		        teamA.add("Alice");
		        teamA.add("Bob");
		        teamA.add("Charlie");
		        teamA.add("David");

		        teamB.add("Charlie");
		        teamB.add("David");
		        teamB.add("Eve");
		        teamB.add("Frank");

		        Set<String> common = new HashSet<>(teamA);
		        for (String employee : teamA) {
		            if (teamB.contains(employee)) {
		                common.add(employee);
		            }
		        }
		        System.out.println("Common employees: " + common);

		        Set<String> uniqueA = new HashSet<>(teamA);
		        uniqueA.removeAll(teamB);
		        System.out.println("Unique in Team A: " + uniqueA);

		        Set<String> uniqueB = new HashSet<>(teamB);
		        uniqueB.removeAll(teamA);
		        System.out.println("Unique in Team B: " + uniqueB);

		        Set<String> eitherTeam = new HashSet<>(teamA);
		        eitherTeam.addAll(teamB);
		        System.out.println("Employees in either team: " + eitherTeam);


	}

}
