package com.sicredi.woop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sicredi.woop.model.Associado;
import com.sicredi.woop.service.EnqueteMannagerServiceDbImpl;

@RestController
@RequestMapping("api/associado")
public class AssociadoController {
	
	@Autowired
	private EnqueteMannagerServiceDbImpl service;
	
	@RequestMapping(value = "/grava", method = RequestMethod.POST)
	public List<Associado> grava(@RequestBody List<Associado> associados) {
		return this.service.gravarAssociados(associados);
	}

}
