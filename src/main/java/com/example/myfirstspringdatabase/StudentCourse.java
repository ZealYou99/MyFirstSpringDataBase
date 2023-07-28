package com.example.myfirstspringdatabase;

import jakarta.persistence.*;

@Entity(name="student_course_table")
@Table(name="student_course_table")
public class StudentCourse {
    @Id
    @SequenceGenerator(
            name = "student_course_sequence",
            sequenceName = "student_course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_course_sequence"
    )
    @Column(
            name="id",
            updatable = false
    )
    private long id;
    @Column(
            name = "student_id",
            nullable = false,
            columnDefinition = "INTEGER"
    )
    private long student_id;
    @Column(
            name = "course_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String course_name;

    public StudentCourse(long student_id, String course_name) {
        this.student_id = student_id;
        this.course_name = course_name;
    }

    public StudentCourse() {
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", course_name='" + course_name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}
