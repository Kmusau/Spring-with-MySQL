package databaseMySql.springexternaldatabase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idnum")
	private int idnum;
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "course")
	private String course;
	@Column(name = "phoneNumber")
	private String phoneNumber;
	@Column(name = "regNumber")
	private String regNumber;
	@Column(name = "imageUrl")
	private String imageUrl;
	
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	

	
}
