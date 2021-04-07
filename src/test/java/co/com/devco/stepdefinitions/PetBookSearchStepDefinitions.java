package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.ResultadoDeBusquedaInesperado;
import co.com.devco.questions.PrimerResultadoGoogle;
import co.com.devco.tasks.BuscarEnGoogle;
import co.com.devco.tasks.ClickenPetbook;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.devco.exceptions.ResultadoDeBusquedaInesperado.ENCONTRADO_OTRO_RESULTADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookSearchStepDefinitions {

    @Cuando("^El (.*) da click en el boton (.*) en Petbook Search$")
    public void UsuarioDaClickEnElBoton(String nombreActor , String nombreBoton) {
        theActorCalled(nombreActor).attemptsTo(ClickenPetbook.elBoton(nombreBoton));

    }

    @Entonces("^debe ver como resultados Imagenes de (.*)$")
    public void debeVerComoResultadosImagenesDe(String Animales) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^debe ver como resultados Imagenes de Todas las mascotas$")
    public void debeVerComoResultadosImagenesDeTodasLasMascotas() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
