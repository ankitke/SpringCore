package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/spel/aloneconfig.xml");
		Demo d1=(Demo) context.getBean("demo");
		System.out.println(d1);
		
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression expression=temp.parseExpression("22+43");
		System.out.println(expression.getValue());
	}

	

}
