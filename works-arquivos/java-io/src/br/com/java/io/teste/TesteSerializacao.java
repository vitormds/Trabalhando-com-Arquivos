package br.com.java.io.teste;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TesteSerializacao {
	public static void main(String[] args) throws IOException, ClassNotFoundException   {
		// Caso tivesse outro objeto dentro de Cliente é necessario usar o transiet ex: private transient Cliente cliente
		// para isolar a serializacao
	 	Cliente c = new Cliente();
	 	c.setNome("Vitor");
	 	c.setProfissao("Dev");
	 	c.setCpf("86133255577");
	 	
//	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//	oos.writeObject(c);
//	oos.close();
//	
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
	Cliente cliente = (Cliente) ois.readObject();
	ois.close();
	System.out.println(cliente.getCpf());
	}

}
