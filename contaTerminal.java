import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args){
        //conhecer e obter a classe scanner
        Scanner terminal = new Scanner(System.in);
        //exibir as mensagens pelo usuario
        System.out.println("Digite seu número da conta bancária");
        int numero = terminal.nextInt();
        System.out.println("Digite o número correspondente a sua agência");
        terminal.nextLine();
       String agencia = terminal.nextLine();
        System.out.println("Digite seu nome");
        String nome = terminal.nextLine();
        System.out.println("Digite seu saldo da sua conta");
        float saldo = terminal.nextFloat();
        // obter pelo scanner os dados obtidos pelo usuário
        // exibir os dados do usuario

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+",conta "+ numero+"e seu saldo"+ saldo+" já está disponível para saque.");
        terminal.close();
    }
}
