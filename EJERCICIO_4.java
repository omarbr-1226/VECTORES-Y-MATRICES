import java.util.Scanner;
/*Llenar un vector con 10 numeros enteros y almacenarlos en otro vector, en orden inverso.
* El primer vector debe conservarse sin modificacion
* */
public class EJERCICIO_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int i;
        int num2[] = new int[10];

        for (i=0; i<10; i++){
            num[i]=0;
            num2[i]=0;
        }
        for (i=0; i<10; i++){
            System.out.println("Ingrese numero "+i+" para el vector");
            num[i]=sc.nextInt();
        }
        System.out.println("----VECTOR UNO----");
        for(i=0; i<10; i++){
            System.out.println(num[i]);
        }
        System.out.println("----VECTOR DOS----");

        for (i=9; i>0; i--){
            num2[i]=num[i];
            System.out.println(num2[i]);
        }


    }
}
