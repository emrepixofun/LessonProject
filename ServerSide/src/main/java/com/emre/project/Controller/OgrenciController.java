package com.emre.project.Controller;

import com.emre.project.Model.Ogrenci;
import com.emre.project.Repository.OgrenciRepository;
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
public class OgrenciController
{
    private final OgrenciRepository ogrenciRepository;

    public OgrenciController(OgrenciRepository ogrenciRepository)
    {
        this.ogrenciRepository = ogrenciRepository;
    }

    @CrossOrigin
    @GetMapping("/ogrenci")
    public Iterable<Ogrenci> findAll()
    {
        return ogrenciRepository.findAll();
    }
    @CrossOrigin
    @PostMapping("/ogrenci")
    public Ogrenci addOgrenci(@RequestBody Ogrenci ogrenci)
    {
        return ogrenciRepository.save(ogrenci);
    }
  
}
