package app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table (name = "note", catalog = "dbo")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property= "@id")
public class Note implements java.io.Serializable{
	
	private Integer id;
	private LastName lastName;
	private Practice practice;
	private String resume;
	private Integer note;
	
	public Note() {
		// TODO Auto-generated constructor stub
	}
	
	public Note(LastName lastName, Practice practice, String resume, Integer note) {
		this.lastName = lastName;
		this.practice = practice;
		this.resume = resume;
		this.note = note;
	}
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idName", nullable = false)
	public LastName getLastName() {
		return this.lastName;
	}
	public void setLastName(LastName lastName) {
		this.lastName = lastName;
	}
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "idPc", nullable = false)
	public Practice getPractice() {
		return this.practice;
	}
	public void setPractice(Practice practice) {
		this.practice = practice;
	}
	
	@Column(name = "note")
	public Integer getNote() {
		return note;
	}
	public void setNote(Integer note) {
		this.note = note;
	}
	
	@Column(name = "resume",length = 100)
	public String getResume() {
		return this.resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
}
