/**
 * @author Deeksha Chelamalla - S554975
 */
package com.patternsProject.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.patternsProject.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}
