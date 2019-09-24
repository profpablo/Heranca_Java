package Heranca2;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa jose = new Cliente();
		jose.nome="jose";
		jose.cpf = "3423234";
		jose.endereco = "rua 28";
		jose.telefone = "22222";
		
		
		Pessoa carlos = new Cliente();
		carlos.nome="carlos";
		carlos.cpf = "3423234";
		carlos.endereco = "rua 28";
		carlos.telefone = "xxxxxxxxxxxx";
		jose.imprimirCadastro();
		carlos.imprimirCadastro();
		
	}

}
