package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import app.model.Note;

@RepositoryRestResource
public interface NoteRepository extends JpaRepository<Note, Integer>{
	
	List<Note> findByNote(Integer note);
	
	@RestResource(path="/findResume")
	List<Note> findByResumeContaining(@Param("r") String resume);
	
	@Query("from Note as n where n.resume = :r")
	List<Note> hola (@Param("r") String resume);
	
	
}
