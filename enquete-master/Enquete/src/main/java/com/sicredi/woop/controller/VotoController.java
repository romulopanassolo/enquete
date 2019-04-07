package com.sicredi.woop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sicredi.woop.model.Voto;
import com.sicredi.woop.service.EnqueteMannagerServiceDbImpl;

@RestController
@RequestMapping("api/voto")
public class VotoController {
	
	@Autowired
	private EnqueteMannagerServiceDbImpl service;
	
	@RequestMapping(value = "/votar", method = RequestMethod.POST)
	public Voto grava(@RequestBody Voto voto) {
		return this.service.criarVoto(voto);
	}

}
