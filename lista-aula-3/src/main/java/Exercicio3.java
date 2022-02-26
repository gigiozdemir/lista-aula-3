import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Scanner função para inserir dados
        Scanner entrada = new Scanner(System.in);
        float npa, np3, total;

        System.out.print("Digite sua nota da NPA: ");
        npa = entrada.nextFloat();

        if(npa >= 60)
            System.out.println("Você está aprovado, Parabéns! ");
        else
        {
            System.out.println("Você ficou de NP3");
            System.out.print("Digite sua nota da NP3: ");
            np3 = entrada.nextFloat();

            total = (npa + np3)/2;

            if(total >= 50)
                System.out.println("Aprovado! Parabéns e boas férias!! ");
            else
                System.out.println("Reprovado! Até ano que vem novamente!! ");

            // Fechando scanner
            entrada.close();
    }
}

}
