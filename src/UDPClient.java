import java.io.IOException;
import java.net.*;

/**
 * Created by obo on 16/5/2.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class UDPClient {
    public static void main(String []args) {
        try {
            DatagramSocket client = new DatagramSocket();
            String sendStr = "Hello! I'm Client";
            byte[] sendBuf;
            sendBuf = sendStr.getBytes();
            InetAddress addr = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket sendPacket
                    = new DatagramPacket(sendBuf ,sendBuf.length , addr , port);
            client.send(sendPacket);

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
