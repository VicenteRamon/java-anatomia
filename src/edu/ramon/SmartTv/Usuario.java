package edu.ramon.SmartTv;
 
public class Usuario{
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está: " + smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.ligar();

        System.out.println("A TV está: " + smartTv.ligada);
    }
}
