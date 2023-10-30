import java.net.*;

public class Jaringan {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Alamat IP www.google.com: " + address);

            InetAddress[] addresses = InetAddress.getAllByName("localhost");
            for (int i = 0; i < addresses.length; i++) {
                System.out.println("Alamat IP localhost: " + addresses[i]);
            }

            InetAddress mesin = InetAddress.getLocalHost();
            System.out.println("Alamat IP lokal: " + mesin);

            String lokal = mesin.getHostName();
            String ip = mesin.getHostAddress();
            System.out.println("Nama Host Lokal: " + lokal);
            System.out.println("Alamat IP Lokal: " + ip);
        } catch (UnknownHostException uhEx) {
            uhEx.printStackTrace();
        }
    }
}