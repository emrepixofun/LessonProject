package com.emre.project.Model;

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
@Table(name = "Ogrenci")
public class Ogrenci
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OgrenciId")
    private Integer ogrenciId;

    @Column(name = "AdSoyad")
    private String adSoyad;
  
    public Ogrenci(){}
    public Ogrenci(String adSoyad)
    {
        this.adSoyad = adSoyad;
    }

    public Integer getOgrenciId()
    {
      return ogrenciId;
    }

    public String getAdSoyad()
    {
      return adSoyad;
    }

}
