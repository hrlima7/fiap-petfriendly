package br.com.petmagnetcom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "t_colaborador")
public class Colaborador extends LogRegistro {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sq_colaborador")
	private Long id;	

	@Column(name = "nm_colaborador", length = 60)
	@NotEmpty
	@Min(value = 5)
	@Max(value = 60)
	private String nome;

	@Column(name = "ds_senha", length = 20)
	@NotEmpty
	@Min(value = 5)
	@Max(value = 20)
	private String senha;
		
	@Column(name = "id_estabel", length = 15)
	@NotEmpty
	private Long idEstabelecimento;

	@ManyToOne
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	private Estabelecimento estabelecimento;	
}
