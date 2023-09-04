package com.back.soloautos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.back.soloautos.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
	Optional<Brand> findById(final Long id);
	
	List<Brand> findAll();
	
	@Query("SELECT b FROM Marca b WHERE b.brandName LIKE %:searchText%")
	List<Brand> findByBrandNameLike(@Param("searchText") String searchText);

}
