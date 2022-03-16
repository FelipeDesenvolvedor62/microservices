package com.felipe.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.hrworker.entites.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
