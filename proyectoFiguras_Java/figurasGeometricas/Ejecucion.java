package figurasGeometricas;
import java.util.*;


 class Ejecucion 
{
    
  
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        pentagono pe= new pentagono(0,0,0);
        tetraedro te=new tetraedro(0, 0, 0, 0);
        hexagono he=new hexagono(0,0,0);

       
        System.out.println("Ingrese uno de los los lados del pentagono en centimetros para calcular su perimetro: ");
        pe.setLado(sc.nextDouble());
        pe.calcularPerimetro(pe.getLado(),pe.getPerimetro());
       
        System.out.println("Ingrese la apotema del pentagono en centimetros si desea calcular su area: ");
        pe.setApotema(sc.nextDouble());
        pe.calcularArea(pe.getLado(),pe.getApotema(),0);

        System.out.println("Ingrese la a altura del tetraedro en centimetros para calcular su area: ");
        te.setAltura(sc.nextDouble());
        te.calcularArea(0,0,te.getAltura());

        System.out.println("Ingrese el lado del tetraedro en centimetros para calcular su perimetro: ");
        te.setLado(sc.nextDouble());
        te.calcularPerimetro(te.getLado(), 0);

        System.out.println("Ingrese uno de los los lados del pentagono en centimetros para calcular su perimetro: ");
        he.setLado(sc.nextDouble());
        he.calcularPerimetro(he.getLado(),he.getPerimetro());
       
        System.out.println("Ingrese la apotema del pentagono en centimetros si desea calcular su area: ");
        he.setApotemah(sc.nextDouble());
        he.calcularArea(he.getLado(),he.getApotemah(),0);







    }
    

}
