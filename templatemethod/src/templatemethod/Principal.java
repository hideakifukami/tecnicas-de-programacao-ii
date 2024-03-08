package templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// classe Principal . Tudo se junta aqui.

public class Principal {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Insira o nome do usuário: ");
        String userName = reader.readLine();
        System.out.print("Insira a senha: ");
        String password = reader.readLine();

        // Digite a mensagem.
        System.out.print("Insira a mensagem: ");
        String message = reader.readLine();

        System.out.println("\nEscolha a rede social para postar mensagem.\n" +
                "1 - Facebook\n" +
                "2 - Twiter");
        int choice = Integer.parseInt(reader.readLine());

        // Crie o objeto de rede adequado e envie a mensagem.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twiter(userName, password);
        }
        network.post(message);
    }
}