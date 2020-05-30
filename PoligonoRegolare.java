public class PoligonoRegolare {
	private int numeroLati;
	private double lato;
	private double numeroFisso;
	public PoligonoRegolare(int numeroLati, double lato, double numeroFisso) {
		this.numeroLati = numeroLati;
		this.lato = lato;
		this.numeroFisso = numeroFisso;
	}
	public double perimetro() {
		return lato*numeroLati;
	}
	public double apotema() {
		return lato*numeroFisso;
	}
	public double area() {
		return this.perimetro()*this.apotema()/2;
	}
	public void setNumeroLati(int numeroLati) {
		this.numeroLati = numeroLati;
	}
	public void setLato(double lato) {
		this.lato = lato;
	}
	public void setNumeroFisso(double numeroFisso) {
		this.numeroFisso = numeroFisso;
	}
	public int getNumeroLati() {
		return numeroLati;
	}
	public double getLato() {
		return lato;
	}
	public double getNumeroFisso() {
		return numeroFisso;
	}
}
