package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage extends PageObject {
     public static final Target INPUT_TEXT = Target.the("INPUT TEXT").locatedBy("//*[@id=\"idProfesor\"]");
     public static  final Target BUTTON_BUSCAR = Target.the("Boton buscar").locatedBy("//*[@id=\"root\"]/div/div/div/div[2]/button");
     public static final Target TEXT_RESULTS_PAGE = Target.the("Texto de resultados de consulta").locatedBy("//*[@id=\"root\"]/div/div/table/tbody/tr/td[1]");


}
