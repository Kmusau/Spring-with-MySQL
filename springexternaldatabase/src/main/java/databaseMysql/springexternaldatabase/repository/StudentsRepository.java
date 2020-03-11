package databaseMysql.springexternaldatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import databaseMysql.springexternaldatabase.DTO.Students;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
