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
			//System.out.println(linha);
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			String valorFormatado = String.format(new Locale("pt", "BR"),"%s - %04d-%08d %20s: %010.2f", tipoConta,agencia,numero,titular,saldo);
			System.out.println(valorFormatado);
			//System.out.println(v1 +","+ v2 +","+ v3 +","+ v4 +","+ v5);
			linhaScanner.close();

			//String[] valores = linha.split(",");
			//System.out.println(valores[0]);
 			
		}
		scanner.close();
		
	}

}
