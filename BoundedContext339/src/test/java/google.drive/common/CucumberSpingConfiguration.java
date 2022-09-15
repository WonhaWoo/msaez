package google.drive.common;

import google.drive.BoundedContext339Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext339Application.class })
public class CucumberSpingConfiguration {}
