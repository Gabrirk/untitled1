package stepDefinition;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de treinamento")
    public void que_o_usuário_acessou_o_a_arquivo_Campo_de_treinamento(){
        componentes.inicializa();
    }

    @Quando("o usuário digitar Batatinha")
    public void o_usuário_digitar_Batatinha(){
        componentes.testeTextField();
    }

    @Entao("o resultado no campo textfield de ser Batatinha")
    public void o_resultado_no_campo_textfield_de_ser_Batatinha(){
        componentes.validaTextField();
        componentes.fechaNavegador();
    }

}