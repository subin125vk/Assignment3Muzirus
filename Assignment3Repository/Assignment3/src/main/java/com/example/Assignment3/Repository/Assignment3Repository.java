package com.example.Assignment3.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Assignment3.Entity.SalutationEntity;
@Repository
public interface Assignment3Repository extends JpaRepository<SalutationEntity,Long> {

	Optional<?> findByCode(String code);
	
}
