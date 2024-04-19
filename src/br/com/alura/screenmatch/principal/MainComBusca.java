package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class MainComBusca {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		 HttpClient client = HttpClient.newHttpClient();
		   HttpRequest request = HttpRequest.newBuilder()
		         .uri(URI.create("http://www.omdbapi.com/?apikey=51a2a9de&t=tron"))
		         .build();
		   
		   HttpResponse<String> response = client
				     .send(request, BodyHandlers.ofString());
		   
		   System.out.println(response.body());
		
	}
}
