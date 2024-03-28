package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
            else{
                System.out.println("Não existe convidado!");
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contaConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contaConvidados() + " convidados(s) dentro do set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1355);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1677);

        System.out.println("Existem " + conjuntoConvidados.contaConvidados() + " convidados(s) dentro do set de Convidados");
        conjuntoConvidados.removerConvidadoPorCodigo(1234);
        conjuntoConvidados.exibirConvidados();
    }
}
