package com.sicredi.woop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sicredi.woop.model.VotosPauta;
import com.sicredi.woop.service.EnqueteMannagerServiceDbImpl;

@RestController
@RequestMapping("api/votosPauta")
public class VotosPautaController {
	
	@Autowired
	private EnqueteMannagerServiceDbImpl service;
	
	@RequestMapping(value = "/gravarVotosPauta", method = RequestMethod.POST)
	public VotosPauta grava(@RequestBody VotosPauta votosPauta) {
		return this.service.gravarVotosPauta(votosPauta);
	}
	
	@RequestMapping(value = "/encerrarPauta/{pautaId}", method = RequestMethod.GET)
	public VotosPauta  encerrarPauta(@PathVariable("pautaId") Long pautaId) {
		return this.service.encerrarPauta(pautaId);
	}


}
