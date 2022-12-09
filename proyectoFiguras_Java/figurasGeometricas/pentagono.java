package figurasGeometricas;


public class pentagono extends figura
{
  
    private double apotema;
    
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
  

   public pentagono(double lado, double perimetro, double apotema) 
    {
     super(lado,perimetro);
      this.apotema=apotema;
    }
    private void pentagono()
    { }
 
     public double calcularPerimetro(double lado, double perimetro) 
     {
        lado=lado*5;
        perimetro=lado;
        System.out.println("\nEl perimetro es del pentagono es: "+ perimetro);
        return perimetro;
    }
    
    public double calcularArea(double area,double lado,double altura)   
    {
        area=5*lado*apotema/2;
        System.out.println("\nEl area del pentagono es: " + area);

        return area;
    }


  
}
