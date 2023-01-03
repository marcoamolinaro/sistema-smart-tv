package com.dio;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Smart TV Ligada? " + smartTv.ligada);
		System.out.println("Smart TV Canal: " + smartTv.canal);
		System.out.println("Smart TV Volume: " + smartTv.volume);
		
		smartTv.ligar();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.mudarCanal(30);
		
		System.out.println("\nSmart TV Ligada? " + smartTv.ligada);
		System.out.println("Smart TV Canal: " + smartTv.canal);
		System.out.println("Smart TV Volume: " + smartTv.volume);
		
		smartTv.ligar();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.diminuirCanal();
		
		System.out.println("\nSmart TV Ligada? " + smartTv.ligada);
		System.out.println("Smart TV Canal: " + smartTv.canal);
		System.out.println("Smart TV Volume: " + smartTv.volume);

		smartTv.desligar();
		
		System.out.println("\nSmart TV Ligada? " + smartTv.ligada);
		System.out.println("Smart TV Canal: " + smartTv.canal);
		System.out.println("Smart TV Volume: " + smartTv.volume);
	}

}
