package com.implement.dispositivo;

import com.interfaces.dispositivo.AparelhoTelefonico;
import com.interfaces.dispositivo.ReprodutorMusica;
import com.interfaces.dispositivo.NavegadorInternet;

public class Dispositivo implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {

	@Override
	public void tocarMusica() {
		System.out.println("Tocando musica pelo Iphone");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: "+musica);
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausa na musica");
		
	}

	@Override
	public void exibirPagina(String site) {
		System.out.println("Pagina "+site + " exibida");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada!");
		
	}

	@Override
	public void addAba() {
		System.out.println("Aba adicionada...");
		
	}

	@Override
	public void ligar(long telefone) {
		System.out.println("Ligando para o numero "+telefone+"...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Deixando mensagem de voz...");
		
	}
	
}
