/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.User;
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
import portafolio.misofertasescritorio.Home;
import org.codehaus.jackson.map.ObjectMapper;



/**
 *
 * @author cvargas
 */
public class UserServices {
    
    private static HttpURLConnection connection;
    
    public static UserSession PostUserLogin(String email, String password, int userType) {
        UserSession userSession = new UserSession();
           try {
               

		URL url = new URL("http://ofertasportafoli-001-site1.dtempurl.com/api/userlogin");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");

		String input = "{		\n" +
                                "        \"Email\": \""+email+"\",\n" +
                                "        \"Password\": \""+password+"\",\n" +
                                "        \"IdUserType\": "+userType+"\n" +
                                "     \n" +
                                "}";

		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();

		if (conn.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
                        
                        
                    ObjectMapper mapper = new ObjectMapper();
                    userSession = mapper.readValue(br.readLine(), UserSession.class);
                    
                    
                    
                        String output;
                        System.out.println("Output from Server .... \n");
                        while ((output = br.readLine()) != null) {
                                System.out.println(output);
                        }
                        
		}
                
		
                
		conn.disconnect();
                return userSession;

	  } catch (MalformedURLException e) {

		return userSession;

	  } catch (IOException e) {

		return userSession;

	 }

	
	}
    
    
    public static int PostUser(String email, String password, int userType, String rut) {
           try {

		URL url = new URL("http://ofertasportafoli-001-site1.dtempurl.com/api/users");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
                conn.setConnectTimeout(5000);
                conn.setReadTimeout(5000);
		String input = "{\n" +
                                "        \n" +
                                "        \"Email\": \""+email+"\",\n" +
                                "        \"Password\": \""+password+"\",\n" +
                                "        \"Rut\": \""+rut+"\",\n" +
                                "        \"IdUserType\": "+userType+"\n" +
                                "	\n" +
                                "}";

		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();

		if (conn.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

                        String output;
                        System.out.println("Output from Server .... \n");
                        while ((output = br.readLine()) != null) {
                                System.out.println(output);
                        }
		}
                
		conn.disconnect();
                return conn.getResponseCode();

	  } catch (MalformedURLException e) {

		return 0;

	  } catch (IOException e) {

		return 0;

	 }

	
	}
    
    
    
    
    public static String getRequest(String uri, String api, String controller){
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
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
            
            ObjectMapper mapper = new ObjectMapper();
            User[] user = mapper.readValue(responseContent.toString(), User[].class);
            
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
    
    public static String Eliminar(int id) throws MalformedURLException, IOException{
        URL url = new URL("http://ofertasportafoli-001-site1.dtempurl.com/api/users/"+id);
       
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        
        httpCon.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpCon.setRequestMethod("DELETE");
        
        httpCon.connect();
        String response = httpCon.getInputStream().toString();
        return response;
    }
    
    

    

}
