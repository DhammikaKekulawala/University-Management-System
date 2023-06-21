package com.university.universityMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "result")
public class Result{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int r_id;
    private String s1000;
    private String s1001;
    private String s1002;
    private String s1003;
    private String s1004;
    private String s1005;

    //@OneToOne
    //@MapsId
    //@JoinColumn(name = "result_id")
    //private Student student;
}
