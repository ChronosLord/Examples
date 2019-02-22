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
@Table(name = "practice", catalog = "dbo")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property = "@id")
public class Practice implements java.io.Serializable{
	
	private Integer idPc;
	private Integer weightPc;
	private Date datePractice;
	private String resume;
	private Set<Note> note = new HashSet<Note>(0);
	
	public Practice() {
		// TODO Auto-generated constructor stub
	}
	
	public Practice(Integer weightPc, Date datePractice, String resume, Set<Note> note) {
		this.weightPc = weightPc;
		this.datePractice = datePractice;
		this.resume = resume;
		this.note = note;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "idPc", unique = true , nullable =false)
	public Integer getIdPc() {
		return this.idPc;
	}
	public void setIdPc(Integer idPc) {
		this.idPc = idPc;
	}
	
	@Column(name = "weightPc")
	public Integer getWeightPc() {
		return this.weightPc;
	}
	public void setWeightPc(Integer weightPc) {
		this.weightPc = weightPc;
	}
	
	@Column(name = "datePractice")
	public Date getDatePractice() {
		return this.datePractice;
	}
	public void setDatePractice(Date datePractice) {
		this.datePractice = datePractice;
	}
	
	@Column(name = "resume",length = 100)
	public String getResume() {
		return this.resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "practice")
	public Set<Note> getNote() {
		return this.note;
	}
	public void setNote(Set<Note> note) {
		this.note = note;
	}
}
