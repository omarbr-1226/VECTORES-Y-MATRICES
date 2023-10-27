import java.util.Scanner;
/*Llenar 2 vectores (A y B) con 10 numeros enteros.
* multiplicar el primer elemento del primer vector(A)
* con el ultimo elemento del segundo vector(B) y
* almacenarlo  en la primera casilla de un tercer vector(C)
* multiplicar el segundo elemento del primer vector(A)
* con el penultimo elemento del segundo vector(B) y
* almacenarlo en la segunda casilla del tercer vector(C) y
* asi sucesivamente con los demas elementos
*
* Author: Beelz
* */

public class EJERCICIO_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, aux=0;
        int VecA[] = new int[10];
        int VecB[] = new int[10];
        int VecC[] = new int[10];


        for (i=0; i<10; i++){
            VecA[i]=0;
            VecB[i]=0;
            VecC[i]=0;
        }
        for(i=0; i<10; i++){
            System.out.println("Ingresa los valores para el primer vector");
            VecA[i]= sc.nextInt();
        }
        System.out.println("--------------------------------------------");
            for(i=0; i<10; i++){
                System.out.println("Ingresa los valores para el segundo vector");
                VecB[i]= sc.nextInt();
            }

        System.out.println("----VECTOR UNO----------------------VECTOR DOS----");
        for (i=0;  i<10; i++){
            System.out.println(VecA[i]+"                                  "/* VecB[i]**/);
        }

            for(i=0; i< VecB.length/2; i++){
                int j = VecB.length-i-1;
                int a = VecB[i];
                int b = VecA[j];
                VecB[i] = b;
                VecB[j] = a;

            }

        System.out.println("------VECTOR TRES-------");
        for ( i=0; i<=9; i++){
            VecC[i]= VecA[i]*VecB[i];
            System.out.println(VecC[i]);
        }







    }
}
