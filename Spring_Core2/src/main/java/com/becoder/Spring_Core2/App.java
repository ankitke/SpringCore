package com.becoder.Spring_Core2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.resource.SpringConfigFile;
import org.springframework.context.*;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
//        Student std=(Student) context.getBean("stdId1");
//        std.display();
        Student std=context.getBean(Student.class);
        std.display();
    }
}
