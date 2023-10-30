import java.net.*;
import java.util.*;

public class IPFinder {
    public static void main(String[] args) {
        String host = "";
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("\nMasukan nama host: ");
            host = input.nextLine();
            InetAddress address = InetAddress.getByName(host);
            System.out.println("IP address : " + address.getHostAddress());
        } catch (UnknownHostException uhEx) {
            System.err.println("Tidak dapat menemukan alamat IP untuk " + host);
        } finally {
            input.close();
        }
    }
}
