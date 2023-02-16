public abstract class Figura {
    private String cordaFigura;

    //metodos
    public String getCordaFigura() {
        return cordaFigura;
    }

    public void setCordaFigura(String cordaFigura) {
        this.cordaFigura = cordaFigura;
    }

    public String toString(){
        return ("Figura cor="+ getCordaFigura() +" area= "+area());
    }

    public abstract double area();

}
