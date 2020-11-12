import java.util.Scanner;
public class Challenge {
	public static void main(String[]args) {
			
				Scanner leia = new Scanner(System.in);
				
				//Vari�veis:
				char resposta;
				int qtdeConsumir;
				int contador = 1;
				int produtoSelecionado;
				boolean comprando = true;
				boolean loop = true;
				int Itens = 0;
				
				
				//Vetores:
				boolean alreadyCart[] = new boolean[10] ; //Vetor para identificar se um item j� esta no carrinho.
				int codigoProdutos[] = new int[10];
				int produtosEstoque[] = {10,10,10,10,10,10,10,10,10,10};
				String itensCarrinho[] = new String[10];
				int qtdeCarrinho[] = new int[10];
				double precoCarrinho[] = new double [10];
				
				String nomeProdutos[] = {"Leite", "Cereal", "Farinha", "Maizena", "Bolacha", "Azeite", "Oleo", "Sab�o", "Sal", "A�ucar"};	
				double valorProdutos[] = {4.57, 3.02, 5.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29};
				String especificacao[] = {"L", "Cx", "Kg", "Kg", "Pct", "L", "L", "Uni", "Kg", "Kg"};
				
				System.out.println("\t\t\tGENERATIONS STORE");
				System.out.println("==================================================================");
				System.out.println("\nC�DIGO\t\tPRODUTO\t\tQTND. PRODUTOS\t\tPRE�O UNIT.\t\t\n");
				
				
				while(comprando)
				{
					for (int x = 0; x<10; x++)
					{
						codigoProdutos[x] = (x+1);
						System.out.printf("%d\t\t%s\t\t     %d\t\t\t  R$%.2f\n", codigoProdutos[x], nomeProdutos[x], produtosEstoque[x] , valorProdutos[x] );
						
						
					}
					
					System.out.println("\n==================================================================");
					
					
					produtoSelecionado = 0;
					while(loop) {
						System.out.print("Ol�! Digite o c�digo do produto desejado: ");
						produtoSelecionado = leia.nextInt();	
						
						if(produtoSelecionado < 0 || produtoSelecionado > 10)
						{
							System.out.println("C�digo invalido!! Por favor insira o c�digo novamente.");
						} else if (alreadyCart[produtoSelecionado - 1]){
							System.out.println("Produto j� existe no carrinho.");
						} else {
							break;
						}
					}
					
					while(true)
					{
					
						System.out.print("Insira a quatidade desejada do produto: ");
						qtdeConsumir = leia.nextInt();
						
						if(qtdeConsumir <= produtosEstoque[produtoSelecionado - 1])
						{
							System.out.printf("%d un. de %s adicionado com sucesso no carrinho !!\n", qtdeConsumir, nomeProdutos[produtoSelecionado - 1]);
							alreadyCart[Itens] = true;
							itensCarrinho[Itens] = nomeProdutos[produtoSelecionado - 1];
							qtdeCarrinho[Itens] = qtdeConsumir;
							precoCarrinho[Itens] = valorProdutos[produtoSelecionado - 1];
							Itens++;
							
							
							break;
						}
						else
						{
							System.out.println("Quantidade indispon�vel em estoque, digite novamente...");
						}
					}
					System.out.print("Deseja continuar a sua compra? [S/N] ");
					resposta = leia.next().toUpperCase().charAt(0);
					if (resposta == 'S')
					{
						System.out.println("Boas compras!");
					} else if( resposta == 'N') {
						break;
					}
				}
				System.out.println("ITENS NO CARRINHO: ");
				System.out.println("Nome \t Qtde. no carrinho \t\t Pre�o unit.(R$) \t\t Pre�o Total (R$)");
				for(int cont = 0; cont < Itens; cont++) {
					System.out.printf("%s \t\t %d \t\t\t\t %.2f \t\t\t\t %.2f\n", itensCarrinho[cont], qtdeCarrinho[cont], precoCarrinho[cont] , (precoCarrinho[cont] * qtdeCarrinho[cont]));
				}
				
					
					
				
				
				
				
				
				
				
				
				
			}
		}