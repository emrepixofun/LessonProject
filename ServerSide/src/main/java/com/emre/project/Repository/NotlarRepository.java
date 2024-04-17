package com.emre.project.Repository;

import com.emre.project.Model.Notlar;
import com.emre.project.Model.OgrenciSinavTuru;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author emrea
 */
public interface NotlarRepository extends CrudRepository<Notlar, OgrenciSinavTuru>
{

}
