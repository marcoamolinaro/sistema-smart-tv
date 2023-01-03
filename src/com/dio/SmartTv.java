package com.dio;

public class SmartTv {
	
	boolean ligada=false;
	int canal=1;
	int volume=25;
	
	public void mudarCanal(int canal) {
		this.canal = canal;
	}
	
	public void aumentarCanal() {
		this.canal++;
	}
	
	public void diminuirCanal() {
		this.canal--;
	}
	
	public void aumentarVolume() {
		this.volume++;
	}
	
	public void diminuirVolume() {
		this.volume--;
	}
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
}
