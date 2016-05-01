import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by obo on 16/5/1.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class UDPServer {
    public static void main(String []args) {
        try {
            DatagramSocket server = new DatagramSocket(10086);
            byte [] recvBuf = new byte[1024];
            DatagramPacket recvPacket = new DatagramPacket(recvBuf,recvBuf.length);
            server.receive(recvPacket);

            String recvStr = new String(recvPacket.getData() , 0 , recvPacket.getLength());
            System.out.println("Hello World!" + recvStr);

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
