package com.shenyy.dp.mediator.example;

public class Flight implements Command {
    private IATCMediator atcMediator;

    public Flight(IATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if (atcMediator.isLandingOk()) {
            System.out.println("Successfully Landed.");
            atcMediator.setLandingStatus(true);
        } else {
            System.out.println("Waiting for landing.");
        }
    }

    public void getReady()
    {
        System.out.println("Ready for landing.");
    }
}
