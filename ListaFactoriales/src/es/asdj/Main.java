package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero,factorial = 1;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Dame un número mayor que 0: ");
            numero = entrada.nextInt();
        } while (numero < 0);

        for(int i = 1; i <= numero; i++) {
            factorial = factorial * i;
            System.out.println("!" + i + " = " + factorial);
        }
    }
}
