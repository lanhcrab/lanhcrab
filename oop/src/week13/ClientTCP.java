package week13;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientTCP {
    public static void main(String argv[]) throws Exception{
        String sentence_to_server;
        String sentence_from_server;

        System.out.print("Input from client: ");
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        sentence_to_server = inFromUser.readLine();

        Socket clientSocket = new Socket("127.0.0.1", 1234);

        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        outToServer.writeBytes(sentence_to_server + '\n');

        sentence_from_server = inFromServer.readLine();

        System.out.println("FROM SERVER: " + sentence_from_server);

        clientSocket.close();
    }
}

