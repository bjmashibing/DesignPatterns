package com.shenyy.dp.mediator.example;

public class MediatorExample {
    public static void main(String[] args) {
        IATCMediator atcMediator = new ATCMediator();
        Flight Mu12321 = new Flight(atcMediator);
        Runway _18R = new Runway(atcMediator);

        atcMediator.registerFlight(Mu12321);
        atcMediator.registerRunway(_18R);

        Mu12321.getReady();
        _18R.land();
        Mu12321.land();
    }
}
