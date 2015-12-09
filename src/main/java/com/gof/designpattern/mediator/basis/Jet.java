package com.gof.designpattern.mediator.basis;

/**
 * Created by yl3 on 09.12.15.
 */
public class Jet implements Aircraft {

    private String identifier;

    public Jet(int id) {
        this.identifier = "Jet-" + id;
    }

    public void flyRouter() {
        System.out.println("Jet-"+ identifier +  " flies from A to B");
    }

    public String getIdentifier() {
        return identifier;
    }
}
