package pl.coderslab;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        // Ustanowienie zakresu liczb zgadywanych (target)
        Random random = new Random();

        int min = 1;
        int max = 100;
        int target = random.nextInt(max) + min;
        int inpNumber ;
        int tries = 0;

        System.out.println("Zgadnij liczbę całkowitą z z zakresu "+ min + "-" + max);
        //Pętla testująca wprowadzane wartości
        do{
            System.out.print("Podaj liczbę: ");
            inpNumber = inputInRange(min, max);

            if (inpNumber > target){
                System.out.println("Za dużo.");
                tries++;
            }
            if (inpNumber < target){
                System.out.println("Za mało.");
                tries++;
            }
        } while (inpNumber != target);

        System.out.println("Zgadłeś w " + tries + " próbach!" );

    }
    static int inputInRange(int min, int max){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            try {
                int n = Integer.parseInt(line);
                if (n >= min && n <= max) {
                    return n;
                }
            } catch (NumberFormatException e) {
                // ok to ignore
            }
            System.out.print("Błąd. Wprowadzona wartość musi być liczbą całkowitą z zakresu "+ min + "-" + max + ". Podaj liczbę: ");
        }
    }
}

//metoda walidująca wartość

