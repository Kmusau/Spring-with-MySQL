package databaseMysql.springexternaldatabase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import databaseMysql.springexternaldatabase.DTO.Students;
import databaseMysql.springexternaldatabase.repository.StudentsRepository;

@RestController
public class Controller {
	
	@Autowired
	StudentsRepository studentsrepository;
	
	@GetMapping("/hello")
	public String sayhi() {
		return "Hello, We getting started";
	}
	
	@GetMapping("/students")
	public List<Students> getAll() {
		return studentsrepository.findAll();
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
	
	@PutMapping("/student/{idnum}")
	public List<Students> updatestudent(@RequestBody Students stude, @PathVariable int idnum) {
		studentsrepository.save(stude);
		return studentsrepository.findAll();
	}
	
	@DeleteMapping("student/{idnum}")
	public List<Students> deletestudent(@PathVariable int idnum) {
		studentsrepository.deleteById(idnum);
		return studentsrepository.findAll();
	}
	
}
