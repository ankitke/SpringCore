package com.springcore.ref;

public class A {
	
	private int x;
	
	private B ob;

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
	 * @return the ob
	 */
	public B getOb() {
		return ob;
	}

	/**
	 * @param ob the ob to set
	 */
	public void setOb(B ob) {
		this.ob = ob;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	
	

}
