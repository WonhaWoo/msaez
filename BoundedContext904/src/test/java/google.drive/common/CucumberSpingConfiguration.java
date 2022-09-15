package google.drive.common;

import google.drive.BoundedContext904Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext904Application.class })
public class CucumberSpingConfiguration {}
