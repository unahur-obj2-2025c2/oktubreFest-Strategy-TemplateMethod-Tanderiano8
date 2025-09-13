package ar.edu.unahur.obj2.marcas;

public class CervezaRoja extends CervezaNegra{

    
    public CervezaRoja(Double lupulo, String pais) {
        super(lupulo, pais);
    }

    @Override
    public Double graduacion() {
       return super.graduacion() * 1.25;
    }

} 


