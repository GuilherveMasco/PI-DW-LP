/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author a1603019
 */
@Entity
@Table(name = "poltrona")
@NamedQueries({
    @NamedQuery(name = "Poltrona.findAll", query = "SELECT p FROM Poltrona p")})
public class Poltrona implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PoltronaPK poltronaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "documento")
    private String documento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ocupada")
    private short ocupada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "data_compra")
    private String dataCompra;
    @JoinColumn(name = "linha_id_linha", referencedColumnName = "id_linha", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Linha linha;

    public Poltrona() {
    }

    public Poltrona(PoltronaPK poltronaPK) {
        this.poltronaPK = poltronaPK;
    }

    public Poltrona(PoltronaPK poltronaPK, String nome, String documento, short ocupada, String dataCompra) {
        this.poltronaPK = poltronaPK;
        this.nome = nome;
        this.documento = documento;
        this.ocupada = ocupada;
        this.dataCompra = dataCompra;
    }

    public Poltrona(int numero, int linhaIdLinha) {
        this.poltronaPK = new PoltronaPK(numero, linhaIdLinha);
    }

    public PoltronaPK getPoltronaPK() {
        return poltronaPK;
    }

    public void setPoltronaPK(PoltronaPK poltronaPK) {
        this.poltronaPK = poltronaPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public short getOcupada() {
        return ocupada;
    }

    public void setOcupada(short ocupada) {
        this.ocupada = ocupada;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (poltronaPK != null ? poltronaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poltrona)) {
            return false;
        }
        Poltrona other = (Poltrona) object;
        if ((this.poltronaPK == null && other.poltronaPK != null) || (this.poltronaPK != null && !this.poltronaPK.equals(other.poltronaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Poltrona[ poltronaPK=" + poltronaPK + " ]";
    }
    
}
