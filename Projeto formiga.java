

public class Formiga{
	private int velocidade;
	private int x;
	private int y;
	private int boolean carregandoComida;
	private int estoqueFerromônios;
	private int casaX;
	private int casaY;
	
    // Construtor
	public Formiga(int x, int y, int velocidade, int casaX, int casaY) {
		this.x = x;
		this.y = y;
		this.carregandoComida = false;
		this.estoqueFerromônios = 0;
		this.casaX = casaX;
		this.casaY = casaY;
	}
	
	// Método para encontrar comida
	public void buscar comida() {
		System.out.Println("Formiga está buscando comida...");
		AndarEmDirecaoAleatoria();
		VerificarComidaEncontrada();
	}
	
	// Método para verificar se encontrou comida
	public void VerificarComidaEncontrada() {
		if (x == comidaX && == y && comidaY) {
			pegarComida();		
		}
	} 
	
	// Método para pegar comida
	public void PegarComida() {
		System.out.Println("Formiga encontrou comida");
		carregandoComida = true;
	}
	
	// Método para largar a comida
	public void LargarComida() {
		System.out.Println("Formiga largou a comida em casa");
		carregandoComida = false;
		verificarSeEstáEmCasa();
	}
	
	// Método para andar em direçao aleatória
	public void AndarEmDireçaoAleatória() {
		 Meth.Randon  
		
	}
	
}
