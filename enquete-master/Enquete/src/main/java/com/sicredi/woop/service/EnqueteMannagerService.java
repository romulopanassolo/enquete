package com.sicredi.woop.service;

import java.util.List;

import com.sicredi.woop.model.Associado;
import com.sicredi.woop.model.Pauta;
import com.sicredi.woop.model.Voto;
import com.sicredi.woop.model.VotosPauta;

public interface EnqueteMannagerService {
	
	public List<Associado> gravarAssociados(List<Associado> associados);
	
	public Pauta criarPauta(Pauta pauta);
	
	public Boolean pautaAbertaVoto(Long pautaId);
	
	public Voto criarVoto(Voto voto);
	
	public Boolean jaVotou(Long associadoId);
	
	public VotosPauta gravarVotosPauta(VotosPauta votosPauta);
	
	public VotosPauta encerrarPauta(Long pautaId);

} 
