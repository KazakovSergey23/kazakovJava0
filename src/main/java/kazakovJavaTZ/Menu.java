package kazakovJavaTZ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public void menu() {
        String[] menu = {"Меню: ", "1.Задача", "2.Задача", "3.Задача", "4.Задача", "5.Выход"};
        for (String s : menu) {
            System.out.println(s);
        }
        System.out.print("Выберите: ");
    }

    public void exeOne() {
        scanner = new Scanner(System.in);
        System.out.println("Задание 1. \nВывести (привет) если введут цифру больше 7 ");
        System.out.println();
        System.out.print("Введите: ");
        try {
            int number = scanner.nextInt();
            if (number > 7 && number < 2147483647) {
                System.out.println("Привет");
            } else {
                System.out.println("Введите больше 7");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число");
            scanner.nextLine(); // Очистка буфера ввода
            exeOne();
        }
    }

    public void exeTwo() {
        scanner = new Scanner(System.in);
        System.out.println("Задание 2. \nВывести Привет,Вячеслав если совпадет ввод с именем Вячеслав");
        System.out.println();
        System.out.print("Введите строку: ");
        try {
            String str = scanner.nextLine();
            if ("Вячеслав".equals(str)) {
                System.out.println("-----------------");
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число");
            scanner.nextLine(); // Очистка буфера ввода
            exeTwo();

        }
    }

    public void exeThree() {
        scanner = new Scanner(System.in);
        int[] mass;
        System.out.println("Задание 3. \nВывести все числа из массива кратные трем.");
        System.out.println();
        System.out.println("Для начала создадим массив.");
        System.out.print("Введите размер массива(max = 30): ");
        try {
            int lenght = scanner.nextInt();
            if (lenght > 0 && lenght <= 30) {
                mass = new int[lenght];
                System.out.println("Условия соблюдены, теперь заполним массив цифрами");
                for (int i = 0; i < lenght; i++) {
                    int number = scanner.nextInt();
                    if (number > 0 && number <= 100) {
                        mass[i] = number;
                    } else {
                        System.out.println("Введите снова число, так как это число находится " +
                                "не в заданном диапазоне: от 1 до 100.");
                        i--;
                    }
                }
                for (int i = 0; i < mass.length; i++) {
                    if (mass[i] != 0 && mass[i] % 3 == 0) {
                        System.out.println("Номер элемента массива: " + i
                                + ". значение кратное трём: " + mass[i]);
                    }
                }
            } else {
                System.out.println("Введите число в диапазоне от 1 до 30");
                exeThree();
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число.");
            exeThree();
            scanner.nextLine();
        }
    }

    public void exeFour() {
        System.out.println("-------Ответ-------");
        System.out.println("Нужно исправить последнюю квадратную скобку на круглую и тогда последовательность скобок будет правильной.");

    }
}
