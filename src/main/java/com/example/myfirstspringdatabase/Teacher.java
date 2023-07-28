package com.example.myfirstspringdatabase;

import jakarta.persistence.*;

@Entity(name = "teacher_table")
@Table(
        name = "teacher_table",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "teacher_teacher_code_unique",
                        columnNames = "teacher_code"

                )
        }
)
public class Teacher {
    @Id
    @Column(
            name = "teacher_code",
            updatable = false,
            nullable = false,
            columnDefinition = "INTEGER"
    )
    private Integer teacher_code;
    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String first_name;
    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String last_name;
    @Column(
            name = "age",
            nullable = false,
            columnDefinition = "INTEGER"
    )
    private Integer age;

    public Integer getTeacher_code() {
        return teacher_code;
    }

    public void setTeacher_code(Integer teacher_code) {
        this.teacher_code = teacher_code;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_code=" + teacher_code +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                '}';
    }

    public Teacher(Integer teacher_code, String first_name, String last_name, Integer age) {
        this.teacher_code = teacher_code;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public Teacher() {
    }
}
