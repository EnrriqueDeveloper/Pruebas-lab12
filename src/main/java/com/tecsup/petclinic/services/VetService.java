package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.entities.Vet;
import com.tecsup.petclinic.exception.VetNotFoundException;

/**
 * Service interface for managing Vet entities.
 *
 * @author jgomezm
 */
public interface VetService {

    /**
     * Create a new vet.
     *
     * @param vet The vet to be created.
     * @return The created vet.
     */
    Vet create(Vet vet);

    /**
     * Update an existing vet.
     *
     * @param vet The vet to be updated.
     * @return The updated vet.
     */
    Vet update(Vet vet);

    /**
     * Delete a vet by its ID.
     *
     * @param id The ID of the vet to be deleted.
     * @throws VetNotFoundException If the vet with the given ID is not found.
     */
    void delete(Integer id) throws VetNotFoundException;

    /**
     * Find a vet by its ID.
     *
     * @param id The ID of the vet to be found.
     * @return The found vet.
     * @throws VetNotFoundException If the vet with the given ID is not found.
     */
    Vet findById(Integer id) throws VetNotFoundException;

    /**
     * Find vets by their first name.
     *
     * @param firstName The first name of the vets to be found.
     * @return The list of vets with the given first name.
     */
    List<Vet> findByFirstName(String firstName);

    /**
     * Find vets by their last name.
     *
     * @param lastName The last name of the vets to be found.
     * @return The list of vets with the given last name.
     */
    List<Vet> findByLastName(String lastName);

    /**
     * Find all vets.
     *
     * @return The list of all vets.
     */
    List<Vet> findAll();
}
