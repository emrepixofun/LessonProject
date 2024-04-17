package com.emre.project;

import com.emre.project.Data.SinavTuruAdi;
import com.emre.project.Model.Ogrenci;
import com.emre.project.Model.SinavTuru;
import com.emre.project.Repository.OgrenciRepository;
import com.emre.project.Repository.SinavTuruRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectApplicationTests {

    @Autowired private OgrenciRepository ogrenciRepository;
    @Autowired private SinavTuruRepository sinavTuruRepository;

    @Test
    void contextLoads()
    {
//        //
//        Ogrenci ogrenci1 = new Ogrenci("Ali");
//        Ogrenci ogrenci2 = new Ogrenci("Ayşe");
//          
//        ogrenciRepository.save(ogrenci1);        
//        ogrenciRepository.save(ogrenci2);        
//
//        //
//        SinavTuru sinavTuru1 = new SinavTuru(SinavTuruAdi.Vize1);
//        SinavTuru sinavTuru2 = new SinavTuru(SinavTuruAdi.Vize2);
//        SinavTuru sinavTuru3 = new SinavTuru(SinavTuruAdi.Final);
//          
//        sinavTuruRepository.save(sinavTuru1);        
//        sinavTuruRepository.save(sinavTuru2);        
//        sinavTuruRepository.save(sinavTuru3);        
    }

}
