
package computernetwork_lab_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Md Torikul Islam
 * ID: 192002131
 * CSE-312 
 */
public class Computer_Network_Lab_Post {
    
      public static void main(String[] args) throws  IOException {
        
          URL url = new URL ("https://jsonplaceholder.typicode.com/posts/");
        
        
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", "Chrome");
      
        con.setDoOutput(true);
        
        String message = "Yes I can post";
        
        OutputStream output = con.getOutputStream();
        
        output.write(message.getBytes());
        output.flush();
        output.close();
        
        int responseCode = con.getResponseCode();
        
        System.out.println("Response Code : " +responseCode);
        System.out.println("Response Messaage : " +con.getResponseMessage());
        
         
        if(responseCode == HttpURLConnection.HTTP_CREATED ){
            
            InputStreamReader in = new InputStreamReader(con.getInputStream());
            
            BufferedReader read = new BufferedReader(in);
            
            String str = null;
            
//            SrtingBuffer response = new SrtingBuffer();

            while ((str = read.readLine()) != null){
                
                System.out.println(str);
            }
            
          
        }
        
            else{

                System.out.println("Get method not worked");
             
            }
        
        
    }
    
}
