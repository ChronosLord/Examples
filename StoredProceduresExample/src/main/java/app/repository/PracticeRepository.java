package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import app.model.Practice;

@RepositoryRestResource
public interface PracticeRepository extends JpaRepository<Practice, Integer>{

}
