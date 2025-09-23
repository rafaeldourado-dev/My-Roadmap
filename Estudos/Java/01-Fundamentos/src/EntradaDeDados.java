import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nomeUsuario = leitor.nextLine();
        System.out.println("Agora digit sua idade: ");
        int idadeUsuario = leitor.nextInt();
        System.out.println("Aonde você mora? ");
        String cidadeUsuario = leitor.next();

        System.out.printf("Olá, meu nome é %s, tenho %d anos e moro em %s", nomeUsuario, idadeUsuario, cidadeUsuario);
        leitor.close();
    };
    
}
