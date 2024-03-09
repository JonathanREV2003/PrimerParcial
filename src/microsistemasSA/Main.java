package microsistemasSA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista_Metodos a = new Lista_Metodos();
        Scanner scanner = new Scanner(System.in);

        /***
         *
         * El metodo implementado para manejar las solicitudes de manera local es
         * lista enlasada simple para manejar una solicitud a la vez (solicitud que entra solicitud que se resuelve).
         *
         */

        //simulating multiple user requests.
        a.insertarInicio("Solicitud NO.4");
        a.insertarInicio("Solicitud NO.3");
        a.insertarInicio("Solicitud NO.2");
        a.insertarInicio("Solicitud NO.1");


        //interface / menu
        System.out.println("\n   Bienbenido al sistema de <<MICRO SISTEMAS S.A.>>   ");
        System.out.println(" Que desea hacer hoy escriba el numero de la accion \n");
        int seleccion = 0;

        do {
            System.out.println("\n 1. Agregar nueva solicitiud al final de solicitudes ");
            System.out.println(" 2. Consultar todas las solicitudes ");
            System.out.println(" 3. eliminar primera solicitud de entrada ");
            System.out.println(" 4. ver el inicio de solicitudes");
            System.out.println(" 5. salir");

            seleccion = scanner.nextInt();

            switch (seleccion){
                case 1:

                    System.out.println("Escriba la solicitud a agreagrar\n");
                    Scanner soli = new Scanner(System.in);
                    String solicitud = soli.nextLine();
                    a.insertarFinal(solicitud);
                    System.out.println("Solicitud agregada\n");
                    break;

                case 2:

                    System.out.println("Estas son todas las solicitiudes\n");
                    a.mostrarLista();
                    break;

                case 3:
                    System.out.println("Solicitud eliminada...\n");
                    a.eliminarInicio();
                    break;

                case 4:
                    System.out.println("Este es el inicio de solicitudes\n");
                    a.extraerElInicio();
                    break;

                case 5:
                    break;

            }
        }while (seleccion != 5);
        System.out.println("PROGRAMA FINALISADO");
    }
}


