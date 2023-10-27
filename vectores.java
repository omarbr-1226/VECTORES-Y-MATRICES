import java.util.Scanner;

/*
    Datos simples
char, String, double, float, int

    Datos estructurados
unidimension, bidimension, multidimension

 */
public class vectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Procesos aplicables a un arreglo
        1-Definicion
        2-Limpiar el arreglo
        3-Llenar el arreglo(Asignacion o Lectura
        4-Procesar la informacion(datos)
        5-Salida de resultados
         */

        /*1-Definicion */
        int edad[];
        edad = new int[5];

        /*2-Limpiar el vector*/
        for (int i=0; i<=4; i++){
            edad[i] = 0;
        }
        /*3-Llenar el array */
        for (int i=0; i<=4; i++){
            System.out.println("Introduce un valor para edad["+i+"]:");
            edad[i]=sc.nextInt();
        }
        /*4-Depende del planteamiento del problema*/

        /*5-Salida de resultados*/
        for (int i=0; i<=4; i++){
            System.out.print(edad[i]+" ");
        }

    }
}
