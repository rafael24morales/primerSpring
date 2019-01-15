package com.firstSpring.miproyectouno.musica;

public class Cassette implements IReproduccion {

    @Override
    public String reproducirLaRola() {
        return "Reproduciendo desde " + getClass().getSimpleName();
    }
}
