package arrayList;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		//Escreva um programa que crie um ArrayList. Adicione alguma cores (strings) e as imprima na tela
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Vermelho");
		lista.add("Rosa");
		lista.add("Amarelo");
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Escreva um programa para adicionar um elemento na primeira posição da lista.
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Elemento");
		list.set(0, "Elemento");
		
		System.out.println(list.get(0));
		
		//Escreva um programa para remover o terceiro elemento da lista
		
		ArrayList<String> listaRemove = new ArrayList<String>();
		listaRemove.add(0,"Primeiro");
		listaRemove.add(1,"Segundo");
		listaRemove.add(2,"Terceiro");
		listaRemove.add(3,"Quarto");
		
		listaRemove.remove(2);
		
		for(int i = 0; i < listaRemove.size(); i++) {
			System.out.println(listaRemove.get(i));
		}
		
		/*Faça um programa que receba a temperatura média de cada mês do
			ano e armazene-as em uma lista. Após isto, calcule a média anual das
			temperaturas e mostre todas as temperaturas acima da média anual,
			e em que mês elas ocorreram (mostrar o mês por extenso: 1 –
			Janeiro, 2 – Fevereiro, . . .*/
		
		 ArrayList<Double> temperaturaMedia = new ArrayList<Double>();
		double mediaAnual = 0;
		double temperaturas = 0;
		
		System.out.println("Insira a temperatura média de cada mês do ano");
   
		for(int i = 0; i < 12; i++) {
			temperaturaMedia.add(i, new Scanner(System.in).nextDouble());
		}
		
		for(int i = 0; i < temperaturaMedia.size(); i++) {
			temperaturas = temperaturas + temperaturaMedia.get(i);
		}
	
		mediaAnual = temperaturas/12;
		
		System.out.println("A média anual de temperaturas foi: " + mediaAnual +"°C");
		
		for(int i = 0; i < temperaturaMedia.size(); i++) {
			if(temperaturaMedia.get(i) >= mediaAnual) {
				switch(i) {
				case 1:{
					System.out.println(i+ " - Janeiro: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 2:{
					System.out.println(i+ " - Fevereiro: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 3:{
					System.out.println(i+ " - Março: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 4:{
					System.out.println(i+ " - Abril: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 5:{
					System.out.println(i+ " - Maio: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 6:{
					System.out.println(i+ " - Junho: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 7:{
					System.out.println(i+ " - Julho: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 8:{
					System.out.println(i+ " - Agosto: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 9:{
					System.out.println(i+ " - Setembro: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 10:{
					System.out.println(i+ " - Outubro: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 11:{
					System.out.println(i+ " - Novembro: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
				case 12:{
					System.out.println(i+ " - Dezembro: " + temperaturaMedia.get(i)+ "°C");
					break;
				}
			}
		}
	}
		
		/*10) Utilizando listas, faça um programa que faça 5 perguntas para
		uma pessoa sobre um crime. As perguntas são:
		a. "Telefonou para a vítima?"
		b. "Esteve no local do crime?"
		c. "Mora perto da vítima?"
		d. "Devia para a vítima?"
		e. "Já trabalhou com a vítima?" 
		O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a
		pessoa responder positivo a 2 questões ela deve ser classificada como
		"Suspeita"
		, entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso
		contrário, ele será classificado como "Inocente"*/
		
		ArrayList<String> perguntas = new ArrayList<String>();
		ArrayList<Integer> suspeito = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		
		perguntas.add("a. Telefonou para a vítima?");
		perguntas.add("b. Esteve no local do crime?");
		perguntas.add("c. Mora perto da vítima?");
		perguntas.add("d. Devia para a vítima?");
		perguntas.add("e. Já trabalhou com a vítima?");
		
		System.out.println("Vamos começar o interrogatório. Digite S ou N para as perguntas seguintes");
		
		//System.out.println(perguntas.get(0));
		
		for(int i = 0; i < 5; i++) {
			System.out.println(perguntas.get(i));
			
			char entrada = ler.next().charAt(0);
			
			if(entrada == 'S' || entrada == 's') {
				suspeito.add(1);
			}
		}
		
		ler.close();
		
		if(suspeito.size() > 0 && suspeito.size() <= 2) {
			System.out.println("Suspeita");
		}else if(suspeito.size() == 3 || suspeito.size() == 4) {
			System.out.println("Cúmplice");
		}else if(suspeito.size() == 5) {
			System.out.println("Assassino");
		}else {
			System.out.println("Inocente");
		}
	}
}