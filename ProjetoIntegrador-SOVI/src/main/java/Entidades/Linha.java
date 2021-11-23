/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author a1603019
 */
@Entity
@Table(name = "linha")
@NamedQueries({
    @NamedQuery(name = "Linha.findAll", query = "SELECT l FROM Linha l")})
public class Linha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_linha")
    private Integer idLinha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horario")
    @Temporal(TemporalType.TIME)
    private Date horario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private double valor;
    @JoinTable(name = "linha_has_motorista", joinColumns = {
        @JoinColumn(name = "linha_id_linha", referencedColumnName = "id_linha")}, inverseJoinColumns = {
        @JoinColumn(name = "motorista_id_motorista", referencedColumnName = "id_motorista")})
    @ManyToMany
    private List<Motorista> motoristaList;
    @JoinColumn(name = "cidade_id_cidade_destino", referencedColumnName = "id_cidade")
    @ManyToOne(optional = false)
    private Cidade cidadeIdCidadeDestino;
    @JoinColumn(name = "cidade_id_cidade_origem", referencedColumnName = "id_cidade")
    @ManyToOne(optional = false)
    private Cidade cidadeIdCidadeOrigem;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "linha")
    private List<Poltrona> poltronaList;

    public Linha() {
    }

    public Linha(Integer idLinha) {
        this.idLinha = idLinha;
    }

    public Linha(Integer idLinha, Date data, Date horario, double valor) {
        this.idLinha = idLinha;
        this.data = data;
        this.horario = horario;
        this.valor = valor;
    }

    public Integer getIdLinha() {
        return idLinha;
    }

    public void setIdLinha(Integer idLinha) {
        this.idLinha = idLinha;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Motorista> getMotoristaList() {
        return motoristaList;
    }

    public void setMotoristaList(List<Motorista> motoristaList) {
        this.motoristaList = motoristaList;
    }

    public Cidade getCidadeIdCidadeDestino() {
        return cidadeIdCidadeDestino;
    }

    public void setCidadeIdCidadeDestino(Cidade cidadeIdCidadeDestino) {
        this.cidadeIdCidadeDestino = cidadeIdCidadeDestino;
    }

    public Cidade getCidadeIdCidadeOrigem() {
        return cidadeIdCidadeOrigem;
    }

    public void setCidadeIdCidadeOrigem(Cidade cidadeIdCidadeOrigem) {
        this.cidadeIdCidadeOrigem = cidadeIdCidadeOrigem;
    }

    public List<Poltrona> getPoltronaList() {
        return poltronaList;
    }

    public void setPoltronaList(List<Poltrona> poltronaList) {
        this.poltronaList = poltronaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLinha != null ? idLinha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linha)) {
            return false;
        }
        Linha other = (Linha) object;
        if ((this.idLinha == null && other.idLinha != null) || (this.idLinha != null && !this.idLinha.equals(other.idLinha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Linha[ idLinha=" + idLinha + " ]";
    }
    
}
