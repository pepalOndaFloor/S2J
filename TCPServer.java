import java.io.*;
import java.net.*;
import java.util.Scanner;

class ServerChat {
    public static void main(String[] args) {
        try {
            // Create Server Socket
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Input and Output streams
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);
            String clientMsg, serverMsg;

            while (true) {
                // Receive message from client
                clientMsg = in.readLine();
                System.out.println("Client: " + clientMsg);

                // Exit condition
                if (clientMsg.equalsIgnoreCase("bye")) {
                    break;
                }

                // Send message to client
                System.out.print("Server: ");
                serverMsg = sc.nextLine();
                out.println(serverMsg);

                if (serverMsg.equalsIgnoreCase("bye")) {
                    break;
                }
            }

            // Close connections
            socket.close();
            serverSocket.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}