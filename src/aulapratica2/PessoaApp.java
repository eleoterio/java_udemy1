package aulapratica2;

public class PessoaApp {
	
	public static void main(String[] args) {
		ClientePF pf = new ClientePF("felipe", "Marilia", "12345678985");
		ClientePJ pj = new ClientePJ("Luiz", "Lins", "12345678985");
		
		System.out.println(" Pessoa Fisica " + pf.getNome());
		
		System.out.println(" Pessoa Fisica " + pj.getNome());
		
		System.out.println(pf.toString());
		System.out.println(pj.toString());
	}
}
