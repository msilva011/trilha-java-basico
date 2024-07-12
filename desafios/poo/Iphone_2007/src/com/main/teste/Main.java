package com.main.teste;
import com.implement.dispositivo.Dispositivo;

public class Main {

	public static void main(String[] args) {
		Dispositivo iphone = new Dispositivo();
		
		iphone.selecionarMusica("Metamorfose ambulante");
		iphone.tocarMusica();
		iphone.pausarMusica();
		
		iphone.addAba();
		iphone.exibirPagina("www.gabriellemoreira.com");
		iphone.atualizarPagina();
		
		iphone.ligar(11912345678L);
	}

}
