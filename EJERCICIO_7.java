import java.util.Scanner;
/*Llenar un vector con 10 numeros enteros.
* solicitar al usuario un numero y buscarlo
* en el vector. Si lo encuentra escribir el valor
* y el numero de casilla donde lo encontro. Si no lo
* encuentra debe escribir la frase "VALOR NO ENCONTRADO"*/
public class EJERCICIO_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Vec[] = new int[10];
        int i,num;
        int posi=-1;

        for (i=0; i<10; i++){
            Vec[i] =0;
        }

        for (i=0; i<10; i++){
            System.out.println("Ingresa valores para el vector");
            Vec[i]= sc.nextInt();
        }

        System.out.println("Que numero desea encontrar?");
        num = sc.nextInt();

        for (i=0; i<Vec.length; i++){
                if (Vec[i]==num){
                    posi=i;
                }
            }

        if (posi == -1){
            System.out.println("Valor no encontrado");

        }else
            System.out.println("El numero "+num+" fue encontrado en la casilla "+posi);

        }


    }

