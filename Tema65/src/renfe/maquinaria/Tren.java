package renfe.maquinaria;

import renfe.personal.Maquinista;

public class Tren {
	private Locomotora locomotora;
	private Vagon vagones[];
	private Maquinista maquinista;
	
	public Tren(Locomotora locomotora, Maquinista maquinista) {
	
		this.locomotora = locomotora;
		this.vagones = new Vagon[5];
		this.maquinista = maquinista;
	}

	public Tren(Locomotora locomotora,Vagon vagon[], Maquinista maquinista) {
		this.locomotora = locomotora;
		setVagones(vagones);
		this.maquinista = maquinista;
	}
	
	
	public Locomotora getLocomotora() {
		return locomotora;
	}

	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}
	public Vagon[] getVagones() {
		return this.vagones;
	}
	
	public void setVagones(Vagon vagones[]) {
		if( vagones.length > 5) {
			throw new IllegalArgumentException("Solo 5 vagones como máximo");
		}
		this.vagones = vagones;
	}

	public Maquinista getMaquinista() {
		return maquinista;
	}

	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}
	
	
	public void addVagon ( Vagon vagon) {
		for(int i = 0; i< this.vagones.length;i++) {
			if(this.vagones[i] != null) {
				this.vagones[i]= vagon;
				break;
			}
		}
	}
	
	
	
}



