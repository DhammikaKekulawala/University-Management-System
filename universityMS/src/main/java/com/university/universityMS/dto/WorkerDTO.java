package com.university.universityMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerDTO {
    private int w_id;
    private String w_name;
    private String w_email;
    private String w_address;
    private String w_phone_number;
    private String w_department;
    private String w_other;
    private String w_status;
}
