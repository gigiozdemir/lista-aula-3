public class Exercicio1 {
    public static void main(String[] args) {
        //Número de zumbis que forão derrotados

        int partida1 = 120;
        int partida2 = 240;
        int partida3 = 320;

        //Número total de zumbis que foram mortos

        int total = partida1 + partida2 + partida3;

        //Média dos zumbis que forão mortos

        System.out.println("Número de zumbis que foram mortos no total" + total );
        System.out.println("Média de zumbis que foram mortos" + total/3 );
    }
}
