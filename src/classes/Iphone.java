package classes;

import classes.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Iphone ligou...");
    }

    @Override
    public void atender() {
        System.out.println("Iphone: atendeu ligação...");
    }

    @Override
    public void iniciarCorreio() {
        System.out.println("Iphone: iniciou correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Iphone: exibiu página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone: adicionou nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone: atualizou página...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Iphone: tocou música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Iphone: pausou música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Iphone: selecionou música...");
    }
}
