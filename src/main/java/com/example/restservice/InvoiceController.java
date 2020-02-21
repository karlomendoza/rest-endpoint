package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

	@GetMapping("/hello")
	public Response hello(@RequestParam(value = "name", defaultValue="Stranger") String name) {

		Response r = new Response();
		r.setResponse("hello " + name);
		return r;
	}
}
