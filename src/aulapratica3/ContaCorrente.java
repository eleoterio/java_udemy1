package aulapratica3;

public class ContaCorrente {
	
	private int numero, agencia;
	private float limite;
	
	public ContaCorrente(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public ContaCorrente(int numero, int agencia, float limite) {
		this.numero = numero;
		this.agencia = agencia;
		this.limite = limite;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the limite
	 */
	public float getLimite() {
		return limite;
	}

	/**
	 * @param limite the limite to set
	 */
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
}
