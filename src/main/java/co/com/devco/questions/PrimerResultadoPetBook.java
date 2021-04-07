package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static co.com.devco.userinterfaces.GoogleResultadosPage.PRIMER_RESULTADO;

public class PrimerResultadoPetBook implements Question<Boolean> {
    private String resultado;

    public PrimerResultadoPetBook(String resultado){
        this.resultado = resultado;
    }

    public static PrimerResultadoPetBook es(String resultado){
        return new PrimerResultadoPetBook(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(PRIMER_RESULTADO).named("href").viewedBy(actor).asString();
        return resultadoEncontrado.contains(resultado);
    }
}
