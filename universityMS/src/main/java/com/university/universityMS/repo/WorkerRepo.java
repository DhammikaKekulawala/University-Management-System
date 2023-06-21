package com.university.universityMS.repo;

import com.university.universityMS.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepo extends JpaRepository<Worker, Integer> {
}
