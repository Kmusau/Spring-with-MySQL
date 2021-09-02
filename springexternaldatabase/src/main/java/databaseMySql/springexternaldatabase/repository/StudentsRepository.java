package databaseMySql.springexternaldatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import databaseMySql.springexternaldatabase.model.Students;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

}