import java.util.Scanner;

public class IntroducirValores {
    public static void main(String[] args) {
        // Introdicir valores a una matriz
        int rengloges, columnnas;
        var consola = new Scanner(System.in);

        // Definir la matriz
        System.out.print("Proporcionar los renglones: ");
        rengloges = Integer.parseInt(consola.nextLine());

        System.out.print("Proporcionar las columnas: ");
        columnnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[rengloges][columnnas];

        // Solicitar los valores
        for (var ren=0; ren < rengloges; ren++){
            for (var col=0; col< columnnas; col++){
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        // Iterar los valores de la matriz
        System.out.println();
        for(var ren=0; ren < rengloges; ren++){
            for (var col=0; col < columnnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
