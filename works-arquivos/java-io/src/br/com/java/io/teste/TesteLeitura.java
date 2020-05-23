package br.com.java.io.teste;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com Arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader bf = new BufferedReader(isr);
		String linha = bf.readLine();
		 
		System.out.println(linha);
		bf.close();
		
	}

}
