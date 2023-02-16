public class Aplicacao {
    public static void main (String [] args){

        Retangulo retangulo = new Retangulo(3,2 , "Black");

        Quadrado quadrado = new Quadrado(4,"Azul");

        System.out.println(retangulo.toString());

        System.out.println(quadrado.toString());

    }
}