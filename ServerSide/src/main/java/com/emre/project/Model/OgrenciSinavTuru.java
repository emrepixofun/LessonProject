package com.emre.project.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;

/**
 *
 * @author emrea
 */
@Embeddable
public class OgrenciSinavTuru implements Serializable
{
    @ManyToOne
    @JoinColumn(name = "OgrenciId")
    private Ogrenci ogrenci;

    @ManyToOne
    @JoinColumn(name = "SinavTuruId")
    private SinavTuru sinavTuru;

    public OgrenciSinavTuru(){}
    public OgrenciSinavTuru(Ogrenci ogrenci, SinavTuru sinavTuru)
    {
        this.ogrenci = ogrenci;
        this.sinavTuru = sinavTuru;
    }
    
    public Ogrenci getOgrenci()
    {
        return ogrenci;
    }
    public SinavTuru getSinavTuru()
    {
        return sinavTuru;
    }

}
