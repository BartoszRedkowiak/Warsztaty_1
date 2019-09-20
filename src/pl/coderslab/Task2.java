package pl.coderslab;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        String input = null;

        System.out.print("Podaj parametry losowania: ");
        input = sc.nextLine();
        input = input.replace(" ", "");

        String inputMod = input.replace("D", "&D&");
        inputMod = inputMod.replace("+", "&+&");
        inputMod = inputMod.replace("-", "&-&");

        String[] data = inputMod.split("&");

        int x = 0;
        int y = 0;
        int z = 0;
        String sign = null;
        //Test poprawności danych

        if (data.length < 4) {
            sign = null ;
            z = 0;
        } else {
            sign = data[3];
            z = Integer.valueOf(data[4]);
        }

        try {
            x = Integer.valueOf(data[0]);
            y = Integer.valueOf(data[2]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Podano niepoprawne parametry. Koniec programu.");
            return;
        }

        if (sign != null){
            if ( !sign.equals("+") && !sign.equals("-")){
                System.err.println("Podano niepoprawne parametry. Koniec programu.");
                return;
            }
        }

        //Kalkulacja wartości
        int result;
        if ((sign == null)){
            result = x * y ;
        } else if (data[3].equals("+")) {
            result = x * y + z;
        } else {
            result = x * y - z;
        }

        System.out.println("Wynik losowania to: " + result);
    }

}
