package org.kc.samples.udemy.spring.implementations;

import org.kc.samples.udemy.spring.interfaces.Speakers;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
         return "Sound from BOSE Speakers";
    }
}
