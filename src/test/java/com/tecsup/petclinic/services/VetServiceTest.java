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
    public void testDeleteVet() {

        String FIRST_NAME = "James";
        String LAST_NAME = "Carter";

        // ------------ Crear Veterinario ---------------
        Vet vet = new Vet(FIRST_NAME, LAST_NAME);
        vet = this.vetService.create(vet);
        log.info("Veterinario creado: " + vet);

        // ------------ Eliminar Veterinario ---------------
        try {
            this.vetService.delete(vet.getId());
        } catch (VetNotFoundException e) {
            fail(e.getMessage());
        }

        // ------------ Validar Eliminación ---------------
        try {
            this.vetService.findById(vet.getId());
            assertTrue(false, "Se esperaba VetNotFoundException");
        } catch (VetNotFoundException e) {
            assertTrue(true);
        }

    }
}
