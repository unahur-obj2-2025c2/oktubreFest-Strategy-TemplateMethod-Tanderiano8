package ar.edu.unahur.obj2.carpas;

import java.util.List;

import ar.edu.unahur.obj2.jarras.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;
import ar.edu.unahur.obj2.personas.Persona;

public class Carpa {
    private final Integer limiteGente;
    private final Boolean tieneBanda;
    private final Marca marcaDeCerveza;
    private Jarra jarra;
    private List<Persona> personasEnLaCarpa;

    public Carpa(Integer limiteGente, Boolean tieneBanda, Marca marcaDeCerveza, Jarra jarra, List<Persona> personas) {
        this.limiteGente = limiteGente;
        this.tieneBanda = tieneBanda;
        this.marcaDeCerveza = marcaDeCerveza;
        this.jarra = jarra;
        this.personasEnLaCarpa = personas;
    }

    public Boolean esParLaCantidadDeGente() {
        return personasEnLaCarpa.size() % 2 == 0;
    }

    public Integer getLimiteGente() {
        return limiteGente;
    }

    public Boolean getTieneBanda() {
        return tieneBanda;
    }

    public Marca getMarcaDeCerveza() {
        return marcaDeCerveza;
    }

    public Jarra getJarra() {
        return jarra;
    }

    public Boolean dejaIngresar(Persona unaPersona) {
        return this.cantidadDePersonasDentro() < limiteGente && !unaPersona.estaEbria();
    }

    public Integer cantidadDePersonasDentro() {
        return personasEnLaCarpa.size();
    }

    public Boolean puedeEntrar(Persona unaPersona) {
        return unaPersona.quiereEntrar(this) && this.dejaIngresar(unaPersona);
    }

    public void ingresarUnaPersona(Persona unaPersona) {
        if (!this.puedeEntrar(unaPersona)) {
            throw new RuntimeException("La persona " + unaPersona +  " no puede ingresar");
        }
        personasEnLaCarpa.add(unaPersona);

    }

    public void servirJarra(Persona unaPersona, Double capacidadDeseada){
        if (! personasEnLaCarpa.contains(unaPersona)) {
            throw new RuntimeException("La persona " + unaPersona +  " no esta en la carpa");
        }
        Jarra jarraServida = new Jarra(capacidadDeseada, this.getMarcaDeCerveza());
        unaPersona.agregarJarra(jarraServida);
    }

    public Integer cantidadDeEbriosEmpedernidos(){
        return this.ebriosEmpedernidos().size();
    }

    public List<Persona> ebriosEmpedernidos() {
        return personasEnLaCarpa.stream().filter(p -> p.esEbrioEmpedernido()).toList();
    }

    

}
