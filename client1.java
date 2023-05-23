import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client1 {

    public static void main(String[] args) throws IOException{
        
            Socket s1=new Socket("localhost",8080);

            PrintWriter pr=new PrintWriter(s1.getOutputStream());


            while(true){

            BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
            String str1=br1.readLine();
            pr.println(str1);
            pr.flush();

            if(str1.equals("bye"))break;

            InputStreamReader IR1=new InputStreamReader(s1.getInputStream());
            BufferedReader BR1=new BufferedReader(IR1);
            String STR1=BR1.readLine();
            System.out.println(STR1);

            if(STR1.equals("bye"))break;


            
            }


		
          
 
    }
    
}
