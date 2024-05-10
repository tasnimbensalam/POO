package com.example.tp5SPRINGBOOT;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandePetitDejeunerRepository extends
JpaRepository<PetitDejeuner, Long> {

	

	List<PetitDejeuner> findByChambre(int nom);


	List<PetitDejeuner> findByCommentairesContaining(String com);


}
