package com.android.example.github.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.example.github.vo.MovieInfoo;
import com.android.example.github.vo.MovieResponse;

import java.util.List;

@Dao
public interface MovieDao {
    @Insert
    void insertMovie(MovieInfoo movieInfoo);

    @Insert
    void insertMovieList(List<MovieInfoo> movieList);

//    @Query("SELECT * FROM MovieInfoo")
//    LiveData<List<MovieResponse>> getAllMovies();

    @Query("SELECT * FROM MovieInfoo WHERE original_title = :itemId")
    LiveData<MovieInfoo> getMovieById(String itemId);

    @Delete
    void deleteMovie(MovieInfoo item);
}
