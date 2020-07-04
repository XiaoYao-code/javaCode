package code704;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class HTTPClientDemo {
    public static void main(String[] args) {
        String SERVER_HOST="www.baidu.com";
        int SERVER_PORT=80;
        try (Socket socket=new Socket(SERVER_HOST,SERVER_PORT)){
           String request="GET /S?wd=java HTTP/1.0\r\nhost: www.baidu.com\r\n\r\n";
            PrintWriter writer=new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream(),"utf-8")
            );
            writer.println(request);
            writer.flush();
            Scanner scanner=new Scanner(socket.getInputStream(),"utf-8");
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
