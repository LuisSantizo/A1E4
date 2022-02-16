import java.util.Scanner;

public class A1E4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //definir variables
        int primerNumero;
        int cuadradoNumero;
        int cuboNumero;
        
        //pedir el nuemro 
        System.out.print("Ingrese el numero, para calcular su cuadrado y su cubo: ");
        primerNumero = scanner.nextInt();
        
        //Hacer las operacioens
        cuadradoNumero = primerNumero * primerNumero;
        cuboNumero = primerNumero * primerNumero * primerNumero;

        System.out.println("El cuadrado de " + primerNumero + " es: " + cuadradoNumero);
        System.out.println("El cubo de " + primerNumero + " es: " + cuboNumero);
    }

}
