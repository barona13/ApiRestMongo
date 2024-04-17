package com.barona.apimongodb.contoller;


import com.barona.apimongodb.model.Zapatilla;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IZapatillaController {

    void save (Zapatilla zapatilla);

    List<Zapatilla> findAll();

    Zapatilla findById(String id);

    void deleteById(String id);

    Zapatilla update(Zapatilla zapatilla);

    public HttpHeaders optionsZapatilla();

    Zapatilla patch(String id, Zapatilla zapatilla );

}
