import java.util.Scanner;
public class Bola {
    public static void main(String[] args) {
      Scanner Leia = new Scanner(System.in);
        float A,R, PI = 3.14f;
        System.out.println("Escreva o raio: ");
             R = Leia.nextFloat();
            A = ((PI*PI) *4)*PI;
         System.out.println("A area da esfera é: "+A);
     }
}
