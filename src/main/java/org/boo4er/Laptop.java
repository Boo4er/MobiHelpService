package org.boo4er;

public class Laptop extends Device {
    private String os;
    private static final String DEVICE_TYPE = "Ноутбук";

    public Laptop(String brand,
                  String model,
                  String serialNumber,
                  String problemDescription,
                  String os
    ) {
        super(brand, model, serialNumber, problemDescription);
        setOs(os);
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String getDeviceType() {
        return DEVICE_TYPE;
    }
}
