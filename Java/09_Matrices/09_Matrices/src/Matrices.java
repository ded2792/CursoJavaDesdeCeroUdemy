public class Matrices {
    public static void main(String[] args) {
        // Definimos una matriz
        //int[][] matroz = new int[2][3];
        // Otra forma
        var matriz = new int[2][3];
        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // Acceder a los valores
        System.out.println("Valore 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valore 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valore 5 [1][1] = " + matriz[1][2]);
    }
}
