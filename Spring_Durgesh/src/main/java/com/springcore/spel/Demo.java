package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22+11}")
	private int x;
	@Value( "#{5}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{new java.lang.String('Ankit Keshri')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the z
	 */
	public double getZ() {
		return z;
	}
	/**
	 * @param z the z to set
	 */
	public void setZ(double z) {
		this.z = z;
	}
	
	
	/**
	 * @return the e
	 */
	public double getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(double e) {
		this.e = e;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
	
	
	

}
