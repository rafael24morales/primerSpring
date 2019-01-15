package com.firstSpring.miproyectouno.musica;

public class Celular implements IReproduccion{
    
    @Override
    public String reproducirLaRola() {
        return "Reproduciendo desde " + getClass().getSimpleName();
    }
}
