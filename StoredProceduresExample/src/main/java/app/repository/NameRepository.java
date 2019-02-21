package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import app.model.LastName;

@RepositoryRestResource
public interface NameRepository extends JpaRepository<LastName, Integer>{
	
}
