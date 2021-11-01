
package computernetwork_lab_3;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Md Torikul Islam ID: 192002131 CSE-312
 */
public class ComputerNetwork_Lab_3 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.webcode.me");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Chrome");
        int responseCode = con.getResponseCode();
        System.out.println("Response Code : " + responseCode);
        System.out.println("Response Messaage : " + con.getResponseMessage());

        if (responseCode == HttpURLConnection.HTTP_OK) {

            InputStreamReader in = new InputStreamReader(con.getInputStream());

            BufferedReader read = new BufferedReader(in);

            String str = null;

            // SrtingBuffer response = new SrtingBuffer();

            while ((str = read.readLine()) != null) {

                System.out.println(str);
            }

        }

        else {

            System.out.println("Get method not worked");
        }

    }

}
