package org.boo4er;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    private String name;
    private String phone;
    private String email;
    private final List<Device> devices;

    public Client(String name,
                  String phone,
                  String email) {
        setName(name);
        setPhone(phone);
        setEmail(email);
        this.devices = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Device> getDevices() {
        return new ArrayList<>(devices);
    }

    public void setDevices(Device device) {
        devices.add(device);
    }

    public boolean removeDevice(String serialNumber) {
        Iterator<Device> iterator = devices.iterator();
        while (iterator.hasNext()) {
            Device device = iterator.next();
            if (serialNumber.equals((device.getSerialNumber()))) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public Device findDeviceBySerialNumber(String serialNumber) {
        Iterator<Device> iterator = devices.iterator();
        while (iterator.hasNext()) {
            Device device = iterator.next();
            if (serialNumber.equals(device.getSerialNumber())) {
                return device;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Клиент: " + name + ", тел.: " + phone +
                (email != null ? ", email: " + email : "") +
                ", устройств: " + devices.size() + " шт.";
    }
}
