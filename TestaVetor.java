
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestaVetor {

	public static void main(String[] args) {
		int opcao = 0;
		int pos;
        int numero;
		boolean criado=true;
        String nome;
		String horaInicio;
		Scanner sc = new Scanner(System.in);
		
		Vetor lista = new Vetor();

		do {
			System.out.println("\n\n                        ### Menu ###");
			System.out.println("\n                  =========================================");
			System.out.println("              	  |     1 - Criar a Pilha                  |");
			System.out.println("              	  |     2 - Inserir Elemento (Push)        |");
			System.out.println("                  |     3 - Remover Elemento   (Pop)       |");
			System.out.println("                  |     4 - Mostrar Ultimo Elemento        |");
			System.out.println("                  |     5 - Buscar Elemento na Lista       |");
			System.out.println("                  |     6 - Mostrar Tamanho da Lista       |");  
			System.out.println("                  |     7 - Limpar Lista                   |");
			System.out.println("                  |     8 - Mostrar Lista                  |");
			System.out.println("                  |     0 - Sair                           |");
			System.out.println("                  ==========================================\n");
			
			opcao = sc.nextInt();
			System.out.print("\n");
			switch (opcao) {
		case 1: 
			//criar lista
			if(criado==false){
				System.out.print("\nA pilha não está criada!");
				//Vetor lista = new Vetor();
			}
			
        case 2:
			System.out.println("\nOpcao escolhida :"+opcao);
			
            System.out.println("\nDigite o nome :");
            nome = sc.next();
			System.out.println("\nDigite o numero :");
			numero = sc.nextInt();
			System.out.println("\nDigite a hora :");
			horaInicio = sc.next();
            Subrotina novoObjeto = new Subrotina(nome, numero, horaInicio);
			lista.inserir(novoObjeto);
			
			System.out.println("\nAdicionado!");
			
			break;
        case 3:
			System.out.println("\nOpcao escolhida :"+opcao);
			lista.remover();
			break;
		case 4:
			System.out.println("\nOpcao escolhida :"+opcao);
			lista.topo();
			
			break;
        case 5: 
			System.out.println("\nOpcao escolhida :"+opcao);

			System.out.println("\nDigite a posicao :");
			pos = sc.nextInt();
			
			System.out.println(lista.obtem(pos));
			break;
        case 6:
			System.out.println("\nOpcao escolhida :"+opcao);
			System.out.println("\nTamanho da lista: "+lista.tamanho());
			break;
		case 7:
			System.out.println("\nOpcao escolhida :"+opcao);
			lista.clear();
			JOptionPane.showMessageDialog(null, lista);
			break;
		case 8: 
			System.out.println("\nOpcao escolhida :"+opcao);
			JOptionPane.showMessageDialog(null, lista);
			break;
			
		case 0:
			break;
        default:
            System.out.println("Opção Inválida!");
            break;
        }
    } while (opcao != 0);
		sc.close();
	}
}
