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
                int choice = Integer.parseInt(scanner.nextLine());
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
                scanner.nextLine();
            }

        }

    }

    private static void getDevicesByType(Scanner scanner, RepairService repairService) {

    }

    private static void getAllDevicesInRepairList(Scanner scanner, RepairService repairService) {

    }

    private static void getAllClientsList(Scanner scanner, RepairService repairService) {
        System.out.println(repairService.getAllClientsList());

    }

    private static void deleteDeviceInRepair(Scanner scanner, RepairService repairService) {
        System.out.print("Введите серийный номер: ");
        String serial = scanner.nextLine();
        repairService.deleteDeviceInRepair(serial);
    }

    private static void deleteClientByName(Scanner scanner, RepairService repairService) {
        System.out.print("Введите имя клиента: ");
        String name = scanner.nextLine();
        repairService.deleteClientByName(name);
    }

    private static void addDeviceInRepair(Scanner scanner, RepairService repairService) {

    }

    private static void addDeviceToClient(Scanner scanner, RepairService repairService) {
        System.out.println("Введите имя клиента");
        String name = scanner.nextLine();
        Client client = repairService.findClientByName(name);
        if (client == null) {
            System.out.println("Клиент не найден");
            return;
        }
        System.out.println("Введите тип устройства");
        System.out.println("1. ноутбук");
        System.out.println("2. смартфон");
        System.out.println("3. Настольный коспьютер");
        System.out.print("Ваш выбор: ");
        int type = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите бренд: ");
        String brand = scanner.nextLine();
        System.out.print("Введите модель: ");
        String model = scanner.nextLine();
        System.out.print("Введите серийный номер: ");
        String serial = scanner.nextLine();
        System.out.print("Опишите проблему: ");
        String problem = scanner.nextLine();

        try {
            Device device;
            switch (type) {
                case 1:
                    System.out.println("Введите О.С.: ");
                    String os = scanner.nextLine();
                    device = new Laptop(brand, model, serial, problem, os);
                    break;
                case 2: {
                    System.out.println("Введите Imei :");
                    String imei = scanner.nextLine();
                    device = new Smartphone(brand, model, serial, problem, imei, "os");
                    break;
                }
                case 3: {
                    System.out.println("Введите ");
                    String cpu = scanner.nextLine();
                    device = new Desktop(
                            brand,
                            model,
                            serial,
                            problem,
                            cpu,
                            "AMD",
                            2048,
                            4084,
                            "os"
                    );
                    break;
                }
                default:
                    throw new IllegalArgumentException("Неверный тип устройства");

            }

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }

    private static void editClientName(Scanner scanner, RepairService repairService) {

    }

    private static void findAllClientsByBrand(Scanner scanner, RepairService repairService) {
    }

    private static void findClientByName(Scanner scanner, RepairService repairService) {

    }

    private static void аddClient(Scanner scanner, RepairService repairService) {
        System.out.println("Введите имя клиента:");
        String name = scanner.nextLine();
        System.out.println("Введите телефон клиента:");
        String phone = scanner.nextLine();
        System.out.println("Введите email клиента (не обязателоно):");
        String email = scanner.nextLine().trim();
        repairService.addClient(new Client(name, phone, email.isEmpty() ? null : email));
        System.out.println("Клиент добавлен");
    }
}
