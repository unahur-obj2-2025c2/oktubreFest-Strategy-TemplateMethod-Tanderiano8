package ar.edu.unahur.obj2.carpas;

import java.util.List;

import ar.edu.unahur.obj2.jarras.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;
import ar.edu.unahur.obj2.personas.Persona;

public class Carpa {
    private final Integer limiteAdmitido;
    private final Boolean tieneBanda;
    private final Marca marcaDeCerveza;
    private Jarra jarra;
    private List<Persona> personas;

   

    public Carpa(Integer limiteAdmitido, Boolean tieneBanda, Marca marcaDeCerveza, Jarra jarra,
            List<Persona> personas) {
        this.limiteAdmitido = limiteAdmitido;
        this.tieneBanda = tieneBanda;
        this.marcaDeCerveza = marcaDeCerveza;
        this.jarra = jarra;
        this.personas = personas;
    }

    public Boolean dejaIngresar(Persona persona){
        return personas.size() < limiteAdmitido && !persona.estaEbria();
    }

    public Boolean puedeEntrarAUnaCarpa(Persona persona){
        return persona.quiereEntrar(this) && this.dejaIngresar(persona);
    }

    public void entrarACarpa(Persona persona){
        if(puedeEntrarAUnaCarpa(persona))
        this.personas.add(persona);
        
    }

    public Integer getLimiteAdmitido() {
        return limiteAdmitido;
    }

    public Integer getTieneBanda() {
        return tieneBanda;
    }

    public Marca getMarcaDeCerveza() {
        return marcaDeCerveza;
    }

    public Jarra getJarra() {
        return jarra;
    }

    
}
