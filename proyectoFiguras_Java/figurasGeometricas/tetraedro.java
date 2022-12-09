package figurasGeometricas;


public class tetraedro extends figura
{
   private double area, altura;
  

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void tetraedro() {
    }

    public tetraedro(double lado, double perimetro,double area,double altura) 
    {
    super(lado,perimetro); 
    this.area=area;
    this.altura =altura;
    }   

    @Override
    public double calcularArea(double area, double lado, double altura) 
    {
        altura=altura*2;
        altura= altura*2+(lado/2*2);
        
        System.out.println("\nEl area del tetraedro es: "+ altura);

        
        return altura;
    }
  
    public double calcularPerimetro(double lado, double area) 
    {
        area=(lado*2)*Math.sqrt(3);
        System.out.println("\nEl perimetro del tetraedro es: "+ area);
        return lado;
    }

 

}
