// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// 4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package FinalTask;

import java.util.ArrayList;
import java.util.Scanner;


public class database {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");

        ArrayList<Laptop> laptops = new ArrayList<>();

        Laptop laptop1 = new Laptop("ASUS", 15, 16, 512, "Windows 11", 1.7, 10, 45000);
        laptops.add(laptop1);

        Laptop laptop2 = new Laptop("Dell", 14, 8, 256, "Windows 10", 1.4, 7, 55000);
        laptops.add(laptop2);

        Laptop laptop3 = new Laptop("Lenovo", 13, 8, 128, "Linux", 1.1, 13, 62500);
        laptops.add(laptop3);

        Laptop laptop4 = new Laptop("Acer", 14, 16, 256, "Windows 11", 1.2, 11, 42500);
        laptops.add(laptop4);

        Laptop laptop5 = new Laptop("Apple", 13, 8, 512, "macOS", 1.3, 11, 71000);
        laptops.add(laptop5);

        Laptop laptop6 = new Laptop("HP", 15, 16, 512, "Windows 11", 1.3, 10, 115500);
        laptops.add(laptop6);

        Laptop laptop7 = new Laptop("ASUS", 16, 16, 256, "Linux", 1.9, 7, 122500);
        laptops.add(laptop7);

        Laptop laptop8 = new Laptop("MSI", 17, 64, 512, "Windows 11", 2.5, 7, 125000);
        laptops.add(laptop8);

        Laptop laptop9 = new Laptop("Acer", 15, 4, 128, "Linux", 2.5, 5, 45000);
        laptops.add(laptop9);

        Laptop laptop10 = new Laptop("Dell", 16, 64, 512, "Linux", 4.3, 4, 199999);
        laptops.add(laptop10);

        System.out.println("Вывод списка ноутбуков: ");
        System.out.println(laptops);

        Laptop criteria = new Laptop("no", 0, 0, 0, "no", 0, 0, 0);
                      
        while (true) {

            System.out.println(
                    "Чтобы задать фильтр нажмите цифру:\n0 - модель\n1 - размер дисплея\n2 - объем ОЗУ\n3 - объем диска\n4 - операционная система\n5 - вес\n6 - время работы аккумулятора\n7 - цена\n8 - выход");

            String str = sc.nextLine();

            if (str.equals("0")) {
                System.out.println("Задайте модель: ");
                String str0 = sc.nextLine();
                criteria.setModel(str0);
            }

            if (str.equals("1")) {
                System.out.println("Задайте min размер дисплея в дюймах: ");
                String str1 = sc.nextLine();
                int number1 = Integer.valueOf(str1);
                criteria.setDisplaySize(number1);
            }

            if (str.equals("2")) {
                System.out.println("Задайте min объем ОЗУ в Гб: ");
                String str2 = sc.nextLine();
                int number2 = Integer.valueOf(str2);
                criteria.setRAMsize(number2);
            }

            if (str.equals("3")) {
                System.out.println("Задайте min объем жёсткого диска в Гб: ");
                String str3 = sc.nextLine();
                int number3 = Integer.valueOf(str3);
                criteria.setHDDcapacity(number3);
            }

            if (str.equals("4")) {
                System.out.println("Задайте операционную систему: ");
                String str4 = sc.nextLine();
                criteria.setOperatingSystem(str4);
            }

            if (str.equals("5")) {
                System.out.println("Задайте максимальный вес в кг: ");
                String str5 = sc.nextLine();
                double number5 = Double.valueOf(str5);
                criteria.setWeight(number5);
            }

            if (str.equals("6")) {
                System.out.println("Задайте min время работы аккумулятора в часах: ");
                String str6 = sc.nextLine();
                int number6 = Integer.valueOf(str6);
                criteria.setBatteryCapacity(number6);
            }

            if (str.equals("7")) {
                System.out.println("Задайте максимальную цену в рублях: ");
                String str7 = sc.nextLine();
                int number7 = Integer.valueOf(str7);
                criteria.setPrice(number7);
            }

            if (str.equals("8")) {
                break;
            }
        }
        
        System.out.println(criteria);

        ArrayList<Laptop> out = new ArrayList<Laptop>();

        for (Laptop laptop : laptops) {

            if (criteria.getModel().equals("no") || criteria.getModel().equals(laptop.getModel())) {
                if (criteria.getDisplaySize() == 0 || criteria.getDisplaySize() <= laptop.getDisplaySize()) {
                    if (criteria.getRAMsize() == 0 || criteria.getRAMsize() <= laptop.getRAMsize()) {
                        if (criteria.getHDDcapacity() == 0 || criteria.getHDDcapacity() <= laptop.getHDDcapacity()) {
                            if (criteria.getOperatingSystem().equals("no") || criteria.getOperatingSystem().equals(laptop.getOperatingSystem())) {
                                if (criteria.getWeight() == 0 || criteria.getWeight() >= laptop.getWeight()) {
                                    if (criteria.getBatteryCapacity() == 0 || criteria.getBatteryCapacity() <= laptop.getBatteryCapacity()) {
                                        if (criteria.getPrice() == 0 || criteria.getPrice() >= laptop.getPrice()) {
                                            out.add(laptop);
                                        }
                                        else {
                                            continue;
                                        }
                                    }
                                    else {
                                        continue;
                                    }

                                }
                                else {
                                    continue;
                                }
                            }
                            else {
                                continue;
                            }
                        }
                        else {
                            continue;
                        }
                    }
                    else {
                        continue;
                    }
                }
                else {
                    continue;
                }
            }
            else {
                continue;
            }
        }

        if (out.isEmpty())

        {
            System.out.println("Ноутбуков под заданные критерии не найдено.");
        } else {
            System.out.println("Подобрали для Вас следующие ноутбуки: ");
            System.out.println(out);
        }

        sc.close();
    }

}