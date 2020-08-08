package br.com.petmagnetcom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.br.CNPJ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
 
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "t_estabelecimento")
public class Estabelecimento extends LogRegistro {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sq_estabelecimento")
	private Long id;	
	
	@Column(name = "nr_cnpj", length = 20)
	@CNPJ
	@NotEmpty
	private String cnpj;

	@Column(name = "nm_estabel", length = 40)
	@NotEmpty
//	@Min(value = 5)
//	@Max(value = 60)
	private String nome;
	
	@Column(name = "ds_compl_end", length = 20)
	private String complEndereco;
	
	@ManyToOne
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	private Endereco endereco;	
}
