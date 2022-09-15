package google.drive.common;

import google.drive.BoundedContext344Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext344Application.class })
public class CucumberSpingConfiguration {}
