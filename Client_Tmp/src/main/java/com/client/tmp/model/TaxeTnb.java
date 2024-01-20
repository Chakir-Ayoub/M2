package com.client.tmp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaxeTnb {
	private Long id;
	private String label;
	private String description;
	private int tnbyear;
	private Double montantbase;
	private Terrain terrain;
}
