package org.boo4er;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public boolean deletedClientByName(String clientName) {
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
}
