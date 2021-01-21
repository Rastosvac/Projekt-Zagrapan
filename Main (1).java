package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] slova = {
                "Audi",
                "Bentley",
                "BMW",
                "Bugatti",
                "Cadillac",
                "Citroen",
                "Dacia",
                "Dodge",
                "Ferrari",
                "Ford",
                "Honda",
                "Hyundai",
                "Chevrolet",
                "Jaguar",
                "Jeep",
                "KIA",
                "Lada",
                "Lamborghini",
                "Lexus",
                "Maserati",
                "Mazda",
                "McLaren",
                "Mercedes-Benz",
                "Mitsubishi",
                "Nissan",
                "Opel",
                "Peugeot",
                "Porsche",
                "Renault"
        };

        String slovo = slova[random.nextInt(slova.length)];
        char[] slovoChar = slovo.toCharArray();
        char[] znaky = slovo.toCharArray();
        int zlePokusy = 0;

        System.out.println("\nObesenec hra, hádaj značky áut.");
        for(int i = 0; i < znaky.length; i++) {
            znaky[i] = '_';
            System.out.print(znaky[i]);
        }

        for(int i = 1; i <= 4; i++){
            System.out.println("\nTipni si písmeno: ");
            char pismeno = scanner.next().charAt(0);
            boolean maZlyPokus = true;

            for (int j = 0; j < slovoChar.length; j++) {
                if (pismeno == slovoChar[j]) {
                    maZlyPokus = false;
                    znaky[j] = pismeno;
                    i--;
                    System.out.println("Uhádol si písmeno");
                }
            }

            if (maZlyPokus && i == 1) {
                System.out.println("\nZly pokus! Ostávaju 3 pokusy.");
            }
            else if (maZlyPokus && i == 2) {
                System.out.println("\nDruhý zly pokus! Ostávaju 2 pokusy.");
            }
            else if (maZlyPokus && i == 3) {
                System.out.println("\nTretí zlý pokus! Ostáva 1 pokus.");
            }
            else if (maZlyPokus && i == 4) {
                System.out.println("\nPrehral si!");
                break;
            }

            System.out.print("\n");
            System.out.print(znaky);

            if(slovo.equals(new String(znaky))) {
                System.out.println("\nVyhral si!");
                break;
            }
        }
    }
}
