package com.firstSpring.miproyectouno.frutas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FrutasController {

    @Autowired
    FrutasServices frutasServices;

    @Autowired
    VerdurasServices verdurasServices;


    @RequestMapping("/frutas")
    public List<Fruta> getFrutas(){

        return frutasServices.getCanasta();
    }


    //O tambien usar @PostMapping("/frutas)-- es lo meesmo
    //@RequestBody funciona para recuperar el cuerpo de la solicitud
    @RequestMapping(value="/frutas",method = RequestMethod.POST)
    public boolean postFruta(@RequestBody Fruta fruta){
        System.out.println(fruta);
        boolean SeHizo = frutasServices.guarda(fruta);

        return SeHizo;
    }





    @RequestMapping("/verduras")
    public List<Verdura> getVerduras(){

        return verdurasServices.getCanasta();
    }




}
