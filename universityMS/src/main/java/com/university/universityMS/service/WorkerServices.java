package com.university.universityMS.service;

import com.university.universityMS.dto.WorkerDTO;
import com.university.universityMS.entity.Worker;
import com.university.universityMS.repo.WorkerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServices {

    @Autowired
    private WorkerRepo workerRepo;

    @Autowired
    private ModelMapper modelMapper;

    public WorkerDTO saveWorker(WorkerDTO workerDTO){
        workerRepo.save(modelMapper.map(workerDTO, Worker.class));
        return workerDTO;
    }

    public List<WorkerDTO> getWorker(){
        List<Worker>workerList=workerRepo.findAll();
        return modelMapper.map(workerList, new TypeToken<List<WorkerDTO>>(){}.getType());

    }
    public  WorkerDTO updateWorker(WorkerDTO workerDTO){
        workerRepo.save(modelMapper.map(workerDTO, Worker.class));
        return workerDTO;
    }

    public boolean deleteWorker(WorkerDTO workerDTO){
        workerRepo.delete(modelMapper.map(workerDTO,Worker.class));
        return true;
    }
}
