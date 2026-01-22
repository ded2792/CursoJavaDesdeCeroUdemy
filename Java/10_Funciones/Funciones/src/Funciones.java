public class Funciones {

    static void saludar(String mensaje){  //en este ejemplo la funcion es solo static xq se va a usar directamente aca
        System.out.println("Mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        saludar("Hola desde Java");
        saludar("Adios");
    }
}
