package com.emre.project.Controller;

import com.emre.project.Model.Notlar;
import com.emre.project.Repository.NotlarRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author emrea
 */
@RestController
public class NotlarController
{
    private final NotlarRepository notlarRepository;

    public NotlarController(NotlarRepository notlarRepository)
    {
        this.notlarRepository = notlarRepository;
    }

    @CrossOrigin
    @GetMapping("/notlar")
    public Iterable<Notlar> findAll()
    {
        return notlarRepository.findAll();
    }
    @CrossOrigin
    @PostMapping("/notlar")
    public Notlar addNotlar(@RequestBody Notlar notlar)
    {
        if(notlar.getNot() == null || notlar.getNot().trim().isEmpty())
            return null;

        return notlarRepository.save(notlar);
    }
  
}
