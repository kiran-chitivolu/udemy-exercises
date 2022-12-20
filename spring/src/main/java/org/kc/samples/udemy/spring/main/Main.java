package org.kc.samples.udemy.spring.main;

import org.kc.samples.udemy.spring.beans.Person;
import org.kc.samples.udemy.spring.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    final static Logger logger = Logger.getLogger("Main.class");

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person lucy = applicationContext.getBean(Person.class);
        lucy.printHello();
        logger.info("Name of personBean # " + lucy.getName());
        logger.info("Vehicle Driven By Lucy" + lucy.getVehicle().getName());
        lucy.getVehicle().getVehicleServices().playMusic();
        lucy.getVehicle().getVehicleServices().moveVehicle();
    }
}
