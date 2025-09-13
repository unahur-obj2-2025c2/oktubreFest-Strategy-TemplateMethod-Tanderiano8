package ar.edu.unahur.obj2.jarras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.marcas.CervezaNegra;
import ar.edu.unahur.obj2.marcas.CervezaRoja;
import ar.edu.unahur.obj2.marcas.CervezaRubia;
import ar.edu.unahur.obj2.marcas.Marca;

public class JarraTest {
    Marca heineken;
    Marca corona;
    Marca andes;
    Marca salta;
    Marca andesRoja;
    Marca negra;
    public Jarra jarra1;
    public Jarra jarra2;
    public Jarra jarra3;
    public Jarra jarra4;
    public Jarra jarra5;
    public Jarra jarra6;

    @BeforeEach
    public void inicio() {
        heineken = new CervezaRubia(5.0, "Paises Bajos", 5.6);
        corona = new CervezaRubia(3.0, "Mexico", 4.4);
        andes = new CervezaRubia(4.0, "Argentina", 5.1);
        salta = new CervezaRoja(3.0, "Argentina");
        andesRoja = new CervezaRoja(4.0, "Argentina");
        negra = new CervezaNegra(2.0, "Bolivia" );
        jarra1 = new Jarra(1.0, heineken);
        jarra2 = new Jarra(1.0, corona);
        jarra3 = new Jarra(1.0, andes);
        jarra4 = new Jarra(1.0, andesRoja);
        jarra5 = new Jarra(1.0, salta);
        jarra6 = new Jarra(1.0, negra);
    }

    @Test
    void testContenidoDeAlcoholDeJarra1() {
        Double valorEsperado = 5.6;
        Double valorObtenido = jarra1.contenidoDeAlcohol();
        assertEquals(valorEsperado, valorObtenido);

            }

    @Test
    void testContenidoDeAlcoholDeJarra2() {
        Double valorEsperado = 4.4;
        Double valorObtenido = jarra2.contenidoDeAlcohol();
        assertEquals(valorEsperado, valorObtenido);

    }

    @Test
    void testContenidoDeAlcoholDeJarra3() {
        Double valorEsperado = 5.1;
        Double valorObtenido = jarra3.contenidoDeAlcohol();
        assertEquals(valorEsperado, valorObtenido);

    }


    @Test
    void capacidadDeJarra1() {
        Double capacidadEsperada = 1.0;
        Double capacidadActual = jarra1.getCapacidad();
        assertEquals(capacidadEsperada, capacidadActual);

    }

    @Test
    void capacidadDeJarra2() {
        Double capacidadEsperada = 1.0;
        Double capacidadActual = jarra2.getCapacidad();
        assertEquals(capacidadEsperada, capacidadActual);

    }

    @Test
    void capacidadDeJarra3() {
        Double capacidadEsperada = 1.0;
        Double capacidadActual = jarra3.getCapacidad();
        assertEquals(capacidadEsperada, capacidadActual);

    }

    @Test
    void capacidadDeJarra4() {
        Double capacidadEsperada = 1.0;
        Double capacidadActual = jarra4.getCapacidad();
        assertEquals(capacidadEsperada, capacidadActual);

    }

    @Test
    void capacidadDeJarra5() {
        Double capacidadEsperada = 1.0;
        Double capacidadActual = jarra5.getCapacidad();
        assertEquals(capacidadEsperada, capacidadActual);

    }

    @Test
    void testGetMarca() {

    }

}
