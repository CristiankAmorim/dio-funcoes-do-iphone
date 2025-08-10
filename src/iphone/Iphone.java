package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Página sendo exibida: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada com sucesso");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Ligação atendida");
	}

	@Override
	public void ligarCorreioVoz() {
		System.out.println("Correio de voz ligado");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " + musica);
	}

}
