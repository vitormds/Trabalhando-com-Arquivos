package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		// Fluxo de saida com Arquivo
		OutputStream fis = new FileOutputStream("lorem2.txt");
		OutputStreamWriter isr = new OutputStreamWriter(fis);
		BufferedWriter bw = new BufferedWriter(isr);
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		//bw.newLine();
		bw.newLine();
		bw.write("fim");
		bw.close();
		
	}

}
