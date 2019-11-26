 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import Models.UserSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import portafolio.misofertasescritorio.Home;

/**
 *
 * @author Acer
 */
public class GenericServices {
    
    
    private static HttpURLConnection connection;
    
    public String getRequest(String uri, String api, String controller){
        
        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();
        
        try {
            
            URL url = new URL(uri+api+controller);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            
            int status = connection.getResponseCode();
            //System.out.println(status);
            
            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
                reader.close();
            }
            
            //ObjectMapper mapper = new ObjectMapper();
            //[Clase] object = mapper.readValue(responseContent.toString(), [Clase][].class);
            //List<User> users = Arrays.asList(mapper.readValue(responseContent.toString(), User[].class));
            
            System.out.println(responseContent.toString());
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            return ex.toString();
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            return ex.toString();
        }
        
        return responseContent.toString();
    }
    
    
    public static String Post(Object objeto, String uri) {
        UserSession userSession = new UserSession();
            try {
               
                String jsonInString;
		URL url = new URL(uri);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");

		ObjectMapper mapper = new ObjectMapper();
                String input = mapper.writeValueAsString(objeto);
                System.out.println("mmmmmm patas"+input);
		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();

		if (conn.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
                        String output;
                        System.out.println("Output from Server .... \n");
                        while ((output = br.readLine()) != null) {
                            System.out.println(output);
                        }
		}
                
		conn.disconnect();
                return "Ok";

            } catch (MalformedURLException e) {

		return e.toString();

            } catch (IOException e) {

		return e.toString();
	 }
            
    }
    
    public static String Update(Object objeto, String uri, String id){
        UserSession userSession = new UserSession();
            try {
               
                String jsonInString;
		URL url = new URL(uri+id);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("PUT");
		conn.setRequestProperty("Content-Type", "application/json");

		ObjectMapper mapper = new ObjectMapper();
                String input = mapper.writeValueAsString(objeto);
                System.out.println("mmmmmm patas"+input);
		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();

		if (conn.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
                        String output;
                        System.out.println("Output from Server .... \n");
                        while ((output = br.readLine()) != null) {
                            System.out.println(output);
                        }
		}
                
		conn.disconnect();
                return "Ok";

            } catch (MalformedURLException e) {

		return e.toString();

            } catch (IOException e) {

		return e.toString();
	 }
    }
    
    public static String Delete(String id, String uri) {
        try{
            URL url = new URL (uri+id);
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            httpCon.setDoOutput(true);
        
            httpCon.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpCon.setRequestMethod("DELETE");
        
            httpCon.connect();
            String response = httpCon.getInputStream().toString();
            return response;
            }catch (MalformedURLException e){
                return e.toString();
            
            }catch (IOException e) {

		return e.toString();
            }
    }
    
}
