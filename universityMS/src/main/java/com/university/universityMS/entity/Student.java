package com.university.universityMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "stu_id")
    private int s_id;
    private String s_name;
    private String s_reg_no;
    private String s_index;
    private String s_registered_module;
    private String s_status;
    private String s_email;
    private String s_address;
    private String s_phone_number;
    private String s_registered_subject;
    private String s_subject_results;
    private String s_other_details;
    private String s_qualification;
    private String s_sports;

    //@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    //@PrimaryKeyJoinColumn
    //@JoinColumn(name = "fk_stu_id",referencedColumnName = "stu_id")
    //private Result result;
}

