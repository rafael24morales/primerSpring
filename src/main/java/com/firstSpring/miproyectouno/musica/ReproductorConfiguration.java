package com.firstSpring.miproyectouno.musica;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReproductorConfiguration {

    @Bean
    public IReproduccion cassette(){
        return new Cassette();
    }

    @Bean
    public IReproduccion vinilo(){
        return new Vinilo();
    }

    @Bean
    public IReproduccion celular(){
        return new Celular();
    }
}
