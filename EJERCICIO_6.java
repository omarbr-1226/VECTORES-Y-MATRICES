import java.util.Scanner;
/*Llenar 2 vectores con 10 numeros enteros
* determinar si son "IGUALES" o si son "DIFERENTES"
* son iguales si en cada casilla de ambos vectores
* tienen el mismo valor*/
public class EJERCICIO_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int VecA[] = new int[10];
        int VecB[] = new int[10];

        for (i=0; i<10; i++){
            VecA[i]=0;
            VecB[i]=0;
        }

        for (i=0; i<10; i++){
            System.out.println("Ingresa los valores del primer vector");
            VecA[i]= sc.nextInt();
        }
        System.out.println("---------------------------------------------------");
        for (i=0; i<10; i++){
            System.out.println("Ingresa los valores del segundo vector");
            VecB[i]= sc.nextInt();
        }
        System.out.println("---------------------------------------------------");
        for (i=0; i<10; i++){
            if (VecA[i]==VecB[i]){
                System.out.println("Son iguales");
            }else
                System.out.println("Son diferentes");
        }
        
    }
}
