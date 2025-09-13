package ar.edu.unahur.obj2.marcas;

public class CervezaNegra extends Marca {

    

    public CervezaNegra(Double lupulo, String pais) {
        super(lupulo, pais);
    }

    @Override
    public Double graduacion() {
        return Math.min(Reglamento.getInstance().getGraduacionReglamentaria(), lupulo * 2);
    }

    public static void cambiarGraduacionReglamentaria(Double nuevaGraduacion){
        Reglamento.getInstance().setGraduacionReglamentaria(nuevaGraduacion);
    }

}
