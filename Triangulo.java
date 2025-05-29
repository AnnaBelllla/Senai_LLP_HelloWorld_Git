import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
     Scanner Leia = new Scanner(System.in);
        float A,b,h;
         System.out.println("Escreva a base: ");
         b = Leia.nextFloat();
         System.out.println("Escreva a altura: ");
         h = Leia.nextFloat();
        A = (b*h)/2;
         System.out.println("O resultado é: " + A);
    }
}
