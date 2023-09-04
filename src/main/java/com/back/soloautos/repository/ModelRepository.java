package com.back.soloautos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.back.soloautos.entity.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
	
	@Query("SELECT m FROM Modelo m WHERE m.modelName LIKE %:searchText%")
	List<Model> findByModelNameLike(@Param("searchText")String searchText);

}
