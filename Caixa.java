import java.util.Scanner;
public class Caixa {
    public static void main(String[] args) {
     Scanner Leia = new Scanner(System.in);
        float A,cl,la,ca,com,lar,al;
         System.out.println("Escreva o comprimento: ");
         com = Leia.nextFloat();
         System.out.println("Escreva a largura: ");
         lar = Leia.nextFloat();
         System.out.println("Escreva a altura: ");
         al = Leia.nextFloat();
//Multiplique o comprimento pela largura
            cl = com*lar;
// Multiplique o comprimento pela altura
            ca = com*al;
// Multiplique a largura pela altura
            la = lar*al;
//Some as áreas calculadas no passo anterior e multiplique o resultado por 2
            A = 2*(cl + ca + la);
            System.out.println("O resultado da area é: " + A);
    }
}
