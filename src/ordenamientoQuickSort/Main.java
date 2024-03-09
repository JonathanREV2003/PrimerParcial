package ordenamientoQuickSort;

public class Main {
    public static void main(String[] args){
        int []array = {1, 3, 2, 4, 5, 9, 7, 8, 6, 11, 10};

        Ordenador a = new Ordenador();
        a.ordenarQuicksort(array);

        for (int i=0; i < array.length; i++){
            System.out.printIn(array[i]);
        }

    }
}
