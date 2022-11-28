package com.example.Assignment3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assignment3.Entity.SalutationEntity;
import com.example.Assignment3.Repository.Assignment3Repository;

@Service("assignment3Service")
public class Assignment3Service {

	@Autowired
	Assignment3Repository assignment3Repository;

	public void addSalutationMst(SalutationEntity salutationEntity) {
		assignment3Repository.save(salutationEntity);
	}

	public void updateSalutationMst(SalutationEntity salutationEntity) {
		System.out.println(salutationEntity.getSalutationid());
		assignment3Repository.save(salutationEntity);

	}

	public void deleteById(long id) {
		assignment3Repository.deleteById(id);
	}

	public List<SalutationEntity> getAllSalutationMst() {
		return assignment3Repository.findAll();

	}

	public Optional<?> getSalutationID(long l) {
		return assignment3Repository.findById((long) l);
	}

	public Optional<?> findByCode(String code) {
		return assignment3Repository.findByCode(code);
	}
}
