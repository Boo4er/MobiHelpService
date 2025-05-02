package org.boo4er;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

//🧙♂️
public class RepairService {
    private final List<Client> clients;
    private final List<Device> devicesInRepair;


    public RepairService() {
        this.clients = new ArrayList<>();
        this.devicesInRepair = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    boolean deleteClientByName(String clientName) {
        Iterator<Client> iterator = clients.iterator();
        while (iterator.hasNext()) {
            Client client = iterator.next();
            if (clientName.equals(client.getName())) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public Client findClientByName(String clientName) {
        Iterator<Client> iterator = clients.iterator();
        while (iterator.hasNext()) {
            Client client = iterator.next();
            if (clientName.equals(client.getName())) {
                return client;
            }
        }
        return null;
    }

    public List<Client> findAllClientsByBrand(String brand) {
        List<Client> result = new ArrayList<>();
        Iterator<Client> iterator = clients.iterator();
        while (iterator.hasNext()) {
            Client client = iterator.next();
            Iterator<Device> deviceIterator = client.getDevices().iterator();
            boolean found = false;
            while (deviceIterator.hasNext() && !found) {
                Device device = deviceIterator.next();
                if (device.getBrand().equalsIgnoreCase(brand)) {
                    found = true;
                }
            }
            if (found) {
                result.add(client);
            }
        }
        return result;
    }

    boolean editClientName(String oldName, String newName) {
        boolean found = false;
        ListIterator<Client> iterator = clients.listIterator();
        while (iterator.hasNext()) {
            Client client = iterator.next();
            if (oldName.equals(client.getName())) {
                client.setName(newName);
                found = true;
            }
        }
        return found;
    }

    public void addDeviceInRepair(Device device) {
        devicesInRepair.add(device);
    }

    boolean deleteDeviceInRepair(String deviceSerialNumber) {
        boolean removed = false;
        Iterator<Device> iterator = devicesInRepair.iterator();
        while (iterator.hasNext()) {
            Device device = iterator.next();
            if (deviceSerialNumber.equalsIgnoreCase(device.getSerialNumber())) {
                iterator.remove();
                removed = true;
            }
        }
        return removed;
    }

    public List<Client> getAllClientsList() {
        return new ArrayList<Client>(clients);
    }

    public List<Device> getAllDevicesInRepairList() {
        return new ArrayList<Device>(devicesInRepair);
    }

    public List<Device> getDevicesByType(Class<? extends Device> deviceType) {
        return devicesInRepair.stream()
                .filter(deviceType::isInstance)
                .collect(Collectors.toList());//🐦🌻
    }
}
