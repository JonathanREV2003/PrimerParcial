package ordenamientoQuickSort;

public class Ordenador {
    public void ordenarQuicksort(int[] array){
        array = quicksort1(array);
    }
    public int[] quicksort1 (int numeros[]){
        return quicksort2(numeros,0,numeros.length-1);
    }
    public int[] quicksort2 (int numeros[], int izquierda, int dercha){
        if(izquierda >= dercha)
            return numeros;
        int i = izquierda, d = dercha;
        if (izquierda!=dercha){
            int pivote;

        }


    }
}
