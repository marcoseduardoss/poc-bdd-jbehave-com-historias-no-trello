package br.uece.jbehave;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

public class NetClientGet {

	public static boolean ativarProxy = false;	
	
	// http://localhost:8080/RESTfulExample/json/product/get
//	public static void main(String[] args) {

//	  System.out.println(get("https://api.trello.com/1/cards/<id-card>") );

//	}

	public static String get(String path) {
		String retorno = "";
		HttpURLConnection conn;
		try {
			
			URL url = new URL(path);
			if(ativarProxy){
				Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("200.129.22.52", 4050));
				conn = (HttpURLConnection) url.openConnection(proxy);
			}else{
				conn = (HttpURLConnection) url.openConnection();
			}
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-Agent", "Mozilla/5.0");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
//			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				retorno += output;
			}
			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }
		return retorno;
	}

}
