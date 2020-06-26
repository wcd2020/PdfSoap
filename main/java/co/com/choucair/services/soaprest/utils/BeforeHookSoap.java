package co.com.choucair.services.soaprest.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.choucair.services.soaprest.utils.enums.SoapService.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BeforeHookSoap {
    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
