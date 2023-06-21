package com.university.universityMS.controller;


import com.university.universityMS.dto.LecturerDTO;
import com.university.universityMS.dto.ResultDTO;
import com.university.universityMS.dto.StudentDTO;
import com.university.universityMS.dto.WorkerDTO;
import com.university.universityMS.service.LecturerServices;
import com.university.universityMS.service.ResultServices;
import com.university.universityMS.service.StudentServices;
import com.university.universityMS.service.WorkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/university")
public class UserController {
    @Autowired
    private StudentServices studentServices;

    @Autowired
    private LecturerServices lecturerServices;

    @Autowired
    private WorkerServices workerServices;

    @Autowired
    private ResultServices resultServices;

    //Student
    @GetMapping("/view")
    public List<StudentDTO> getUser(){
        return studentServices.getAllStudents();
    }
    @PostMapping(value = "/post")
    public StudentDTO postUser(@RequestBody StudentDTO studentDTO){
        return studentServices.saveStudent(studentDTO);
    }
    @PutMapping("/put")
    public StudentDTO putUser(@RequestBody StudentDTO studentDTO){
        return studentServices.updateStudent(studentDTO);
    }
    @DeleteMapping("/delete")
    public boolean deleteuser(@RequestBody StudentDTO studentDTO){
        return studentServices.deleteStudent(studentDTO);
    }

    //Lecture
    @PostMapping(value = "/saveLecture")
    public LecturerDTO savelecture(@RequestBody LecturerDTO lecturerDTO){
        return lecturerServices.saveLecturer(lecturerDTO);
    }

    @GetMapping("/lectureDetails")
    public List<LecturerDTO> getlecturer(){
        return lecturerServices.getAllLecturer();
    }

    @PutMapping("/updateLecturer")
    public LecturerDTO updatelecture(@RequestBody LecturerDTO lecturerDTO){
        return lecturerServices.updateLecturer(lecturerDTO);
    }

    @DeleteMapping("/deleteLecture")
    public boolean deletelecture(@RequestBody LecturerDTO lecturerDTO){
        return lecturerServices.deleteLecturer(lecturerDTO);
    }

    //worker
    @PostMapping(value = "/addWorker")
    public WorkerDTO saveworker(@RequestBody WorkerDTO workerDTO) {
        return workerServices.saveWorker(workerDTO);
    }

    @GetMapping("/getWorker")
    public List<WorkerDTO> getWorker(){
        return workerServices.getWorker();
    }
    @PutMapping("/updateWorker")
    public WorkerDTO updateWorker(@RequestBody WorkerDTO workerDTO){
        return workerServices.updateWorker(workerDTO);
    }

    @DeleteMapping("/deleteWorker")
    public boolean deleteWorker(@RequestBody WorkerDTO workerDTO){
        return workerServices.deleteWorker(workerDTO);
    }

    //Result
    @PostMapping(value = "/saveResults")
    public ResultDTO saveResult(@RequestBody ResultDTO resultDTO){
        return resultServices.saveResult(resultDTO);
    }
    @GetMapping("/getResult")
    public List<ResultDTO> getResult(){
        return resultServices.getResult();
    }
    @PutMapping("/updateResult")
    public ResultDTO updateResult(@RequestBody ResultDTO resultDTO){
        return resultServices.updateResult(resultDTO);
    }
    @DeleteMapping("/deleteResult")
    public boolean deleteResult(@RequestBody ResultDTO resultDTO){
        return resultServices.deleteResult(resultDTO);
    }



}
