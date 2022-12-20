package org.kc.samples.udemy.spring.implementations;

import org.kc.samples.udemy.spring.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {
         return "Sound from SONY Speakers";
    }
}
