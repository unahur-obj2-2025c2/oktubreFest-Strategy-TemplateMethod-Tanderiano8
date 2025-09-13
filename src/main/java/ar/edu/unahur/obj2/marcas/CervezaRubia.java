package ar.edu.unahur.obj2.marcas;

public class CervezaRubia extends Marca {

    private Double graduacion;
    
    public CervezaRubia(Double lupulo, String pais, Double graduacion) {
        super(lupulo, pais);
        this.graduacion = graduacion;
    }

    @Override
    public Double graduacion() {
        return graduacion;
    }

}
