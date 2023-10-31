package com.gestion.de.clases.parcial2;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class Resourcenotfoundinexepcions extends RuntimeException {
    private static final long serialVersionUID = 1l;
    public Resourcenotfoundinexepcions(String mensaje) {
        super(mensaje);

    }
}
