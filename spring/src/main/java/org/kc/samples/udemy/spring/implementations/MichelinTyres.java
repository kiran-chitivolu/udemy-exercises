package org.kc.samples.udemy.spring.implementations;

import org.kc.samples.udemy.spring.interfaces.Tyres;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Component
public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Movement with Michelin Tyres";
    }
}
