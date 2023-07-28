package com.example.myfirstspringdatabase;

import jakarta.persistence.*;

@Entity(name = "course_table")
@Table(
        name = "course_table",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "course_name_unique",
                        columnNames = "course_name"
                )
        }
)
public class Course {
    @Id
    @Column(
            name = "course_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String course_name;
    @Column(
            name = "book_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String book_name;
    @Column(
            name = "teacher_code",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String teacher_code;
    @Column(
            name = "course_length",
            nullable = false,
            columnDefinition = "INTEGER"
    )
    private Integer course_length;
}
