/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Guilherme
 */
@Entity
@Table(name = "cidade")
@NamedQueries({
    @NamedQuery(name = "Cidade.findAll", query = "SELECT c FROM Cidade c")})
public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_cidade")
    private Integer idCidade;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cidadeIdCidadeDestino")
    private List<Linha> linhaListDestino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cidadeIdCidadeOrigem")
    private List<Linha> linhaListOrigem;

    public Cidade() {
    }

    public Cidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public Cidade(Integer idCidade, String nome) {
        this.idCidade = idCidade;
        this.nome = nome;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Linha> getLinhaListDestino() {
        return linhaListDestino;
    }

    public void setLinhaListDestino(List<Linha> linhaListDestino) {
        this.linhaListDestino = linhaListDestino;
    }

    public List<Linha> getLinhaListOrigem() {
        return linhaListOrigem;
    }

    public void setLinhaListOrigem(List<Linha> linhaListOrigem) {
        this.linhaListOrigem = linhaListOrigem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCidade != null ? idCidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.idCidade == null && other.idCidade != null) || (this.idCidade != null && !this.idCidade.equals(other.idCidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idCidade + ";" + nome + ";" + linhaListDestino + ";" + linhaListOrigem;
    }
    
}
