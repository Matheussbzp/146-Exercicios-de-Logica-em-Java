package FACCAT;

import java.util.Scanner;

/*
  Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente
  de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem
  ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha
  estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja
  correta, deve ser mostrada a mensagem ‘Acesso permitido’.
*/

public class Exer38_UsuarioSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do código de usuário
        int codigo;

        System.out.print("Digite o código de usuário: ");
        codigo = scanner.nextInt();

        // verificação do código de usuário
        if (codigo != 1234) {
            System.out.println("Usuário inválido!");
        } else {
            // leitura da senha
            int senha;

            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();

            // verificação da senha
            if (senha != 9999) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido");
            }
        }

        scanner.close();
    }
}
