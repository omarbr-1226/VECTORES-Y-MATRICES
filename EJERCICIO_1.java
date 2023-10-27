import java.util.Scanner;

/*
Utilizando arreglos de una dimension almacenar los precios de celulares.
Determinar el celular mas caro, el celular mas barato y el precio promedio de 10 celulares
TAREA:
Mostrar la casilla del celular mas caro y del mas barato
*/
public class EJERCICIO_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float preMax,preMin,preProm,suma;
        /*1-Definicion*/
        float precio[];
        precio = new float[10];

        /*2-Limpiar vector o inicializar*/
        for (int i=0; i<10; i++){
            precio[i] = 0;
        }

        /*3-Llenar el array*/
        for (int i=0; i<10; i++){
            System.out.println("Introduce el precio del celular "+i+":");
            precio[i] = sc.nextFloat();
        }

        /*4-Procesar la informacion*/
        preMax = 0;
        preMin=50000;
        preProm=0;
        suma=0;
        for (int i=0; i<10; i++){
            if (precio[i]>preMax){
                preMax = precio[i];
            }
            if (precio[i]<preMin){
                preMin = precio[i];
            }
            suma = suma+precio[i];

        }
        preProm=suma/10;

        /*5-Salida de datos*/
        for (int i=0; i<10; i++){
            System.out.println(precio[i]+" ");

        }
        System.out.println("El precio mas bajo es: "+preMin);
        System.out.println("El precio mas alto es: "+preMax);
        System.out.println("El precio promedio es: "+preProm);


    }
}
