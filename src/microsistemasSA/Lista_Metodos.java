package microsistemasSA;

public class Lista_Metodos {

    Nodo inicio;
    Nodo fin;
    public Lista_Metodos(){
        inicio = null;
        fin = null;
    }
    public void insertarInicio(String dato){

        Nodo nuevo = new Nodo(dato,inicio);
        inicio = nuevo;
        if(fin == null){
            fin = inicio;
        }
    }
    public void insertarFinal(String dato){
        Nodo nuevo = new Nodo(dato,null);

        if (inicio == null){
            fin = nuevo;
            inicio = fin;
        }else {
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    public void eliminarInicio(){
        inicio = inicio.siguiente;
    }
    public String extraerElInicio(){
        String dato = inicio.getDato();
        inicio = inicio.getSiguiente();
        if (inicio == null){
            fin = null;
        }
        return dato;
    }
    public void mostrarLista(){
        Nodo temporal = inicio;

        while (temporal != null){
            System.out.println(temporal.getDato());
            temporal = temporal.siguiente;
        }
    }
}


