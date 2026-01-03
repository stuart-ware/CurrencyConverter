package requesthttp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AskApi
{ 
	private final String apiKey;
	private final HttpClient client;
	
	public AskApi()
	{	
		this.apiKey = "805282b999917d94406a8302";
		this.client = HttpClient.newHttpClient();
		
	}
	
	public String getCurrency(String cur1, String cur2, double amount)
	{
		String url = "https://v6.exchangerate-api.com/v6/"+ apiKey + "/pair/" 
				+ cur1 + "/" +  cur2 + "/" + amount;
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.GET()
				.build();
				
		try 
		{
			
			HttpResponse<String> response = client.send(request, HttpResponse
					.BodyHandlers.ofString());
			return response.body();
			
		}
		catch (IOException e)
		{
			System.out.println("Error:" + e.getMessage());
		}
		catch (InterruptedException e)
		{
			System.out.println("Error:" + e.getMessage());
		}

		return null;
	}
}


