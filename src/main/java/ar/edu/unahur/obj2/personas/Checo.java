package ar.edu.unahur.obj2.personas;

import java.util.List;

import ar.edu.unahur.obj2.jarras.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;

public class Checo extends Persona {

    public Checo(Double peso, List<Jarra> jarrasCompradas, Boolean leGustaEscucharMusicaTradicional,
            Double nivelDeAguante) {
        super(peso, jarrasCompradas, leGustaEscucharMusicaTradicional, nivelDeAguante);
        this.nacionalidad = "Republica Checa";
    }

    @Override
    public Boolean leGusta(Marca marca) {
        return marca.graduacion() > 0.08;
    }

}
