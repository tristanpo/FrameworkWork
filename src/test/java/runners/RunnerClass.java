package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = "src/test/resources/features/",

            glue = "steps",

            dryRun = false,

            monochrome = true,

           // tags = ,

            plugin = {"html:target/cucumber.html", "pretty", "json:target/cucumber.json",
                    "rerun:target/failed.txt"
            }
    )

    public class RunnerClass {
}
