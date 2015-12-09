package com.gof.designpattern.mediator.basis;

/**
 * Created by yl3 on 09.12.15.
 */
public interface Aircraft {

    static final String  ASK_FOR_LAUNCH = "ask for launch";
    static final String  ASK_FOR_LANDING = "ask for landing";


    String getIdentifier();
    void flyRouter();
}
