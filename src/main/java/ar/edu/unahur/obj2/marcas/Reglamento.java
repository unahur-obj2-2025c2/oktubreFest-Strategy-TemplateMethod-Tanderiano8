package ar.edu.unahur.obj2.marcas;

public class Reglamento {

    private static Reglamento instance;
    private Double graduacionReglamentaria;

    public static Reglamento getInstance(){
        if(instance == null){
            instance = new Reglamento();
        }
        return instance;
    }

    public Double getGraduacionReglamentaria(){
        return graduacionReglamentaria;
    }

    public void setGraduacionReglamentaria(Double graduacionReglamentaria) {
        this.graduacionReglamentaria = graduacionReglamentaria;
    }

    
}
