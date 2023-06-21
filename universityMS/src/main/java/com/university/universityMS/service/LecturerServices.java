package com.university.universityMS.service;


import com.university.universityMS.dto.LecturerDTO;
import com.university.universityMS.entity.Lecturer;
import com.university.universityMS.repo.LecturerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerServices {
    @Autowired
    private LecturerRepo lecturerRepo;

    @Autowired
    private ModelMapper modelMapper;

    public LecturerDTO saveLecturer(LecturerDTO lecturerDTO){
        lecturerRepo.save(modelMapper.map(lecturerDTO, Lecturer.class));
        return lecturerDTO;
    }

    public List<LecturerDTO> getAllLecturer(){
        List<Lecturer>lecturerList=lecturerRepo.findAll();
        return modelMapper.map(lecturerList, new TypeToken<List<LecturerDTO>>(){}.getType());
    }

    public LecturerDTO updateLecturer(LecturerDTO lecturerDTO){
        lecturerRepo.save(modelMapper.map(lecturerDTO, Lecturer.class));
        return lecturerDTO;
    }

    public boolean deleteLecturer(LecturerDTO lecturerDTO){
        lecturerRepo.delete(modelMapper.map(lecturerDTO, Lecturer.class));
        return true;
    }
}
