package br.com.petmagnetcom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "t_endereco")
public class Endereco extends LogRegistro {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sq_endereco")
	private Long id;	
	
	@Column(name = "ds_logradouro", nullable = false, length = 150)
	private String logradouro;
	
	@Column(name = "nr_estabel", nullable = false, length = 5)
	private String numero;
	
	@Column(name = "ds_bairro", nullable = false, length = 40)
	private String bairro;
	
	@Column(name = "ds_cidade", nullable = false, length = 40)
	private String cidade;
	
	@Column(name = "cd_uf", nullable = false, length = 3)
	private String UF;
	
	@Column(name = "cd_pais", nullable = false, length = 02)
	private String pais;
	
	@Column(name = "nr_cep", nullable = false, length = 9)
	private String cep;
	
	@Column(name = "nr_latitude")
	@JsonIgnore
	private String latitude;
	
	@Column(name = "nr_longitude")
	@JsonIgnore
	private String longitude;
	
//	@OneToMany(mappedBy = "endereco")
//	private Set<Estabelecimento> estabelecimento;
}
