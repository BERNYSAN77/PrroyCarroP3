package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    /*
    métodos para ingresar información
    set()
    "siempre" es void
    siempre recibe parámetro
    generalmente el parámetro es del mismo tipo del atributo
     */

    public void setPotencia(int potencia){
        //si es correcto almacene
        if(potencia > 0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        //si es correcto modifique sino coloque 0 (default)
        if(velocidad < 0)
            velocidad = 0;

        this.velocidad = velocidad;
    }

    /*
    métodos para sacar información
    get()
    siempre retorna valor
    el tipo de retorno generalmente es del mismo tipo del atributo
     */

    public int getPotencia(){
        return potencia;
    }
    public double getVelocidad(){
        return velocidad;
    }

    public void acelerar(){
        velocidad += potencia;
    }
    void frenar(){
        velocidad /= potencia;
    }
}
