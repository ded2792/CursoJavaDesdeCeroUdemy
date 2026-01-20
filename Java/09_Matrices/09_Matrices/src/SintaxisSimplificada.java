public class SintaxisSimplificada {
    public static void main(String[] args) {
        // Definir la matriz y en ese momento se cargan los valores cada {} es un arreglo en si
        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };
        // Recorrer la matriz
        // 1 Ciclo mas externo recorre los renglones, primero se tiene que ver el largo del primer array
        for (var ren = 0; ren < matriz.length; ren++) {
            // 2. Ciclo inteno recorre las columnas, se entra en cada renglon y ahi se pregunta el largo de ese array
            for (var col = 0; col < matriz[ren].length; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}