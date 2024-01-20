package com.client.tmp.model;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proprietaire {
	private int id;
	private String nom;
	private String prenom;
	private String CIN;
	private String password;
	private Set<Role> roles = new HashSet<>();

}
