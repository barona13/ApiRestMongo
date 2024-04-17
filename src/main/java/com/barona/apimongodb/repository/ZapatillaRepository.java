package com.barona.apimongodb.repository;

import com.barona.apimongodb.model.Zapatilla;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ZapatillaRepository extends MongoRepository<Zapatilla, String> {

}
