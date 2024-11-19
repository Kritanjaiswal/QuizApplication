package org.example;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;  // to use this firstly we need to add a dependency in pom file, ye hame context ka class lakar dega

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");  //Ham yaha context ka object bana rahe hai aur Beans.xml ke madata se kon kon se class ko IOC container me register karna hai wo pata kar rahe hai
//        Car car=context.getBean(Car.class);// Method to retrieve Car spring bean from IOC container
//        car.drive();// we are calling drive method
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        Car car1=factory.getBean(Car.class);
//        Car car2=factory.getBean(Car.class);
        System.out.println(car1);
//        System.out.println(car2);
        car1.drive();
    }
}