import java.util.Scanner;
import java.util.Locale;

public class pontofluante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a,b,c;
        double triangulo,circulo,trapezio,quadrado,retangulo;

        System.out.println("Digite o valor de A: ");
        a=sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        b=sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        c=sc.nextDouble();

         double area=3.14159;
        triangulo=(a*c)/2;
        circulo=(c*c)*area;;
        trapezio=((a+b)*c)/2;
        quadrado=(b*b);
        retangulo=(a*b);

        System.out.println("TRIANGULO: "+String.format("%.3f",triangulo));
        System.out.println("CIRCULO: "+String.format("%.3f",circulo));
        System.out.println("TRAPEZIO: "+String.format("%.3f",trapezio));
        System.out.println("QUADRADO: "+String.format("%.3f",quadrado));
        System.out.println("RETANGULO: "+String.format("%.3f",retangulo));
        sc.close();
    }

}
