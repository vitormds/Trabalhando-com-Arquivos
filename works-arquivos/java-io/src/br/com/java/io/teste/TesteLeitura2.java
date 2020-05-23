package br.com.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("contas.csv"));
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String v1 = linhaScanner.next();
			int v2 = linhaScanner.nextInt();
			int v3 = linhaScanner.nextInt();
			String v4 = linhaScanner.next();
			Double v5 = linhaScanner.nextDouble();
			
			System.out.println(v1 + v2 + v3 + v4 + v5);
			linhaScanner.close();

			//String[] valores = linha.split(",");
			//System.out.println(valores[0]);
 			
		}
		scanner.close();
		
	}

}
