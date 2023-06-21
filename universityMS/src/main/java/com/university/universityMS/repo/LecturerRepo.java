package com.university.universityMS.repo;

import com.university.universityMS.entity.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepo extends JpaRepository<Lecturer, Integer> {
}
