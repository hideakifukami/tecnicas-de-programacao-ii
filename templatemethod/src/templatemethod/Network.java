package templatemethod;

// classe base de uma rede social
public abstract class Network {

	String userName;
    String password;

    Network() {}

    // publique os dados em qualquer rede
    public boolean post(String message) {
    	//Autentique antes de postar. Cada rede usa um método diferente de autenticação
    	if (logIn(this.userName, this.password)) {
            // Enviar os dados da postagem
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }
    
    protected void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
