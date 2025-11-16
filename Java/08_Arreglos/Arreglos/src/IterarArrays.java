public class IterarArrays {
    public static void main(String[] args) {
        var enteros = new int[]{100, 200, 300, 400, 500};
        // iterar el array
        for(var i= 0; i < enteros.length; i++){
            System.out.println("Valor del indice: " + i + " = " + enteros[i]);
        }
    }
}
