package nead1;
public class AreasFiguras {

    //círculo
    public double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);  
    }

    //rectángulo
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    //triángulo rectángulo
    public double calcularArea(double base, double altura, boolean esTriangulo) {
        if (esTriangulo) {
            return (base * altura) / 2;  
        } else {
            return 0;
        }
    }
    //trapecio
    public double calcularArea(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;  
    }

    //pentágono
    public double calcularArea(int lado, double apotema) {
        double perimetro = lado * 5; 
        return (perimetro * apotema) / 2;  
    }

    public static void main(String[] args) {
        AreasFiguras figuras = new AreasFiguras();

        
        double radio = 5; 
        
        double bRect = 4;  
        double altRect = 6;
        
        double bTri = 3; 
        double altTri = 4;
       
        double bMayorTrap = 6;  
        double bMenorTrap = 4;  
        double altTrap = 5;
        
        int lPent = 4;  
        double apotemaPent = 3;

        
        double areaCirculo = figuras.calcularArea(radio);
        double areaRectangulo = figuras.calcularArea(bRect, altRect);
        double areaTriangulo = figuras.calcularArea(bTri, altTri, true);
        double areaTrapecio = figuras.calcularArea(bMayorTrap, bMenorTrap, altTrap);
        double areaPentagono = figuras.calcularArea(lPent, apotemaPent);

        System.out.println("Area del circulo: " + areaCirculo);
        System.out.println("Area del rectangulo: " + areaRectangulo);
        System.out.println("Area del triangulo rectangulo: " + areaTriangulo);
        System.out.println("Area del trapecio: " + areaTrapecio);
        System.out.println("Area del pentagono: " + areaPentagono);
    }
}
