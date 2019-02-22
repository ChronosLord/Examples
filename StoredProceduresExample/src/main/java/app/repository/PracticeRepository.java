package app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import app.model.Practice;

@RepositoryRestResource
public interface PracticeRepository extends JpaRepository<Practice, Integer>{
	
	List<Practice> findByWeightPc(@Param("w") Integer weightPc);
	
	List<Practice> findByResumeContaining(@Param("r") String resume);
	
	List<Practice> findByDatePracticeBetween(@Param("d1") Date datePractice,@Param("d2") Date datePractice2);
	
	List<Practice> findByDatePracticeBetweenAndWeightPc(@Param("d1") Date datePractice,@Param("d2") Date datePractice2,@Param("w") Integer weightPc);

}
