package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class TestePrintWriter {

	public static void main(String[] args) throws IOException {
		// Não consigo Buferizar
//		OutputStream fis = new FileOutputStream("lorem2.txt");
//		OutputStreamWriter isr = new OutputStreamWriter(fis);
//		BufferedWriter bw = new BufferedWriter(isr);
		PrintStream ps = new PrintStream("lorem2.txt");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println();
		ps.println("fim");
	
		ps.close();
		
	}

}
