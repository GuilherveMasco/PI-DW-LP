/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author a1603019
 */
@Embeddable
public class PoltronaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "linha_id_linha")
    private int linhaIdLinha;

    public PoltronaPK() {
    }

    public PoltronaPK(int numero, int linhaIdLinha) {
        this.numero = numero;
        this.linhaIdLinha = linhaIdLinha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getLinhaIdLinha() {
        return linhaIdLinha;
    }

    public void setLinhaIdLinha(int linhaIdLinha) {
        this.linhaIdLinha = linhaIdLinha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numero;
        hash += (int) linhaIdLinha;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoltronaPK)) {
            return false;
        }
        PoltronaPK other = (PoltronaPK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.linhaIdLinha != other.linhaIdLinha) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.PoltronaPK[ numero=" + numero + ", linhaIdLinha=" + linhaIdLinha + " ]";
    }
    
}
