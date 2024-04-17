package com.barona.apimongodb.contoller;

import com.barona.apimongodb.model.Zapatilla;
import com.barona.apimongodb.service.ZapatillaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ZapatillaController {

    public final ZapatillaService zapatillaService;

    @PostMapping("/zapatillas")
    public void save(@RequestBody Zapatilla zapatilla){

        zapatillaService.save(zapatilla);
    }

    @GetMapping("/zapatillas")
    public List<Zapatilla> findAll(){

       return zapatillaService.findAll();
    }

    @GetMapping("/zapatilla/{id}")
    public Zapatilla findById(@PathVariable String id){

        return zapatillaService.findById(id).get();
    }

    @DeleteMapping("/zapatilla/{id}")
    public void deleteById(@PathVariable String id){

        zapatillaService.deleteById(id);
    }

    @PutMapping("/zapatillas")
    public void update(@RequestBody Zapatilla zapatilla){

        zapatillaService.save(zapatilla);
    }

    @PatchMapping("/zapatillas/{id}")
    public Zapatilla patch( @PathVariable String id, @RequestBody Zapatilla zapatilla ){
        return zapatillaService.patch( id, zapatilla  );
    }

    @RequestMapping(path = "/optionsZapatilla")
    public HttpHeaders optionsZapatilla() {
        return zapatillaService.optionsZapatilla();
    }
}
