package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String subject;

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("start method");
	}

	@PreDestroy
	public void end()
	{
		System.out.println("ending method");
	}

}
