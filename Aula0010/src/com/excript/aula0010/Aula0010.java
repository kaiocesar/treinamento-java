package com.excript.aula0010;

import java.util.Scanner;

public class Aula0010 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		double n1, n2, n3, n4, media;
		System.out.println("Digite a primeira nota: ");
		n1 = in.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = in.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = in.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		n4 = in.nextDouble();
		
		media = (n1+n2+n3+n4) / 4;
								
		if (media >= 7){
			System.out.println("Você foi aprovado! sua média final foi: "+ media);
		} else {
			System.out.println("Putz! você foi reprovado. A sua média final foi: "+ media);
		}
		
	}
	
}
