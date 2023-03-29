package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("" );
                        break;
                    case 2:

                        System.out.println("");
                        break;
                    case 3:

                        System.out.println("");
                        break;
                    case 4:

                        System.out.println("");
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("");
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                sn.next();
            }
        }

    }
    }



