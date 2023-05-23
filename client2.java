import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class client2 {
    public static void main(String[] args) throws IOException {

        Socket s2=new Socket("3.24.242.26",8080);
        
        PrintWriter pr=new PrintWriter(s2.getOutputStream());

        // pr.println("hii from client2");
        // pr.flush();

        
       while(true){

        InputStreamReader ISS=new InputStreamReader(s2.getInputStream());
        BufferedReader br2=new BufferedReader(ISS);
        String str=br2.readLine();
        System.out.println(str);

        //if(str.equals("bye"))break;


        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        String str1=br1.readLine();
        pr.println(str1);
        pr.flush();

        // if(str1.equals("bye"))break;

       }

        

        
    }
}
