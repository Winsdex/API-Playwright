package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\features\\FreeRangeNavegacion.feature", //Directorio de archivos . feature
                glue = "src\\test\\java\\steps", // PAquete donde tyenemos nuestras clases definiendo los steps escritos en el feature file
                plugin = { "pretty", "html:target/cucumber-reports" }
)

public class TestRunner {
    
}