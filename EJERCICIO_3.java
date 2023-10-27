import java.util.Scanner;

/*
En un arreglo unidimensional se almacenara numeros. Determinar cuantos de ellos son
pares, impares, ceros, positivos y negativos
* */
public class EJERCICIO_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero[];
        int T;
        int par,impar,ceros,positivos,negativos;
        System.out.println("introduce el tamaño del vector");
        T =  sc.nextInt();
        numero = new int[T];

        for (int i=0; i<T; i++){
            numero[i]= 0;
        }

        for (int i=0; i<T; i++){
            System.out.println("Ingresa los valores del vector");
            numero[i] = sc.nextInt();
        }
        par=0;
        impar=0;
        ceros=0;
        positivos=0;
        negativos=0;
        for (int i =0; i<T; i++){
        }



    }
}
