package com.firstSpring.miproyectouno.frutas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Fruta {

    private String nombre;
    private String color;
    private boolean madurez;

}
