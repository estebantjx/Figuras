package figurasGeometricas;

public abstract class hexagono extends figura
{
  private double apotemah;
   
public double getApotemah() {
    return apotemah;
}

public void setApotemah(double apotemah) {
    this.apotemah = apotemah;
}

    public void hexagono()
    { }
   
    public hexagono(double lado, double perimetro, double apotemah) 
    {
       super(lado,perimetro);
       this.apotemah=apotemah;
    }
    
   
    public double calcularPerimetro(double lado, double perimetro) 
    {
        lado=lado*6;
        perimetro=lado;
        System.out.println("El perimetro de el hexagono es: "+ perimetro);
        
        return perimetro;
    }

    public double calcularArea(double area,double lado, double altura)   
    {
        area=5*lado*apotemah/2;
        System.out.println("\nEl area del pentagono es: " + area);

        return area;
    }
}



