package com.sicredi.woop.service;

import java.util.List;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import com.sicredi.woop.business.VotosPautaBusiness;
import com.sicredi.woop.model.Associado;
import com.sicredi.woop.model.Pauta;
import com.sicredi.woop.model.Voto;
import com.sicredi.woop.model.VotosPauta;
import com.sicredi.woop.repository.AssociadoRepository;
import com.sicredi.woop.repository.PautaRepository;
import com.sicredi.woop.repository.VotoRepository;
import com.sicredi.woop.repository.VotosPautaRepository;

@ManagedBean
public class EnqueteMannagerServiceDbImpl implements EnqueteMannagerService {

	
	@Autowired
	private AssociadoRepository associadoRepository;
	
	@Autowired
	private PautaRepository pautaRepository;
	
	@Autowired
	private VotoRepository votoRepository;
	
	@Autowired
	private VotosPautaRepository votosPautaRepository;
	
	@Autowired
	private VotosPautaBusiness votosPautaBusiness;
	
	@Override
	public List<Associado> gravarAssociados(List<Associado> associados) {
		return associadoRepository.save(associados);
	}

	@Override
	public Pauta criarPauta(Pauta pauta) {
		return pautaRepository.save(pauta);
	}

	@Override
	public Boolean pautaAbertaVoto(Long pautaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Voto criarVoto(Voto voto) {
		return votoRepository.save(voto);
	}

	@Override
	public Boolean jaVotou(Long associadoId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public VotosPauta gravarVotosPauta(VotosPauta votosPauta) {
		return votosPautaRepository.save(votosPauta);
	}

	@Override
	public VotosPauta encerrarPauta(Long pautaId) {
		return votosPautaBusiness.encerrarPauta(pautaId);
	}
}
