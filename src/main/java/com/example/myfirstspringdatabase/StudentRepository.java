package com.example.myfirstspringdatabase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFirstNameContaining(String firstName);
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Student getStudentByEmailAddress(String email);

}

