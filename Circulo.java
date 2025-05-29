import java.util.Scanner;
public class Circulo {
     public static void main(String[] args) {
     Scanner Leia = new Scanner(System.in);
        float A,R;
        float PI = 3.14f;
         System.out.println("Escreva o raio: ");
         R = Leia.nextFloat();
        A = PI*(R*R);
         System.out.println("O resultado da area é: " + A);
    }
    
}
