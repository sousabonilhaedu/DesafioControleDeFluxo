import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception){
            System.out.println("O parametro dois tem que ser maior que o parametro um.");
        }
    }

    static void contar( int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else {
            int contagem = parametroDois - parametroUm;
            for (int indice = 0; indice < contagem; indice++){
                System.out.println("A contagem de diferença está em: " + indice);
            }
        }

    }
}

