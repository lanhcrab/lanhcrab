package week13;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] argv) throws Exception {
        String sentence_from_client;
        String sentence_to_client;

        try {
            //Tạo socket server, chờ tại cổng '1234'
            ServerSocket welcomSocket = new ServerSocket(1234);
            while (true) {
                //chờ yêu cầu từ client
                Socket connectionSocket = welcomSocket.accept();

                //Tạo input stream, nối tới Socket
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

                //Tạo outputStream, nối tới socket
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

                //Đọc thông tin từ socket
                sentence_from_client = inFromClient.readLine();
                System.out.println("Read from client: " + sentence_from_client);
                StringBuffer sfcbuffer = new StringBuffer(sentence_from_client);
                sentence_to_client = sfcbuffer.reverse().toString() + "(Server accepted)" + '\n';

                //ghi dữ liệu ra socket
                outToClient.writeBytes(sentence_from_client);
                return;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
