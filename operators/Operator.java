package operators;

import commons.DeviceState;

public interface Operator {
    public void setState(DeviceState state);
    public DeviceState getState();
}
