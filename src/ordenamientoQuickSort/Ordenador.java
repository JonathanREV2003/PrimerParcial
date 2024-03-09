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
            int aux;
            pivote = izquierda;
            while (izquierda!=dercha){
                while (numeros[dercha] >= numeros[pivote] && izquierda < dercha)
                    dercha--;
                while (numeros[izquierda] < numeros [pivote] && izquierda < dercha)
                    izquierda++;
                if(dercha != izquierda){
                    aux = numeros[dercha];
                    numeros[dercha] = numeros[izquierda];
                    numeros[izquierda] = aux; }
                }
            if (izquierda == dercha){
                quicksort2(numeros,i,izquierda-1);
                quicksort2(numeros,izquierda+1,d);
            }
            }
        else
            return numeros;
        return numeros;
        }
    }
