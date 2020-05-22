package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		// Fluxo de saida com Arquivo
//		OutputStream fis = new FileOutputStream("lorem2.txt");
//		OutputStreamWriter isr = new OutputStreamWriter(fis);
//		BufferedWriter bw = new BufferedWriter(isr);
		
		
		BufferedWriter fw = new BufferedWriter(new FileWriter("lorem2.txt"));
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("fim");
		fw.close();
		
	}

}
