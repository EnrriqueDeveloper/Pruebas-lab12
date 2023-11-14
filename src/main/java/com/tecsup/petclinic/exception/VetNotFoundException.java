package com.tecsup.petclinic.exception;

/**
 * Exception thrown when a Vet is not found.
 *
 * @author jgomezm
 */
public class VetNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public VetNotFoundException(String message) {
        super(message);
    }
}
