package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
//        crearArchivo(nombreArchivo);

//        anexarArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "adios");

        leerArchivo(nombreArchivo);
    }
}
