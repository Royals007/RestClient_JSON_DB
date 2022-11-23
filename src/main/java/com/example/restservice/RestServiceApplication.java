package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static final String POST_URL = "http://localhost:8080/messages/new-message";
	public static final String DEL_URL = "http://localhost:8080/messages/del?id=2";

	public static final String GET_URL = "http://localhost:8080/messages";

	public static final String PUT_URL = "http://localhost:8080/messages/update";

	public static void main(String[] args) {

		SpringApplication.run(RestServiceApplication.class, args);

		//######################## RestClient ###########################

//		RestTemplate template = new RestTemplate();
//		//ResponseEntity<String> response = template.postForEntity(POST_URL, new Message(4, "Guten Tag GuruDev"), String.class); // output = Json
//		ResponseEntity<Message> response = template.postForEntity(POST_URL, new Message(4, "Guten Tag GuruDev"), Message.class); // Message.class response Message- Objekt
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getBody());
//		System.out.println(response.getHeaders());
//
//		// Delete - variante 1
//		template.delete(DEL_URL);
//		// Delete -  Varainte 2
//		// HttpEntity
//		ResponseEntity<Message[]> response2 = template.getForEntity(GET_URL, Message[].class); // gives List data
//		Message[] messageArr = response2.getBody();
//		System.out.println(Arrays.toString(messageArr));
//
//		ResponseEntity<String> response3 = template.getForEntity(GET_URL, String.class); // Json will return, mostly the clients will use this
//		System.out.println(response3.getBody());
//
//		// update
//		template.put(PUT_URL, new Message(1, "abc"));
	}

}
