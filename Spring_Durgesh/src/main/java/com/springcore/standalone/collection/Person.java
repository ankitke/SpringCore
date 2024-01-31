package com.springcore.standalone.collection;

import java.util.*;

import org.springframework.context.annotation.Scope;
@Scope("prototype")
public class Person {
	
	private Map<String, Integer> feestructure;
	private Properties properties;

	/**
	 * @return the feestructure
	 */
	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	/**
	 * @param feestructure the feestructure to set
	 */
	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}
	
	

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [feestructure=" + feestructure + "]";
	}
	
	
	
}
