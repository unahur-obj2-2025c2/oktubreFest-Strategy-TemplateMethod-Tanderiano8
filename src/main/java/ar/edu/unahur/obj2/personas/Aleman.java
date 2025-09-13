package ar.edu.unahur.obj2.personas;

import java.util.List;

import ar.edu.unahur.obj2.carpas.Carpa;
import ar.edu.unahur.obj2.jarras.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;

public class Aleman extends Persona {

    public Aleman(Double peso, List<Jarra> jarrasCompradas, Boolean leGustaEscucharMusicaTradicional,
            Double nivelDeAguante) {
        super(peso, jarrasCompradas, leGustaEscucharMusicaTradicional, nivelDeAguante);
        this.nacionalidad = "Alemania";
    }

    @Override
    public Boolean leGusta(Marca marcas) {
        return true;
    }

    @Override
    public Boolean quiereEntrar(Carpa unaCarpa) {
        return super.quiereEntrar(unaCarpa) && unaCarpa.esParLaCantidadDeGente();
    }

}
