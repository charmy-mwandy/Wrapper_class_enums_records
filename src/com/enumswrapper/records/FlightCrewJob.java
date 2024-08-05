package com.enumswrapper.records;

public enum FlightCrewJob {
    FLIGHT_ATTENDANT("Flight Attendant"),
    COPILOT("First Officer"),
    PILOT("Captain");
    private String title;
    public String getTitle(){
        return title;
    }

    FlightCrewJob(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
