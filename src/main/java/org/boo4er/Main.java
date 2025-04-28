package org.boo4er;

public class Main {
    public static void main(String[] args) {
        Device device = new Device(
                "Samsung",
                "A520",
                "4h14h15g124hg",
                "Клиент долбаеб") {
            @Override
            public String getDeviceType() {
                return null;
            }
        };
        System.out.println(device.toString());
    }
}