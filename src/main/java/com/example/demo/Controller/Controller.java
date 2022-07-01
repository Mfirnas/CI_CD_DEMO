package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class Controller {

	@GetMapping("/all")
	public List<String> listOfMovies() {
		List<String>movies=new ArrayList<>();
		movies.add("ram");
		movies.add("vikram");
		movies.add("robod");
		
		return movies;
	}
}
