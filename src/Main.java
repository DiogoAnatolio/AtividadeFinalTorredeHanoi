import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n; // número de discos

        // recebe o nú	mero de discos digitado pelo usuário
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de discos: ");
        n = entrada.nextInt();

        // executa o algoritmo iterativo das Torres de Hanói
        HanoiIterativo.hanoi(n);

    }

}
}