package org.boo4er;

import java.lang.invoke.StringConcatFactory;

public class Smartphone extends Device {
    private String imei;
    private String os;

    public Smartphone(String brand,
                      String model,
                      String serialNumber,
                      String problemDescriprion,
                      String imei,
                      String os
    ) {
        super(brand, model, serialNumber, problemDescriprion);
        setImei(imei);
        setOs((os));
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String getDeviceType() {
        return "Смартфон";
    }
}
