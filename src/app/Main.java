package app;

import classes.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\nImplementações da classe abstrata Aparelho Telefônico");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreio();

        System.out.println("\nImplementações da interface Reprodutor Musical");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        System.out.println("\nImplementações da interface Navegador de Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
