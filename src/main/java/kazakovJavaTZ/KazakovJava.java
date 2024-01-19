package kazakovJavaTZ;

import java.util.Scanner;

public class KazakovJava {
    Menu menu = new Menu();
    private boolean run = true;

    public KazakovJava(boolean run) {
        this.run = run;
    }

    public KazakovJava() {

    }

    public void initMenu() {
        Scanner scanner = new Scanner(System.in);
        while (run) {
            menu.menu();
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> menu.exeOne();
                case 2 -> menu.exeTwo();
                case 3 -> menu.exeThree();
                case 4 -> menu.exeFour();
                case 5 -> run = false;
                default -> System.out.println("Нет такого значения");
            }
            }
        }

        public static void main (String[]args){
            new KazakovJava().initMenu();
        }
    }