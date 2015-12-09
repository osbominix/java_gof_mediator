package com.gof.designpattern.mediator;

import com.gof.designpattern.mediator.basis.Aircraft;

import java.util.Date;

/**
 * Created by yl3 on 09.12.15.
 */
public class AirTrafficControlCenter {



    public static void doMediator(Aircraft aircraft, String request) {

        String response = "please waiting ...";
        if ("ask for landing".equals(request)) {
            response = " please landing";
        } else if (("ask for launch").equals(request)) {
            response = " please take off";
        }


        System.out.println(new Date().toString() + ":" + aircraft.getIdentifier() + response);
    }
}
