package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_PROFESSOR")
@Getter
@Setter
public  class Professor extends BaseORM {
	
	@Id @GeneratedValue
	@Column(name="ID_PROFESSOR")
	private Long id;
	@Column(name="NR_MATRICULA")
	private Long matricula;
	@Column(name="TX_NOME")
	private String nome;
	
	
}
