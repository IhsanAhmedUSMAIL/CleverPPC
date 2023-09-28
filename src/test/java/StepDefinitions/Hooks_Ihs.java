package StepDefinitions;

import Utilities.GWD;
import Utilities.GWD_Ihs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks_Ihs {

    @Before // Cucumber ın Annotation ı
    public void before(){

       // System.out.println("Senaryo başladı ?");
    }

    @After // Cucumber ın Annotation ı
    public void after()
    {
        // System.out.println("Senaryo bitti ?");
        // doru çalışırsa burda quit çağıracağım
        GWD_Ihs.quitDriver(); // static metodlar sınıfın adı ile çağırılıyor
    }

}
