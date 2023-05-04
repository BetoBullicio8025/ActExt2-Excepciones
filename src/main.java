import java.io.IOException;

public class main {
    public static void main(String[] args) {

        leerArchivo lectura = new leerArchivo();
        try {
            lectura.leer("datos.txt");
            lectura.metodo1( "datos2.txt");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
