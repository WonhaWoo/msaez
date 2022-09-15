package google.drive.common;

import google.drive.ProcesserApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProcesserApplication.class })
public class CucumberSpingConfiguration {}
