package org.boo4er;

import java.util.Scanner;

public class RepairServiceApp {
    private static RepairService repairService = new RepairService();
    private static Scanner scanner = new Scanner(System.in);

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

        while (true) {
            System.out.println("\n1. Добавить клиента");
            System.out.println("2. Найти клиента по имени");
            System.out.println("3. Найти клиентов по бренду устройства");
            System.out.println("4. Редактировать имя клиента");
            System.out.println("5. Добавить устройство клиенту");
            System.out.println("6. Добавить устройство в ремонт");
            System.out.println("7. Удалить клиента");
            System.out.println("8. Удалить устройство из ремонта");
            System.out.println("9. Вывести всех клиентов");
            System.out.println("10. Вывести все устройства в ремонте");
            System.out.println("11. Вывести устройства по типу");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        аddClient(scanner, repairService);
                        break;
                    case 2:
                        findClientByName(scanner, repairService);
                        break;
                    case 3:
                        findAllClientsByBrand(scanner, repairService);
                        break;
                    case 4:
                        editClientName(scanner, repairService);
                        break;
                    case 5:
                        addDeviceToClient(scanner, repairService);
                        break;
                    case 6:
                        addDeviceInRepair(scanner, repairService);
                        break;
                    case 7:
                        deleteClientByName(scanner, repairService);
                        break;
                    case 8:
                        deleteDeviceInRepair(scanner, repairService);
                        break;
                    case 9:
                        getAllClientsList(scanner, repairService);
                        break;
                    case 10:
                        getAllDevicesInRepairList(scanner, repairService);
                        break;
                    case 11:
                        getDevicesByType(scanner, repairService);
                        break;
                    case 0:
                        System.out.println("Выход из программы");
                        return;
                    default:
                        System.out.println("Неверное значение");
                }
            } catch (Exception e) {
                System.out.println("Пожалуйста, введите цифру.");
                scanner.next();
            }

        }

    }

    private static void getDevicesByType(Scanner scanner, RepairService repairService) {

    }

    private static void getAllDevicesInRepairList(Scanner scanner, RepairService repairService) {

    }

    private static void getAllClientsList(Scanner scanner, RepairService repairService) {

    }

    private static void deleteDeviceInRepair(Scanner scanner, RepairService repairService) {

    }

    private static void deleteClientByName(Scanner scanner, RepairService repairService) {

    }

    private static void addDeviceInRepair(Scanner scanner, RepairService repairService) {

    }

    private static void addDeviceToClient(Scanner scanner, RepairService repairService) {

    }

    private static void editClientName(Scanner scanner, RepairService repairService) {

    }

    private static void findAllClientsByBrand(Scanner scanner, RepairService repairService) {
    }

    private static void findClientByName(Scanner scanner, RepairService repairService) {

    }

    private static void аddClient(Scanner scanner, RepairService repairService) {
        System.out.println("addClient");
    }
}