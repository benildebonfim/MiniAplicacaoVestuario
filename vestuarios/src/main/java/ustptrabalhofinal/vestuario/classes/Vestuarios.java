package ustptrabalhofinal.vestuario.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tb_vestuarios")
public class Vestuarios {

	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	@Id
	private Long codigo;
	private String name;
	private String cor;
	private String tamanho;
	private String tipo;
	private String categoria;
	private String fabricante;
	private String marca;
	private String estado;
	private Double preco;
	private String tipoUnidade;
	private Long estoqueMinimo;
	private Long estoqueMaximo;
	private String descricao;
	
	
	public Vestuarios() {
		super();
	}
	
	
	public Vestuarios(Long id, Long codigo, String name, String cor, String tamanho, String tipo, String categoria,
			String fabricante, String marca, String estado, Double preco, String tipoUnidade, Long estoqueMinimo,
			Long estoqueMaximo, String descricao) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.name = name;
		this.cor = cor;
		this.tamanho = tamanho;
		this.tipo = tipo;
		this.categoria = categoria;
		this.fabricante = fabricante;
		this.marca = marca;
		this.estado = estado;
		this.preco = preco;
		this.tipoUnidade = tipoUnidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
		this.descricao = descricao;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public String getTipoUnidade() {
		return tipoUnidade;
	}


	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}


	public Long getEstoqueMinimo() {
		return estoqueMinimo;
	}


	public void setEstoqueMinimo(Long estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}


	public Long getEstoqueMaximo() {
		return estoqueMaximo;
	}


	public void setEstoqueMaximo(Long estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}





	
	