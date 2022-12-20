package org.kc.samples.udemy.spring.services;

import org.kc.samples.udemy.spring.interfaces.Speakers;
import org.kc.samples.udemy.spring.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class VehicleServices {
    final static Logger logger = Logger.getLogger("VehicleServices.class");
    private Speakers speakers;
    private Tyres tyres;
    @Autowired
    public VehicleServices(Speakers speakers, Tyres tyres){
        this.speakers = speakers;
        this.tyres = tyres;
    }

    public void playMusic() {
        logger.info(speakers.makeSound());
    }

    public void moveVehicle(){
        logger.info(tyres.rotate());
    }
}
