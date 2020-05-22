package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		// usar console
		// usar teclado 
		// rede
		Socket sk = new Socket();
		InputStream is =  sk.getInputStream(); // System.in;//new FileInputStream("lorem.txt");
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = sk.getOutputStream();//  System.out; // new FileOutputStream("lorem2.txt");
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		String l = br.readLine();
		while(l != null && !l.isEmpty()) {
			bw.write(l);
			bw.newLine();
			bw.flush();
			l = br.readLine();
		}
		br.close();
		bw.close();
		
		
	}
}
