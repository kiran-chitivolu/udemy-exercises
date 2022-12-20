package org.kc.samples.udemy.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="personBean")
public class Person {

    private String name =  "Lucy";
    private final Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public void printHello(){
        System.out.println(
                "Printing Hello from Component Person Bean");
    }

    @Override
    public String toString(){
        return "Person name is - "+name;
    }
}
