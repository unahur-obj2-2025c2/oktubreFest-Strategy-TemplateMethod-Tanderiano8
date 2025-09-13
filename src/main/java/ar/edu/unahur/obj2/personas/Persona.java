package ar.edu.unahur.obj2.personas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.carpas.Carpa;
import ar.edu.unahur.obj2.jarras.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;

public abstract class Persona {
    private Double peso;
    protected List<Jarra> jarrasCompradas;
    private Boolean leGustaEscucharMusicaTradicional;
    private Double nivelDeAguante;
    protected String nacionalidad;

    public Persona(Double peso, List<Jarra> jarrasCompradas, Boolean leGustaEscucharMusicaTradicional,
            Double nivelDeAguante) {
        this.peso = peso;
        this.jarrasCompradas = jarrasCompradas;
        this.leGustaEscucharMusicaTradicional = leGustaEscucharMusicaTradicional;
        this.nivelDeAguante = nivelDeAguante;

    }

    public Boolean estaEbria() {
        return this.totalDeAlcohol() * peso > nivelDeAguante;
    }

    public Double totalDeAlcohol() {
        return jarrasCompradas.stream().mapToDouble(j -> j.contenidoDeAlcohol()).sum();
    }

    public abstract Boolean leGusta(Marca marcas);

    public Boolean quiereEntrar(Carpa unaCarpa) {
        return this.leGusta(unaCarpa.getMarcaDeCerveza())
                && unaCarpa.getTieneBanda().equals(leGustaEscucharMusicaTradicional);
    }

    public void ingresarACarpa(Carpa unaCarpa) {
        unaCarpa.ingresarUnaPersona(this);
    }

    public void agregarJarra(Jarra unaJarra) {
        jarrasCompradas.add(unaJarra);
    }

    public Boolean esEbrioEmpedernido() {
        return jarrasCompradas.stream().allMatch(j -> j.getCapacidad() >= 1.0);
    }

    public Boolean esPatriota() {
        return this.comproSoloCervezaDeSuNacionalidad();
    }

    public Boolean comproSoloCervezaDeSuNacionalidad() {
        return jarrasCompradas.stream().allMatch(j -> j.getMarca().getPais().equals(nacionalidad));
    }

    public Boolean sonCompatibles(Persona unaPersona) {
        Set<Marca> marcasPersona1 = this.jarrasCompradas.stream().map(j -> j.getMarca()).collect(Collectors.toSet());
        Set<Marca> marcasPersona2 = unaPersona.jarrasCompradas.stream().map(j -> j.getMarca()).collect(Collectors.toSet());

        // 1. Calcular las coincidencias (intersección)
        Set<Marca> interseccion = new HashSet<>(marcasPersona1);
        interseccion.retainAll(marcasPersona2);
        int coincidencias = interseccion.size();

        // 2. Calcular las diferencias
        Set<Marca> union = new HashSet<>(marcasPersona1);
        union.addAll(marcasPersona2);
        int diferencias = union.size() - coincidencias;

        // 3. La condición es que coincidencias > diferencias
        return coincidencias > diferencias;
    }

    public Integer numCoincidencias(Persona unaPersona) {

    }

}
