//Para calcular a área de um cilindro, você precisa determinar a área de suas duas bases circulares
// e a área da sua superfície lateral.
// A área total é a soma destas três áreas.
// A fórmula para a área total de um cilindro é: 2πr(r + h)
// onde 'r' é o raio da base e 'h' é a altura do cilindro
import java.util.Scanner;
public class Tubo {
     public static void main(String[] args) {
      Scanner Leia = new Scanner(System.in);
        float Ab,Al, At;
        System.out.println("Escreva a area da base do cilindro: ");
             Ab = Leia.nextFloat();
        System.out.println("Escreva a area da sua superficie lateral: ");
             Al = Leia.nextFloat();
             At = Ab+Ab+Al;
     }
}
