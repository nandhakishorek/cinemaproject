package com.cinema.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.entity.Movie;
import com.cinema.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	MovieService ms;
	public static Logger log = Logger.getLogger(MovieController.class);
	

	@PostMapping(value = "/setMovie")
	public String setMovie(@RequestBody Movie m) {
		return ms.setMovie(m);
	}

	@PostMapping(value = "/setAllMovie")
	public String setAllMovie(@RequestBody List<Movie> m) {
		return ms.setAllMovie(m);
	}
	

	@GetMapping(value="/findbyId/{a}")
	public Movie findbyId(@PathVariable int a) {
		
		PropertyConfigurator.configure("logproperties");
		log.info(log);
		log.info("Started");
		log.warn("Running");
		log.debug("Error");
		log.fatal("Not Started");
		log.error("compile error");
		return ms.findbyId(a);
	}
	@GetMapping(value="/getAll")
	public List<Movie> getAll() {
		PropertyConfigurator.configure("logproperties");
		log.info(ms.getAll());
		return ms.getAll();
	}
	@PostMapping(value="/set1Movie")
	public String set1Movie(@RequestBody Movie m) {
		PropertyConfigurator.configure("logproperties");
		log.info(ms.set1Movie(m));
		return ms.set1Movie(m);
	}
	@DeleteMapping(value="/deleteById/{a}")
    public String deleteById(@PathVariable int a) {
		PropertyConfigurator.configure("logproperties");
		log.info(ms.deleteById(a));
		return ms.deleteById(a);
	}
	@PutMapping(value="/putMovie")
	public String putMovie(@RequestBody Movie m) {
		PropertyConfigurator.configure("logproperties");
		log.info(ms.putMovie(m));
		return ms.putMovie(m);
	}
	
}
