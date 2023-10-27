import java.util.Scanner;

/*
Declarar 3 vectores de tipo numerico.
llenar el primero desde el teclado en el segundo vector estara el cuadrado de cada elemento del primer vector
en el tercer vector estara el cubo de cada elemento del primer vector.
Se sugiere la siguiente salida:
Numero      Cuadrado        Cubo
  2             4            8
  5             25           125
  3             9            27
*/
public class ERJERCICIO_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,cuadrado,cubo;
        int num1[];
        num1 = new int[10];
        int num2[];
        num2 = new int[10];
        int num3[];
        num3 = new int[10];


        /*Primer Vector*/
        for (i=0; i<10; i++){
            num1[i]=0;
            num2[i]= 0;
            num3[i]=0;
        }

        for (i=0; i<10; i++){
            System.out.println("introduce un numero par para el "+i+" espacio");
            num1[i]= sc.nextInt();
        }

        for (i=0; i<10; i++){
            num2[i]= num1[i]*num1[i];
        }
        for (i=0; i<10; i++){
            num3[i]= num1[i]*num1[i]*num1[i];
        }

        for (i=0; i<10; i++){
            System.out.println("Numero"+"  "+"Cuadrado"+"  "+"Cubo");
            System.out.println(num1[i]+"         "+num2[i]+"        "+num3[i]);
        }




    }
}
