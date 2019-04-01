package com.nt.beans;

public class VotingEligibility {
			private String name;
			private int age;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			
			public String checkingEligibility() {
				if(age>18)
					return  name+"U r  eligible for voting";
				else
					return  name+" u r not eligible for voting";
							
			}
	
			
			
			
		
}
