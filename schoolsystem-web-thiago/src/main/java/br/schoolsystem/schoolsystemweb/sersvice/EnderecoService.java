package br.schoolsystem.schoolsystemweb.sersvice;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
	public List<String> getMunicipios(){
		return Arrays.asList("Maceió","Rio Largo","Messias","Satuba","Murici");
	}
}
