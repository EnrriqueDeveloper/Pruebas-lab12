package com.tecsup.petclinic.services;

import static org.junit.jupiter.api.Assertions.*;

import com.tecsup.petclinic.entities.Vet;
import com.tecsup.petclinic.exception.VetNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class VetServiceTest {

    @Autowired
    private VetService vetService;


    @Test
    public void testUpdateVet() {

        String VET_FIRST_NAME = "James";
        String VET_LAST_NAME = "Carter";

        String UP_VET_FIRST_NAME = "Antonio";
        String UP_VET_LAST_NAME = "Guzman";

        Vet vet = new Vet(VET_FIRST_NAME, VET_LAST_NAME);
        // ------------ Create ---------------
        log.info("Creating vet: {}", vet);
        Vet vetCreated = this.vetService.create(vet);
        log.info("Vet created: {}", vetCreated);
        // ------------ Update ---------------
        // Prepare data for update
        vetCreated.setFirstName(UP_VET_FIRST_NAME);
        vetCreated.setLastName(UP_VET_LAST_NAME);
        // Actualiza otros atributos si es necesario
        // ...
        // Execute update
        Vet updatedVet = this.vetService.update(vetCreated);
        log.info("Vet updated: {}", updatedVet);


        // ------------ Validation ---------------

        // EXPECTED vs. ACTUAL
        assertEquals(UP_VET_FIRST_NAME, updatedVet.getFirstName());
        assertEquals(UP_VET_LAST_NAME, updatedVet.getLastName());
        // Verifica otros atributos actualizados
        // ...

    }

}

