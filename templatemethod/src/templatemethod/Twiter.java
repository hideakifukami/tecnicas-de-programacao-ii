package templatemethod;

public class Twiter extends Network {

    public Twiter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean logIn(String userName, String password) {
        System.out.println("\nVerificando os parâmetros do usuário");
        System.out.println("Nome: " + this.userName);
        System.out.print("Senha: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nSucesso de login em Twiter");
        return true;
    }

    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Mensagem: '" + new String(data) + "' foi publicada em Twiter");
            return true;
        } 
        return false;
    }

    public void logOut() {
        System.out.println("Usuário: '" + userName + "' foi deslogada da Twiter");
    }

}