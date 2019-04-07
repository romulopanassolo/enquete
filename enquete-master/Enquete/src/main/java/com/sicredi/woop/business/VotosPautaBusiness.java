package com.sicredi.woop.business;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import com.sicredi.woop.model.Pauta;
import com.sicredi.woop.model.Voto;
import com.sicredi.woop.model.VotosPauta;
import com.sicredi.woop.repository.PautaRepository;
import com.sicredi.woop.repository.VotoRepository;

@ManagedBean
public class VotosPautaBusiness {

	@Autowired
	private PautaRepository pautaRepository;
	
	@Autowired
	private VotoRepository votoRepository;
	
	public VotosPauta encerrarPauta(Long pautaId) {
		
		Pauta pauta = pautaRepository.findOne(pautaId);
		List<Voto> votos = votoRepository.findAll();		
		VotosPauta votosPauta = contabilizarVotos(votos, pauta);
		return votosPauta;
	}
	
	
	public VotosPauta contabilizarVotos(List<Voto> votos, Pauta pauta) {
		VotosPauta votosPauta = new VotosPauta();
		
		votosPauta.setPauta(pauta);
		votosPauta.setSim(votosSim(votos));
		votosPauta.setNao(votosNao(votos));
		votosPauta.setTotal(votos.size());

		return votosPauta;
	}
	
	public Integer votosSim(List<Voto> votos) {
		return votos.stream().filter(v -> v.getSimNao())
				.collect(Collectors.toList()).size();
	}
	
	public Integer votosNao(List<Voto> votos) {
		return votos.stream().filter(v -> !v.getSimNao())
				.collect(Collectors.toList()).size();
		
	}
	
	
}
