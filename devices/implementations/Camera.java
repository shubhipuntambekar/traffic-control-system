package devices.implementations;

import commons.DeviceState;
import devices.Device;
import org.json.JSONObject;

public class Camera implements Device {
    private DeviceState state;
    @Override
    public DeviceState getState() {
        return state;
    }

    @Override
    public void setState(DeviceState state) {
        this.state = state;
    }
    @Override
    public JSONObject sendData() {
        return new JSONObject() {{
            put("no_of_vehicles", 20);
        }};
    }
}
