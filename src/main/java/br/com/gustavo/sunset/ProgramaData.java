package br.com.gustavo.sunset;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaData {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate dataNascimento = LocalDate.parse("2022-07-21", DateTimeFormatter.ISO_LOCAL_DATE );
		LocalDate dataNiver = dataNascimento;
		Integer dias = 0;
		
		
			while (dataNascimento.isBefore(hoje)) {
				dataNascimento = dataNascimento.plusDays(1);
				dias++;
			}
		
			while (dataNascimento.isAfter(hoje)) {
				dataNascimento = dataNascimento.minusDays(1);
				dias--;
			}
		
		
		
		if(dias > 1 || dias == 0) {
			System.out.println("Voc� j� viveu: " + dias + " dias.");
		} else if (dias == 1){
			System.out.println("Voc� j� viveu: " + dias + " dia.");
		} else {
			System.out.println("Voc� viveu dias negativos! Voc� � um viajante do tempo!");
			System.out.println("Voc� viveu: " + dias + " dias.");
		}
		
		
		
		if((hoje.isAfter(dataNiver)) && (dias > 365)) {
			System.out.println("Voce ja fez anivers�rio esse ano!");
		} else if(hoje.isAfter(dataNiver) && dias == 365){
			System.out.println("Hoje � o seu anivers�rio! Parab�ns!");
		}else {
			System.out.println("Voc� ainda nao fez aniversario esse ano!");
		}
	}
}
