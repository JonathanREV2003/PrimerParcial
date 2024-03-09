package microsistemasSA;

public class Main {
    public static void main(String[] args) {

        /***
         * El metodo implementado para manejar las solicitudes de manera local es
         * lista enlasada simple para manejar una solicitud a la vez.
         */

        Lista_Metodos a = new Lista_Metodos();

        a.insertarFinal("A");
        a.insertarFinal("B");
        a.insertarFinal("C");
        a.insertarFinal("D");
        a.insertarFinal("E");
        a.insertarInicio("Inicio");

        System.out.println("Lista completa");
        a.mostrarLista();

        System.out.println();
        System.out.println("Eliminamos el inicio");
        a.eliminarInicio();
        a.mostrarLista();

        System.out.println();
        System.out.println("Extraemos el nuevo inicio");

        System.out.println(a.extraerElInicio());
        System.out.println();
        System.out.println("Nueva lista completa");

        a.mostrarLista();

    }
}
