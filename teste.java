package Herança;

public class teste {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguiça preguica = new Preguiça();
		 
		cachorro.setAcao("corre");
		cachorro.setNome("Bob");
		cachorro.setIdade(5);
		cavalo.setAcao("corre");
		cavalo.setNome("péDePano");
		cavalo.setIdade(7);
		preguica.setAcao("sobe em árvore");
		preguica.setNome("Sidy");
		preguica.setIdade(10);
		
		System.out.println("O nome do cachorro é: "+cachorro.getNome()+ "\nA idade do cachorro é: "
		+cachorro.getIdade()+ "\nA ação do cachorro é: "+cachorro.getAcao());
		
		System.out.println("O nome do cavalo é: "+cavalo.getNome()+ "\nA idade do cavalo é: "
				+cavalo.getIdade()+ "\nA ação do cavalo é: "+cavalo.getAcao());
		
		System.out.println("O nome do preguiça é: "+preguica.getNome()+ "\nA idade do preguiça é: "
				+preguica.getIdade()+ "\nA ação do preguiça é: "+preguica.getAcao());
		

	}

}
