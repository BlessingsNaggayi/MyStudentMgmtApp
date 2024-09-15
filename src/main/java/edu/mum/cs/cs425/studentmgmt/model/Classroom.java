package edu.mum.cs.cs425.studentmgmt.model;

import java.util.List;

import jakarta.persistence.*;

public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomId;

    @Column(nullable = false)
    private String buildingName;


    @Column(nullable = false)
    private String roomNumber;


    // Relationship with Student (assuming many-to-many relationship)
    @ManyToMany
    @JoinTable(name = "student_classroom",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "classroom_id"))
    private List<Student> students;
}
