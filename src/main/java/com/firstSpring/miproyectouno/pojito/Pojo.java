package com.firstSpring.miproyectouno.pojito;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration
@Component("miPojito")
public class Pojo {


    @Value("${elnombrequequiera}")
    private String saludo1;


    @Value("${elotro}")
    private String saludo2;

    @Value("${por3}")
    private String saludo3;

    public Pojo() {
    }

    public Pojo(String saludo1, String saludo2, String saludo3) {
        this.saludo1 = saludo1;
        this.saludo2 = saludo2;
        this.saludo3 = saludo3;
    }

    public String getSaludo1() {
        return saludo1;
    }

    public void setSaludo1(String saludo1) {
        this.saludo1 = saludo1;
    }

    public String getSaludo2() {
        return saludo2;
    }

    public void setSaludo2(String saludo2) {
        this.saludo2 = saludo2;
    }

    public String getSaludo3() {
        return saludo3;
    }

    public void setSaludo3(String saludo3) {
        this.saludo3 = saludo3;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "saludo1='" + saludo1 + '\'' +
                ", saludo2='" + saludo2 + '\'' +
                ", saludo3='" + saludo3 + '\'' +
                '}';
    }
}
