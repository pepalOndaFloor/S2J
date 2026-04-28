import java.io.*;
import java.net.*;
import java.util.Scanner;

class ClientChat {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");

            // Input and Output streams
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);
            String clientMsg, serverMsg;

            while (true) {
                // Send message to server
                System.out.print("Client: ");
                clientMsg = sc.nextLine();
                out.println(clientMsg);

                if (clientMsg.equalsIgnoreCase("bye")) {
                    break;
                }

                // Receive message from server
                serverMsg = in.readLine();
                System.out.println("Server: " + serverMsg);

                if (serverMsg.equalsIgnoreCase("bye")) {
                    break;
                }
            }

            // Close connection
            socket.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}