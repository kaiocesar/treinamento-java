package com.excript.aula0015;

import java.util.Scanner;

public class Aula0015 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		final double velocidade_som = 340.29; // m/s
		double espaco, per_metro, per_km;
		
		System.out.println("Entre com o espaço tempo (em segundos): ");
		espaco = in.nextDouble();
		per_metro = velocidade_som * espaco;
		per_km = per_metro / 1000;
		
		System.out.println("O espaco de " + espaco + " s foi de "+ per_metro + " m percorridos." );
		System.out.println("O espaco de " + espaco + " s foi de "+ per_km + " km percorridos." );
				
	}
	
}
