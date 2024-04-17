package com.barona.apimongodb.service;

import com.barona.apimongodb.model.Zapatilla;
import org.springframework.http.HttpHeaders;


import java.util.List;
import java.util.Optional;

public interface IZapatillaService {

    public void save (Zapatilla zapatilla);

    public List<Zapatilla> findAll();

    public Zapatilla patch(String id, Zapatilla zapatilla);

    public Optional<Zapatilla> findById(String id);

    public void deleteById(String id);

    public HttpHeaders optionsZapatilla();
}
