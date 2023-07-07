package com.cinema.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cinema.entity.Movie;
import com.cinema.repository.MovieRepository;

@Repository
public class MovieDao {
	@Autowired
	MovieRepository mr;

	public String setMovie(Movie m) {
		mr.save(m);
		return "Saved";
	}

	public String setAllMovie(List<Movie> m) {
		mr.saveAll(m);
		return "saved";
	}

	public Movie findbyId(int a) {
		return mr.findById(a).get();
	}

	public List<Movie> getAll() {
		
		return mr.findAll();
	}

	public String set1Movie(Movie m) {
		mr.save(m);
		return "success";
	}

	public String deleteById(int a) {
		mr.deleteById(a);
		return "succesfully deleted";
	}

	public String putMovie(Movie m) {
		mr.save(m);
		return "Updated succesfully";
	}

}
