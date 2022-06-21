package main;
import java.util.ArrayList;
import java.util.Scanner;
import cliente.Cliente;
import negociacao.Venda;
import veiculo.Motocicleta;


public class Principal {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		ArrayList<Motocicleta> moto = new ArrayList<Motocicleta>();
		ArrayList<Venda> venda = new ArrayList<Venda>();
		
		boolean rodando = true;
		while (rodando) {
			//TELA INICIAL
			
			System.out.println("=== MENU ===");
			System.out.println("[1] Clientes ");
			System.out.println("[2] Produtos");
			System.out.println("[3] Vendas");
			System.out.println("[4] Finalizar programa");
			System.out.print("Digite a opção: ");
			String telaInicial= scanner.nextLine();
			System.out.println("");
						
			switch (telaInicial) {
				case "1": { 
					//TELA CLIENTES
					
					boolean rodandoCliente = true;
					while (rodandoCliente) {
								
						System.out.println("=== MENU CLIENTES ===");
						System.out.println("[1] Cadastrar Cliente ");
						System.out.println("[2] Listar Clientes");
						System.out.println("[3] Atualizar informações do Cliente ");
						System.out.println("[4] Remover Cliente");
						System.out.println("[5] Retornar ao Menu Inicial");
						System.out.print("Digite a opção: ");
						String opcao = scanner.nextLine();
						System.out.println("");
						
		
						switch (opcao) {
							case "1": {
								System.out.println("=== CADASTRO DE USUÁRIOS ===");
								System.out.print("Digite o Nome: ");
								String nome = scanner.nextLine();
								System.out.print("Digite o Sobrenome: ");
								String sobrenome = scanner.nextLine();
								System.out.print("Digite o CPF: ");
								String cpf = scanner.nextLine();
								System.out.print("Digite o Endereço: ");
								String endereco = scanner.nextLine();
								
								Cliente u = new Cliente();
								u.setNome(nome);
								u.setSobrenome(sobrenome);
								u.setCpf(cpf);
								u.setEndereco(endereco);
								cliente.add(u);
								System.out.println("");
								break;
								}
							case "2": {
								System.out.println("==USUÁRIOS CADASTRADOS==");
									for (int i = 0; i < cliente.size(); i++) {
										System.out.println("Usuario " + i);
										System.out.println("\t Nome: " + cliente.get(i).getNome());
										System.out.println("\t Sobrenome: " + cliente.get(i).getSobrenome());
										System.out.println("\t CPF: " + cliente.get(i).getCpf());
										System.out.println("\t Endereço: " + cliente.get(i).getEndereco());
										System.out.println("");
									}
								break;
								}
						
							case "3": {
								System.out.println("=== ATUALIZAR DADOS DO USUÁRIO ===");
		
								for (int i = 0; i < cliente.size(); i++) {
									Cliente uTemp = cliente.get(i);
									System.out.println("[" + i + "]" + uTemp.getNome());
								}
								System.out.print("Digite o valor de referência: ");
								int referencia = scanner.nextInt();
								scanner.nextLine();
		
								System.out.print("Digite o novo Nome: ");
								String novoNome = scanner.nextLine();
								System.out.print("Digite o novo Sobrenome: ");
								String novoSobrenome = scanner.nextLine();
								System.out.print("Digite o novo CPF: ");
								String novoCpf = scanner.nextLine();
								System.out.print("Digite o novo Endereço: ");
								String novoEndereco = scanner.nextLine();
			
								Cliente u = cliente.get(referencia);
								u.setNome(novoNome);
								u.setSobrenome(novoSobrenome);
								u.setCpf(novoCpf);
								u.setEndereco(novoEndereco);
								System.out.println("");
								break;
							}
							case "4": {
								System.out.println("=== REMOVER USUÁRIO ===");
							
								for (int i = 0; i < cliente.size(); i++) {
									Cliente uTemp = cliente.get(i);
									System.out.println("[" + i + "]" + uTemp.getNome());
								}
								System.out.print("Digite o valor de referência: ");
								int referencia = scanner.nextInt();
								scanner.nextLine();
								
								cliente.remove(referencia);
								System.out.println("Cliente removido com sucesso");
								System.out.println("");
								break;
							}
							case "5": {
								rodandoCliente = false;
								
								break;
							}
							
						}
						
					}	
					break;
				}
			
				case "2": {
				//TELA PRODUTOS
				
					boolean rodandoProduto = true;
					while (rodandoProduto) {
						System.out.println("=== MENU PRODUTOS ===");
						System.out.println("[1] Cadastrar Produto ");
						System.out.println("[2] Listar Produto");
						System.out.println("[3] Atualizar informações do Produto ");
						System.out.println("[4] Remover Produto");
						System.out.println("[5] Retornar ao Menu Inicial");
						System.out.print("Digite a opção: ");
						String opcao = scanner.nextLine();
						System.out.println("");
					

						switch (opcao) {
							case "1": {
								System.out.println("=== CADASTRO DE PRODUTOS ===");
								System.out.print("Digite o Modelo: ");
								String modelo = scanner.nextLine();
								System.out.print("Digite a Cor: ");
								String cor = scanner.nextLine();
								
								System.out.print("Digite o Preço: ");
								double preco = scanner.nextDouble();
								
							            
								Motocicleta u = new Motocicleta();
								u.setModelo(modelo);
								u.setCor(cor);
								u.setPreco(preco);
								
								
								moto.add(u);
								System.out.println("");
								break;
							}
							case "2": {
								System.out.println("=== USUÁRIOS PRODUTOS ===");
								for (int i = 0; i < moto.size(); i++) {
									System.out.println("Produto " + i);
									System.out.println("\t Modelo: " + moto.get(i).getModelo());
									System.out.println("\t Cor: " + moto.get(i).getCor());
									System.out.println("\t Preço: " + moto.get(i).getPreco());
									
									System.out.println("");
									}
								break;
							}
						
							case "3": {
								System.out.println("=== ATUALIZAR DADOS DO PRODUTO ===");
		
								for (int i = 0; i < moto.size(); i++) {
									Motocicleta uTemp = moto.get(i);
									System.out.println("[" + i + "]" + uTemp.getModelo());
								}
								System.out.print("Digite o valor de referência: ");
								int referencia = scanner.nextInt();
								scanner.nextLine();
			
								System.out.print("Digite o novo Modelo: ");
								String modelo = scanner.nextLine();
								System.out.print("Digite a nova Cor: ");
								String cor = scanner.nextLine();
								System.out.print("Digite o novo Preço: ");
								double preco = scanner.nextDouble();
								
								Motocicleta u = moto.get(referencia);
								u.setModelo(modelo);
								u.setCor(cor);
								u.setPreco(preco);
								System.out.println("");
								break;
							}
						
							case "4": {
								System.out.println("=== REMOVER PRODUTO ===");
							
								for (int i = 0; i < moto.size(); i++) {
									Motocicleta uTemp = moto.get(i);
									System.out.println("[" + i + "]" + uTemp.getModelo());
								}
								System.out.print("Digite o valor de referência: ");
								int referencia = scanner.nextInt();
								scanner.nextLine();
								
								moto.remove(referencia);
								System.out.println("Produto removido com sucesso");
								System.out.println("");
								break;
							}
							
							case "5": {
								rodandoProduto = false;
								break;
							}
		
						}
					}	
					break;
				}
			
			case "3": { 
				//VENDAS
								
					boolean rodandoVendas = true;
					while (rodandoVendas) {
						System.out.println("=== MENU VENDAS ===");
						System.out.println("[1] Cadastrar Venda ");
						System.out.println("[2] Listar Vendas");
						System.out.println("[3] Retornar ao Menu Inicial");
						System.out.print("Digite a opção: ");
						String opcao = scanner.nextLine();
						System.out.println("");
					

						switch (opcao) {
							case "1": {
								System.out.println("=== CADASTRO DE VENDA ===");
								System.out.print("Digite o Nome do Cliente: ");
								String nomeCliente = scanner.nextLine();
								System.out.print("Digite o Produto Vendido: ");
								String produto = scanner.nextLine();
								    
								Venda u = new Venda();
								u.setCliente(nomeCliente);
								u.setTipoDeVeiculo(produto);
								
								venda.add(u);
								System.out.println("");
								break;
							}
							case "2": {
								System.out.println("=== LISTA DE VENDAS ===");
								for (int i = 0; i < venda.size(); i++) {
									System.out.println("Produto " + i);
									System.out.println("\t Nome do Cliente: " + venda.get(i).getCliente());
									System.out.println("\t Produto Vendido: " + venda.get(i).getTipoDeVeiculo());
									
									
									System.out.println("");
									}
								break;
							}
						
							case "3": {
								rodandoVendas = false;
								break;
							}
		
						}
					}	
					break;
				
			}			
			
			case "4": { //FINALIZAR
					rodando = false;
					break;
			}

		}
			
			

	}
	System.out.println("=== PROGRAMA FINALIZADO ===");
	scanner.close();
}
}


