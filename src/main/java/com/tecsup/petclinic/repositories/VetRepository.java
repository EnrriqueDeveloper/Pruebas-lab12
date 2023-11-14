package com.tecsup.petclinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.petclinic.entities.Vet;

/**
 * Repository for accessing and managing Vet entities.
 *
 * @author jgomezm
 */
@Repository
public interface VetRepository extends CrudRepository<Vet, Integer> {

    // Fetch vets by first name
    List<Vet> findByFirstName(String firstName);

    // Fetch vets by last name
    List<Vet> findByLastName(String lastName);

    // Override to fetch all vets
    @Override
    List<Vet> findAll();
}
