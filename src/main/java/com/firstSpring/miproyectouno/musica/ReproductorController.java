package com.firstSpring.miproyectouno.musica;

import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;

@Controller
public class ReproductorController {

    @Autowired
    private IReproduccion cassette;

    @Autowired
    private IReproduccion vinilo;

    @RequestMapping(value = "/cassette" , method = RequestMethod.GET)
    @ResponseBody
    public String getCassette(){
        //Aquí va la lógica de negocio para ésta solicitud
        return cassette.reproducirLaRola();
    }

    @GetMapping("/vinilo")
    @ResponseBody
    public String getVinilo(){
        //Aquí va la lógica de negocio para ésta solicitud
        return vinilo.reproducirLaRola();
    }


}
