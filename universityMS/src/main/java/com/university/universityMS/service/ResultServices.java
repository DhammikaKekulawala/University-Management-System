package com.university.universityMS.service;

import com.university.universityMS.dto.ResultDTO;
import com.university.universityMS.entity.Result;
import com.university.universityMS.repo.ResultRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServices {
    @Autowired
    private ResultRepo resultRepo;

    @Autowired
    private ModelMapper modelMapper;

    public ResultDTO saveResult(ResultDTO resultDTO){
        resultRepo.save(modelMapper.map(resultDTO, Result.class));
        return resultDTO;
    }
    public List<ResultDTO> getResult(){
        List<Result>resultList=resultRepo.findAll();
        return modelMapper.map(resultList, new TypeToken<List<ResultDTO>>(){}.getType());
    }

    public ResultDTO updateResult(ResultDTO resultDTO){
        resultRepo.save(modelMapper.map(resultDTO, Result.class));
        return resultDTO;
    }

    public boolean deleteResult(ResultDTO resultDTO){
        resultRepo.delete(modelMapper.map(resultDTO, Result.class));
        return true;

    }

}
