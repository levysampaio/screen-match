package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.modelos.TituloOmdb;

public class MainComBusca {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		 HttpClient client = HttpClient.newHttpClient();
		   HttpRequest request = HttpRequest.newBuilder()
		         .uri(URI.create("http://www.omdbapi.com/?apikey=51a2a9de&t=Avengers"))
		         .build();
		   
		   HttpResponse<String> response = client
				     .send(request, BodyHandlers.ofString());
		   
		   String json = response.body();
		   
		   System.out.println(json);
		   
		   Gson gson = new GsonBuilder()
				   .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
				   .create();
		   TituloOmdb meuTituloOmdb =  gson.fromJson(json, TituloOmdb.class);
		   
		   System.out.println(meuTituloOmdb);
		   
		   
		
	}
}
