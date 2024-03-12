package biblioteca;

import java.util.Scanner;

public class Main {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

       menuPrincipal();
     
	}


	private static void menuPrincipal() {
	    boolean sair = false;

	    do {
	    	StringBuilder menu = new StringBuilder();

			menu.append("Bem-vindo ao sistema de biblioteca\n");
			menu.append("Selecione uma opção:\n");
			menu.append("1. Livros\n");
			menu.append("2. Empréstimos\n");
			menu.append("3. Funcionários\n");
			menu.append("4. Sair\n");		
			
			 System.out.println(menu);
	         System.out.print("Escolha uma opção: ");
	         int opcao = scanner.nextInt();

	         switch (opcao) {
	             case 1:
						menuLivro();
						break;
	             case 2:
	                 System.out.println("Você escolheu a opção 'Empréstimos'");
	                 break;
	             case 3:
	                 System.out.println("Você escolheu a opção 'Funcionários'");
	                 break;
	             case 4:
	                 System.out.println("Saindo...");
	                 sair = true;
	                 break;
	             default:
	                 System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
	         }
			
		} while (!sair);
		
	}


	private static void menuLivro() {
		StringBuilder menu = new StringBuilder();

        menu.append("Menu de Livros\n");
        menu.append("Selecione uma opção:\n");
        menu.append("1. Cadastrar novo exemplar\n");
        menu.append("2. Exemplares cadastrados\n");
        menu.append("3. Pesquisar por Título\n");
        menu.append("4. Pesquisar por Autor\n");
        menu.append("5. Pesquisar por Editora\n");
        menu.append("6. Sair\n");
        
        System.out.println(menu);
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
	        case 1:
	            break;
	        case 2:
	        	System.out.println(ExemplarLivro.getListaExemplares());	            
	        	break;
	        case 3:
	        	System.out.println("Informe o título: ");
	    		System.out.println(Livro.pesquisarPorTitulo(scanner.next()));			            
	    		break;
	        case 4:
	        	System.out.println("Informe o autor: ");
	    		System.out.println(Livro.pesquisarPorAutor(scanner.next()));
	    		break;
	        case 5:
	        	System.out.println("Informe a editora: ");
	    		System.out.println(Livro.pesquisarPorEditora(scanner.next()));
	            break;
	        case 6:
	            System.out.println("Saindo do menu de Livros...");	            
	            break;
	        default:
	            System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
	    }
        
	}

}
