package com.firstSpring.miproyectouno.frutas;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FrutasServices {


    private List<Fruta> canasta = new ArrayList<>(Arrays.asList(
            new Fruta("Limón","verde",true),
            new Fruta("Tomate","verde",false),
            new Fruta("Mango","amarillo",true)
            ));




    public List<Fruta> getCanasta(){
        return canasta;
    }

    public boolean guarda(Fruta fruta) {
        return canasta.add(fruta);
    }
}
