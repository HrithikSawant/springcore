package org.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("stereoconfig.xml");
       Student student = context.getBean("ob",Student.class);
        System.out.println(student);
        System.out.println("-------------------------------------------");
        System.out.println(student.getSubjects());
        System.out.println(student.getSubjects().getClass().getName());
        System.out.println("--------------------checking singleton Pattern or prototype-----------------------");
        System.out.println(student.hashCode());
        Student student1 = context.getBean("ob",Student.class);
        System.out.println(student1.hashCode());
        System.out.println("--------------------checking Prototype Pattern-----------------------");
        System.out.println("Prototype using XML");
        Teacher teacher = context.getBean("teacher",Teacher.class);
        System.out.println(teacher.hashCode());
        Teacher teacher1 = context.getBean("teacher",Teacher.class);
        System.out.println(teacher1.hashCode());


    }
}
