package org.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
        Emp emp = (Emp) context.getBean("Emp1");
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAddress());
        System.out.println(emp.getCourses());
    }
}
