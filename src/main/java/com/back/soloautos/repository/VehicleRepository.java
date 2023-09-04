package com.back.soloautos.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back.soloautos.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	Optional<Vehicle> findById(final Long id);
	
	//List<Vehicle> findByBrandId(Long brandId);
	
	Page<Vehicle> findByTitle(String searchTerm,Pageable pageable);
	
}
