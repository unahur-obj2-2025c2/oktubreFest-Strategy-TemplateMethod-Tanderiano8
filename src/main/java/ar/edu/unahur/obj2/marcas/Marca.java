package ar.edu.unahur.obj2.marcas;

public abstract class Marca {
    protected Double lupulo;
    private String pais;

    public Marca(Double lupulo, String pais) {
        this.lupulo = lupulo;
        this.pais = pais;
    }

    public Double getLupulo() {
        return lupulo;
    }

    public String getPais() {
        return pais;
    }

    public abstract Double graduacion();
}
