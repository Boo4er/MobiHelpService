package org.boo4er;

abstract class Device {
    private String brand;
    private String model;
    private String serialNumber;
    private String problemDescription;

    public Device(String brand, String model, String serialNumber, String problemDescription) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.problemDescription = problemDescription;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public abstract String getDeviceType();

    @Override
    public String toString() {
        return getDeviceType() + ": " + brand + " " + model +
                " (SN: " + serialNumber + ") - Проблема: " + problemDescription;
    }
}
