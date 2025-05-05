package org.boo4er;

import java.util.Scanner;

public class RepairServiceApp {
    private RepairService repairService = new RepairService();
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
        int choice = scanner.nextInt();
    }




}