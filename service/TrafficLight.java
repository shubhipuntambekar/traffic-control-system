package service;

import commons.TrafficLightState;

public class TrafficLight {

    private TrafficLightState trafficLightState;

    public TrafficLight() {
        trafficLightState = TrafficLightState.RED;
    }

    public TrafficLightState getState() {
        return trafficLightState;
    }

    public void changeState(TrafficLightState state) {
        trafficLightState = state;
        System.out.printf("State changed to: "+trafficLightState);
    }
}
