package devices;

import commons.DeviceState;

public interface Device {

    public DeviceState getState();
    public void sendData();

}
