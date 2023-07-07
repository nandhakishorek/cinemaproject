package com.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cinema.Dao.MovieDao;
import com.cinema.entity.Movie;

@Service
public class MovieService {
	@Autowired
	MovieDao md;

	public String setMovie(Movie m) {
		return md.setMovie(m);
	}

	public String setAllMovie(List<Movie> m) {
		return md.setAllMovie(m);
	}

	public Movie findbyId(int a) {
		return md.findbyId(a);
	}

	public List<Movie> getAll() {
		return md.getAll();
	}

	public String set1Movie(Movie m) {
		return md.set1Movie(m);
	}

	public String deleteById(int a) {
		return md.deleteById(a);
	}

	public String putMovie(Movie m) {
		return md.putMovie(m);
	}

}
