package br.edu.usj.lp2;

import java.util.List;
import java.util.ArrayList;

public class ListaPessoas {
	List<Pessoa> pessoas;

	public ListaPessoas() {
	pessoas = new ArrayList<Pessoa>();
	
	 Pessoa p1 = new Pessoa();
	 p1.setNome("Marcondes");
	 p1.setEmail("marcondesjorgemachado@gmail.com");
	pessoas.add(p1);
	
	Pessoa p2 = new Pessoa();
	p2.setNome("Tiririca");
    p2.setEmail("pior@queta.com");
	pessoas.add(p2);
	
	Pessoa p3 = new Pessoa();
	p3.setNome("Memo");
	p3.setEmail("memo@gmail.com");
	pessoas.add(p3);
	}
	public List<Pessoa> getListaPessoas() {
	return pessoas;
	
	

	}
}
