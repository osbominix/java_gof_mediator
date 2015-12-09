package com.gof.designpattern;

import com.gof.designpattern.mediator.AirTrafficControlCenter;
import com.gof.designpattern.mediator.basis.Airbus;
import com.gof.designpattern.mediator.basis.Aircraft;
import com.gof.designpattern.mediator.basis.Jet;

/**
 * Created by yl3 on 09.12.15.
 */
public class CommandCenter {



    public static void main(String[] args) {
        Airbus airbus001 = new Airbus(001);
        Airbus airbus002 = new Airbus(002);
        Jet jet001 = new Jet(001);

        AirTrafficControlCenter.doMediator(airbus001, Aircraft.ASK_FOR_LANDING);
        AirTrafficControlCenter.doMediator(airbus002, Aircraft.ASK_FOR_LAUNCH);
        AirTrafficControlCenter.doMediator(jet001, Aircraft.ASK_FOR_LAUNCH);

    }
}
