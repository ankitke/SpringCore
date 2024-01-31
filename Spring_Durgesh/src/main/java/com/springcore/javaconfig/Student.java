package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	
	private Samosa samosa;
	
	
	/**
	 * @return the samosa
	 */
	public Samosa getSamosa() {
		return samosa;
	}


	/**
	 * @param samosa the samosa to set
	 */
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public void studey() {
		this.samosa.display();
		System.out.println("Student is reading book");
	}

}
