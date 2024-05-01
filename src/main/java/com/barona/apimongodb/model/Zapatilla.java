package com.barona.apimongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Document(collection= "zapatillas1")
public class Zapatilla {
	@Id
	private String id;
	private String marca;
	private String color;
	private String estilo;
	private Integer precio;

}
