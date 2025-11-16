public class ModificacionArreglos {
    public static void main(String[] args) {
        // Arreglos
        var enteros = new int[5];
        // Modificar los elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 64;
        // Leer los elementos del arreglos
        System.out.println("Valor 1 = " + enteros[0]);
        System.out.println("Valor 2 = " + enteros[1]);
        System.out.println("Valor 5 = " + enteros[4]);

        // Sintaxis simplificada
        //int[] enteros2 = {100, 200, 300, 400, 500};
        var enteros2 = new int []{100, 200, 300, 400, 500};
        // Acceder a los elementos
        System.out.println("Arreglo 2: Valor 1 = " + enteros2[0]);
        System.out.println("Arreglo 2: Valor 2 = " + enteros2[1]);
        System.out.println("Arreglo 2: Valor 3 = " + enteros2[2]);
        System.out.println("Arreglo 2: Valor 4 = " + enteros2[3]);
        System.out.println("Arreglo 2: Valor 5 = " + enteros2[4]);
        // Impimir el arreglo
        System.out.println("Imprimir el arreglo: " + enteros2); // esto solamente va a mostrar la direccion de memoria del arreglo
    }
}
