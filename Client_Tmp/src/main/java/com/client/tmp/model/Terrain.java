package com.client.tmp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Terrain {
	private int id;
	private int mc;
	private Proprietaire proprietaire;
	private Categorie categorie;
}
