package com.firstSpring.miproyectouno.musica;

public class Vinilo implements IReproduccion {

    @Override
    public String reproducirLaRola() {
        return "Reproduciendo desde " + getClass().getSimpleName();
    }
}
