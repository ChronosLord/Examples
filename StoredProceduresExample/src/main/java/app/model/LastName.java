package app.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="lastName",catalog = "dbo")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class LastName implements java.io.Serializable{
	
	private Integer idName;
	private String name;
	private Integer course;
	private Date	endCourse;
	private Set<Note> note = new HashSet<Note>(0);
	
	public LastName() {
		// TODO Auto-generated constructor stub
	}
	
	public LastName(String name, Integer course, Date endCourse, Set<Note> note) {
		this.name = name;
		this.course = course;
		this.endCourse = endCourse;
		this.note = note;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name= "idName",unique = true ,nullable = false)
	public Integer getIdName() {
		return this.idName;
	}
	public void setIdName(Integer idName) {
		this.idName = idName;
	}
	
	@Column(name = "name",length = 100)
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "course")
	public Integer getCourse() {
		return this.course;
	}
	public void setCourse(Integer course) {
		this.course = course;
	}
	
	@Column(name = "endCourse")
	public Date getEndCourse() {
		return this.endCourse;
	}
	public void setEndCourse(Date endCourse) {
		this.endCourse = endCourse;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lastName")
	public Set<Note> getNote() {
		return this.note;
	}
	public void setNote(Set<Note> note) {
		this.note = note;
	}
}
