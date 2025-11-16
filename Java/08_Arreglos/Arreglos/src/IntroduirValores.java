import java.util.Scanner;

public class IntroduirValores {
    public static void main(String[] args) {
        // Introducir valores a un array
        var consola = new Scanner((System.in));
        // Declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        // cramos de manera dinamica el arreglo
        var enteros = new int[largoArreglo];
        // Solicitar lor valores del arreglo
        for(var i=0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresion del Arreglo: ");
        for(var i= 0; i < largoArreglo; i++){
            System.out.println("Valor del indice[ " + i + "] = " + enteros[i]);
        }
    }
}
