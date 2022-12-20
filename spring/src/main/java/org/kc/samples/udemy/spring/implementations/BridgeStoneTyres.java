package org.kc.samples.udemy.spring.implementations;

import org.kc.samples.udemy.spring.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Movement with BridgeStone Tyres";
    }
}
