package com.example.songsapi.repositories;

import com.example.songsapi.models.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SongRepository extends CrudRepository<Song, Long> {

}
