package com.gof.designpattern.mediator.basis;

/**
 * Created by yl3 on 09.12.15.
 */
public class Airbus implements Aircraft {

    String identifier;


    public Airbus(int id) {
        this.identifier = "Airbus-" + id;
    }

    public void flyRouter() {
        System.out.println(identifier +  " flies from C to D");
    }

    public String getIdentifier() {
        return identifier;
    }
}
