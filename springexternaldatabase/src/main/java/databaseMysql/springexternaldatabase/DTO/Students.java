package databaseMysql.springexternaldatabase.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {

	@Id
	@Column(name = "idnum")
	private int idnum;
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "course")
	private String course;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdnum() {
		return idnum;
	}
	public void setIdnum(int idnum) {
		this.idnum = idnum;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
