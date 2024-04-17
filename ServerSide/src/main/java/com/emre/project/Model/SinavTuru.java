package com.emre.project.Model;

import com.emre.project.Data.SinavTuruAdi;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author emrea
 */
@Entity
@Table(name = "SinavTuru")
public class SinavTuru
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SinavTuruId")
    private Integer sinavTuruId;
  
    @Column(name = "SinavTuruAdi")
    private SinavTuruAdi sinavTuruAdi;
  
    public SinavTuru(){}
    public SinavTuru(SinavTuruAdi sinavTuruAdi)
    {
        this.sinavTuruAdi = sinavTuruAdi;
    }

    public Integer getSinavTuruId()
    {
        return sinavTuruId;
    }

    public SinavTuruAdi getSinavTuruAdi()
    {
        return sinavTuruAdi;
    }

}
