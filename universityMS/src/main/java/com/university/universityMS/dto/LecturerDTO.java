package com.university.universityMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LecturerDTO {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phone_number;
    private String teaching_subject;
    private String status;
    private String qualifications;
    private String department;
    private String other;
}
