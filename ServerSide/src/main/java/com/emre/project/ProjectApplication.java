package com.emre.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ProjectApplication.class, args);
    }

}
