package databaseMySql.springexternaldatabase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import databaseMySql.springexternaldatabase.model.Students;
import databaseMySql.springexternaldatabase.repository.StudentsRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

	@Autowired
	StudentsRepository studentsrepository;
	
	@GetMapping("/hello")
	public String sayhi() {
		return "Hello, We getting started";
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Students>>  getAll() {
		List<Students> stude = studentsrepository.findAll();
		return new ResponseEntity<> (stude, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public List<Students> addStudents(@RequestBody Students stude) {
		studentsrepository.save(stude);
		return studentsrepository.findAll();
	}
	
	@GetMapping("/student/{idnum}")
	public Optional<Students> singlestudent(@PathVariable int idnum) {
		return studentsrepository.findById(idnum);
	}
	
	@PutMapping("/update-student/{idnum}")
	public ResponseEntity<Students> updatestudent(@RequestBody Students studeDetails, @PathVariable int idnum) {
		Students stude = studentsrepository.findById(idnum)
			.orElseThrow();
		stude.setFname(studeDetails.getFname());
		stude.setLname(studeDetails.getLname());
		stude.setCourse(studeDetails.getCourse());
		stude.setPhoneNumber(studeDetails.getPhoneNumber());
		stude.setRegNumber(studeDetails.getRegNumber());
		stude.setImageUrl(studeDetails.getImageUrl());
		
		Students updatedStudent = studentsrepository.save(stude);
		return ResponseEntity.ok(updatedStudent);
	}
	
	@DeleteMapping("student/{idnum}")
	public List<Students> deletestudent(@PathVariable int idnum) {
		studentsrepository.deleteById(idnum);
		return studentsrepository.findAll();
	}
	
	
}
