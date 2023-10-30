import java.net.*;

public class MyLocalIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Alamat IP lokal: " + address.getHostAddress());
        } catch (UnknownHostException uhEx) {
            System.err.println("Tidak dapat menemukan alamat IP lokal.");
        }
    }
}
