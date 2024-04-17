package com.emre.project;

import com.emre.project.Data.SinavTuruAdi;
import com.emre.project.Model.Ogrenci;
import com.emre.project.Model.SinavTuru;
import com.emre.project.Repository.OgrenciRepository;
import com.emre.project.Repository.SinavTuruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author emrea
 */
@Component
public class DataLoader implements ApplicationRunner {

    private OgrenciRepository ogrenciRepository;
    private SinavTuruRepository sinavTuruRepository;

    @Autowired
    public DataLoader(OgrenciRepository ogrenciRepository, SinavTuruRepository sinavTuruRepository) {
        this.ogrenciRepository = ogrenciRepository;
        this.sinavTuruRepository = sinavTuruRepository;
    }

    public void run(ApplicationArguments args)
    {
        ogrenciRepository.save(new Ogrenci("Ali"));        
        ogrenciRepository.save( new Ogrenci("Ayşe"));        

        sinavTuruRepository.save(new SinavTuru(SinavTuruAdi.Vize1));        
        sinavTuruRepository.save(new SinavTuru(SinavTuruAdi.Vize2));        
        sinavTuruRepository.save(new SinavTuru(SinavTuruAdi.Final));   
    }

}