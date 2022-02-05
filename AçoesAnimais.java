package Polimorfismo;


public class AçoesAnimais {

	public static void main(String[] args) {
		
		cachorro cachorro = new cachorro();
		cavalo cavalo = new cavalo();
		Preguiça preguiça = new Preguiça();
		
		cachorro.setAcao("correr");
		cachorro.setNome("Bob");
		cachorro.setNome("5");
		cachorro.setEmitirSom("latir");
		
		cavalo.setAcao("correr");
		cavalo.setNome("pe De Pano");
		cavalo.setIdade("7");
		cavalo.setEmitirSom("relinchar");

	
		preguiça.setAcao("subir em arvore ");
		preguiça.setNome("Sidy");
		preguiça.setIdade("10");
		preguiça.setEmitirSom("Som de preguiça");
		
		System.out.println("O nome do cachorro é: "+cachorro.getNome()+"lnIdade do cachorro: "
				+cachorro.getIdade()+"\nA ação do cachorro é: "+cachorro.isAcao()+"\nO som do cachorro é: "
				+cachorro.isEmitirSom());
		
		System.out.println("O nome do cavalo é: "+cavalo.getNome()+"\nIdade do cavalo: "
				+cavalo.getIdade()+"\nA ação do cavalo é: "+cavalo.isAcao()+"\nO som do cavalo é: "
				+cavalo.isEmitirSom());
		
		System.out.println("O nome da preguiça é: "+preguiça.getNome()+"lnIdade da preguiça: "
				+preguiça.getIdade()+"\nA ação da preguiça é: "+preguiça.isAcao()+"\nO som do cavaloda preguiça é: "
				+preguiça.isEmitirSom());
		
		
		
		
		

	}

}
