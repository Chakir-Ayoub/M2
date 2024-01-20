package com.client.tmp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.client.tmp.model.TaxeTnb;

@RestController
@RequestMapping("taxetnb-service")
public class TaxetnbRestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping()
	public List<TaxeTnb> GetAll(){
		TaxeTnb[] taxeTnbs=restTemplate.getForObject("http://localhost:8090/TaxeTnb/findAll", TaxeTnb[].class);
		return List.of(taxeTnbs);
	}
	
	@GetMapping(path = "{id}")
	public TaxeTnb GetById(@PathVariable int id){
		TaxeTnb taxeTnbs=restTemplate.getForObject("http://localhost:8090/TaxeTnb/findById/"+id, TaxeTnb.class);
		return taxeTnbs;
	}
}
