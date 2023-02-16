public class Circulo extends Figura {
    private double raio;
    private double diametro;

    public Circulo(double raio,String cor) {
        super.setCordaFigura(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        diametro=getRaio()/2;
    }
    
    @Override
    public double area() {
        final double pi =3.14;
        return getRaio()*pi;
    }

    public String toString (){
        return super.toString();
    } 

}
