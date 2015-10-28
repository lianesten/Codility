package co.com.codility.test;

/**
 *
 * @author juliansten
 */
public class Solution {

    public int tapeEquilibrium(int[] A) {
        int sizeArray = A.length, p = 1;
        while (p < sizeArray) {
            int rigthSum = 0, leftSum = 0, i = 0;
            //Sum of left elements
            while (i < p) {
                leftSum = leftSum + A[i];
                i++;
            }
            //Sum of rigth elements
            i = p + 1;
            while (i < sizeArray) {
                rigthSum = rigthSum + A[i];
                i++;
            }
            if (rigthSum == leftSum) {
                return p;
            }
            p++;
        }
        return -1;
    }

    public int frogJmp(int currentPosition, int wishPosition, int jumpDistance) {
        int jump = currentPosition, minimalNumberJumps = 0;
        while (jump < wishPosition) {
            jump = jump + jumpDistance;
            minimalNumberJumps = minimalNumberJumps + 1;
        }
        return minimalNumberJumps;
    }

    public int permMissingElem(int[] A) {
        int missingNum = 0, der = A.length;
        int[] arrayOrdenado = quicksort(A,0,der);
        int size = arrayOrdenado.length;
        for (int j = 0; j < size; j++) {
            System.out.println(+arrayOrdenado[j]+",");
        }
        
        return missingNum;
    }

    public static int[] quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = A[i];                  // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            quicksort(A, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der); // ordenamos subarray derecho
        }
        return A;
        
    }

}
