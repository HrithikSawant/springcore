package org.springcore.LifeCycle;

import org.springcore.standaloneCollection.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        //regitering shutdownhook
        context.registerShutdownHook();

//       Product product1 = context.getBean("Tshirt",Product.class);
//        System.out.println(product1);
//
//        System.out.println("------------------------------------------------------");
//       Book book = context.getBean("book",Book.class);
//        System.out.println(book);

        System.out.println("------------------------------------------------------");
        Sample sample = context.getBean("sample",Sample.class);
        System.out.println(sample);
    }
}
