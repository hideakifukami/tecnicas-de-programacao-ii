package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
       
		menuPrincipal();
		
	}

	private static void menuPrincipal() {
	    boolean sair = false;

	    do {
	    	StringBuilder menu = new StringBuilder();

			menu.append("Bem-vindo ao sistema de biblioteca\n");
			menu.append("Selecione uma opção:\n\n");
			menu.append("1. Livros\n");
			menu.append("2. Empréstimos\n");
			menu.append("3. Funcionários\n");
			menu.append("4. Sair\n");		
			
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu.toString() + "\nEscolha uma opção:"));


	         switch (opcao) {
	             case 1:
				     menuLivro();
					 break;
	             case 2:
	                 menuEmprestimo();
	                 break;
	             case 3:
	                 menuFuncionario();
	                 break;
	             case 4:
	            	 JOptionPane.showMessageDialog(null, "Obrigado por utilizar!");
	                 sair = true;
	                 break;
	             default:
	            	 JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, selecione uma opção válida.");
	         }
			
		} while (!sair);
		
	}

	private static void menuLivro() {
	    boolean voltar = false;
		
	    do {
	    	StringBuilder menu = new StringBuilder();

	        menu.append("\nMenu de Livros\n");
	        menu.append("Selecione uma opção:\n\n");
	        menu.append("1. Cadastrar novo exemplar\n");
	        menu.append("2. Exemplares cadastrados\n");
	        menu.append("3. Pesquisar por Título\n");
	        menu.append("4. Pesquisar por Autor\n");
	        menu.append("5. Pesquisar por Editora\n");
	        menu.append("6. Voltar ao Menu Principal\n");
	        
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu.toString() + "\nEscolha uma opção:"));

	        switch (opcao) {
		        case 1:
		        	cadastrarNovoExemplar();
		            break;
		        case 2:
		        	JOptionPane.showMessageDialog(null, ExemplarLivro.getListaExemplares());	            
		        	break;
		        case 3:
		        	String titulo = JOptionPane.showInputDialog("Informe o título: ");
		        	JOptionPane.showMessageDialog(null, Livro.pesquisarPorTitulo(titulo));			            
		    		break;
		        case 4:
		        	String autor = JOptionPane.showInputDialog("Informe o autor: ");
		        	JOptionPane.showMessageDialog(null, Livro.pesquisarPorAutor(autor));
		    		break;
		        case 5:
		        	String editora = JOptionPane.showInputDialog("Informe a editora: ");
		        	JOptionPane.showMessageDialog(null, Livro.pesquisarPorEditora(editora));
		            break;
		        case 6:
		            break;
		        default:
		        	JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, selecione uma opção válida.");
		    }
		} while (voltar);
        
	}
	
	private static ExemplarLivro cadastrarNovoExemplar() {
        int isbn = Integer.parseInt(JOptionPane.showInputDialog("Digite o ISBN do livro:"));
        String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
        boolean novoAutor = true;
        ArrayList<Autor> autores = new ArrayList<>();
        while (novoAutor) {        	
            String nomeAutor = JOptionPane.showInputDialog("Digite o nome do autor:"); 
            Autor autor = new Autor(nomeAutor);
            autores.add(autor);
            int opcaoAutor = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro autor (1) ou finalizar (2)?"));
            novoAutor = opcaoAutor == 1;
        }

        String nomeEditora = JOptionPane.showInputDialog("Digite o nome da editora:");
        Editora editora = new Editora(nomeEditora);
        String areaDaAdvocaciaStr = JOptionPane.showInputDialog("Digite a área de advocacia do livro:");;
        AreaDaAdvocacia areaDaAdvocacia = new AreaDaAdvocacia(areaDaAdvocaciaStr);
        Livro novoLivro = new Livro(isbn, titulo, autores, editora, areaDaAdvocacia);
        
        int diaAquisicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de aquisição:"));       
        int mesAquisicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de aquisição:"));        
        int anoAquisicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de aquisição:"));        
        double precoPago = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço pago:"));

        LocalDate dataAquisicao = LocalDate.of(anoAquisicao, mesAquisicao, diaAquisicao);

        ExemplarLivro exemplarLivro = new ExemplarLivro(dataAquisicao, precoPago, novoLivro);

        StringBuilder mensagem = new StringBuilder("Exemplar cadastrado com sucesso!\n\n");

        mensagem.append("Número de série: ").append(exemplarLivro.getNumeroSerie()).append("\n");
        mensagem.append("Data de aquisição: ").append(exemplarLivro.getDataAquisicao()).append("\n");
        mensagem.append("Preço pago: R$").append(exemplarLivro.getPrecoPago()).append("\n");
        mensagem.append("Livro: ").append(exemplarLivro.getLivro().getTitulo()).append("\n");
        mensagem.append("Autor(es): ");

        for (Autor autor : exemplarLivro.getLivro().getAutores()) {
            mensagem.append(autor.getNome()).append(", ");
        }

        mensagem.deleteCharAt(mensagem.length() - 2);

        JOptionPane.showMessageDialog(null, mensagem);
        
        return exemplarLivro;
    }

	private static void menuEmprestimo() {
	    boolean voltar = false;

	    do {
	        StringBuilder menu = new StringBuilder();

	        menu.append("\nMenu de Empréstimos\n");
	        menu.append("Selecione uma opção:\n\n");
	        menu.append("1. Registrar Empréstimo\n");
	        menu.append("2. Registrar Devolução\n");
	        menu.append("3. Exemplares Emprestados\n");
	        menu.append("4. Voltar ao Menu Principal\n");

	        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu.toString() + "\nEscolha uma opção:"));

	        switch (opcao) {
	            case 1:
	                registrarEmprestimo();
	                break;
	            case 2:
	                registrarDevolucao();
	                break;
	            case 3:
		        	JOptionPane.showMessageDialog(null, MovimentacaoExemplar.getListaDeMovimentacoes());	            
	                break;
	            case 4:
	                voltar = true;
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, selecione uma opção válida.");
	        }
	    } while (!voltar);
	}

	private static void registrarEmprestimo() {
	    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de matricula do funcionario:"));
	    MovimentacaoExemplar emprestimo = new MovimentacaoExemplar(matricula);
	    
	    boolean novoExemplar = true;

	    while (novoExemplar) {        	
            int numeroSerie = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de série do exemplar:")); 
            ExemplarLivro exemplar = ExemplarLivro.pesquisarPorNumeroSerie(numeroSerie);
            emprestimo.emprestarExemplar(exemplar);

            int opcaoExemplar = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro exemplar (1) ou finalizar (2)?"));
            novoExemplar = opcaoExemplar == 1;
            
            if (emprestimo.getExemplares().size() > 4) {
            	JOptionPane.showMessageDialog(null, "Limite de exemplares atingido");
            	novoExemplar = false;
            }
        }
	    
	    
	}

	private static void registrarDevolucao() {
		boolean novaDevolucao = true;

	    while (novaDevolucao) {        	
            int numeroSerie = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de série do exemplar:")); 
            ExemplarLivro exemplar = ExemplarLivro.pesquisarPorNumeroSerie(numeroSerie);
            int servivelInt = Integer.parseInt(JOptionPane.showInputDialog("O livro apresenta danos (1) ou está servível (2)?"));
            boolean servivel = servivelInt == 2;         
             
            MovimentacaoExemplar.devolverExemplar(exemplar, servivel);

            int opcaoExemplar = Integer.parseInt(JOptionPane.showInputDialog("Deseja registar outra devolução (1) ou finalizar (2)?"));
            novaDevolucao = opcaoExemplar == 1;            
        }
	    
	    JOptionPane.showMessageDialog(null, "Exemplares devolvidos com sucesso!");
	}
	

	private static void menuFuncionario() {
		boolean voltar = false;
        
        do {
            StringBuilder menu = new StringBuilder();

            menu.append("\nMenu de Funcionários\n");
            menu.append("Selecione uma opção:\n\n");
            menu.append("1. Cadastrar Funcionário\n");
            menu.append("2. Desvincular Funcionário\n");
            menu.append("3. Listar Funcionários\n");
            menu.append("4. Voltar ao Menu Principal\n");

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu.toString() + "\nEscolha uma opção:"));

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    desvincularFuncionario();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, Funcionario.getListaFuncionarios());
                    break;
                case 4:
                    voltar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, selecione uma opção válida.");
            }
        } while (!voltar);		
	}

	private static void cadastrarFuncionario() {
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário:");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do funcionário:"));
        String tipoFuncionario = JOptionPane.showInputDialog("O funcionário é advogado? (S/N)").toUpperCase();
        
        if (tipoFuncionario.equals("S")) {
            String numeroOAB = JOptionPane.showInputDialog("Informe o número da OAB do advogado:");
            new Advogado(nome, matricula, numeroOAB);
        } else {
            new Funcionario(nome, matricula);
        }
        
        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
    }
	
	private static void desvincularFuncionario() {
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do funcionário a ser desvinculado:"));
        Funcionario funcionario = Funcionario.pesquisarPorMatricula(matricula);
        
        if (funcionario != null) {
        	Funcionario.getListaFuncionarios().remove(funcionario);
            JOptionPane.showMessageDialog(null, "Funcionário desvinculado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
        }
    }
	
}
