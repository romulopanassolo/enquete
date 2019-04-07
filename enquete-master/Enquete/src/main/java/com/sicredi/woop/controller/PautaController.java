package com.sicredi.woop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sicredi.woop.model.Pauta;
import com.sicredi.woop.service.EnqueteMannagerServiceDbImpl;

@RestController
@RequestMapping("api/pauta")
public class PautaController {
	
	@Autowired
	private EnqueteMannagerServiceDbImpl service;
	
	@RequestMapping(value = "/criar", method = RequestMethod.POST)
	public Pauta grava(@RequestBody Pauta pauta) {
		return this.service.criarPauta(pauta);
	}

}
