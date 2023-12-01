package devices;

import commons.DeviceState;
import org.json.JSONObject;

public interface Device {
    public DeviceState getState();
    public void setState(DeviceState state);
    public JSONObject sendData();
}
