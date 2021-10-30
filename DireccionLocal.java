import java.net.*;

public class DireccionLocal {
    public static void main(String[] args) {
        try {
            InetAddress direccion = InetAddress.getLocalHost();
            System.out.println(direccion);
        }
        catch(UnknownHostException e) {
            System.out.println("No pude obtener el nombre de la maquina"+ e + ".");
        }
    }
}
