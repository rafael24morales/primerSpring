package com.firstSpring.miproyectouno.frutas;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VerdurasServices {

    List<Verdura> canasta = Arrays.asList(
            new Verdura("Papa","Café"),
            new Verdura("Calabaza","Naranja"),
            new Verdura("Chayote","Verde")
    );

    public List<Verdura> getCanasta() {

        return canasta;
    }
}
