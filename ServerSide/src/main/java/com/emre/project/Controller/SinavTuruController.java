package com.emre.project.Controller;

import com.emre.project.Model.SinavTuru;
import com.emre.project.Repository.SinavTuruRepository;
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
public class SinavTuruController
{
    private final SinavTuruRepository sinavTuruRepository;

    public SinavTuruController(SinavTuruRepository sinavTuruRepository)
    {
        this.sinavTuruRepository = sinavTuruRepository;
    }

    @CrossOrigin
    @GetMapping("/sinavTuru")
    public Iterable<SinavTuru> findAll()
    {
        return sinavTuruRepository.findAll();
    }
    @CrossOrigin
    @PostMapping("/sinavTuru")
    public SinavTuru addSinavTuru(@RequestBody SinavTuru sinavTuru)
    {
        return sinavTuruRepository.save(sinavTuru);
    }
  
}
