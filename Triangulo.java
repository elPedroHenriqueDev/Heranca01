public class Triangulo extends Figura {
    private double base ;
    private double altura ;


    public Triangulo(double base, double altura,String cor) {
        super.setCordaFigura(cor);
        setBase(base);
        setAltura(altura);
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area(){
        return getAltura()*getBase();    
    }

    public String toString(){
        return super.toString();
    }
    
}
