package app.repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import app.model.LastName;

@RepositoryRestResource
public interface NameRepository extends JpaRepository<LastName, Integer>{
	
	List<LastName> findByCourse(@Param("c") Integer course);
	
	List<LastName> findByNameContaining(@Param("n") String name);
	
	List<LastName> findByEndCourseBetween(@Param("d1") Date endCourse,@Param("d2") Date endCourse2);
	
	List<LastName> findByEndCourseBetweenAndCourse(@Param("d1") Date endCourse,@Param("d2") Date endCourse2,@Param("c") Integer course);
	
	List<LastNameInterface> findByName(@Param("n") String name);
}
