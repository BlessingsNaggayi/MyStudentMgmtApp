package edu.mum.cs.cs425.studentmgmt.model;

import jakarta.persistence.*;
import jakarta.persistence.OneToOne;

@Entity
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transcriptId;

    @Column(nullable = false)
    private String degreeTitle;


    // Relationship with Student
    @OneToOne(mappedBy = "transcript")
    private Student student;
}
