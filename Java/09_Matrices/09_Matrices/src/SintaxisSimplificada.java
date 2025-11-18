public class SintaxisSimplificada {
    public static void main(String[] args) {
        // Definir la matriz y en ese momento se cargan los valores cada {} es un arreglo en si
        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };
        // Recorrer la matriz
        // 1 Ciclo mas externo recorre los renglones
        for (var ren = 0; ren < matriz.length; ren++) {
            // 2. Ciclo inteno recorre las columnas
            for (var col = 0; col < matriz[ren].length; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}