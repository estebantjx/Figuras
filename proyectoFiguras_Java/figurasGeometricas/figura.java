package figurasGeometricas;


public abstract class figura
{
double lado, perimetro;

public figura (){}
public figura(double lado,double perimetro)
{
    this.lado=lado;
    this.perimetro=perimetro;

}

public double getLado() {
    return lado;
}
public void setLado(double lado) {
    this.lado = lado;
}
public double getPerimetro() {
    return perimetro;
}
public void setPerimetro(double perimetro) {
    this.perimetro = perimetro;
}
public abstract double calcularPerimetro(double lado, double perimetro);
public abstract double calcularArea(double area,double lado, double altura);
}