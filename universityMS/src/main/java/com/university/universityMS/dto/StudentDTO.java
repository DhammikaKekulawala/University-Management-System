package com.university.universityMS.dto;

import com.university.universityMS.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
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


}
