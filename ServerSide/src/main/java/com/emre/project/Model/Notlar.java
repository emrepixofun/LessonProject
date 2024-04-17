package com.emre.project.Model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author emrea
 */
@Entity
@Table(name = "Notlar")
public class Notlar
{
    @EmbeddedId
    private OgrenciSinavTuru ogrenciSinavTuru;

    @Column(name = "\"Not\"")
    private String not;

    public Notlar(){}
    public Notlar(OgrenciSinavTuru ogrenciSinavTuru, String not)
    {
        this.ogrenciSinavTuru = ogrenciSinavTuru;
        this.not = not;
    }
    
    public OgrenciSinavTuru getOgrenciSinavTuru()
    {
        return ogrenciSinavTuru;
    }

    public String getNot()
    {
        return not;
    }
    
}
