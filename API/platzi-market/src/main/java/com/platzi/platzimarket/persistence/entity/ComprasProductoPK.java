package com.platzi.platzimarket.persistence.entity;

import java.io.*;
import java.util.*;

import jakarta.persistence.*;

@Embeddable
public class ComprasProductoPK implements Serializable{
	
	@Column(name = "id_compra")
	private Integer idCompra;
	
	@Column(name = "id_cliente")
	private Integer idCliente;

	
	
	@Override
    public int hashCode() {
        return Objects.hash(idCompra, idCliente);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ComprasProductoPK that = (ComprasProductoPK) obj;
        return Objects.equals(idCompra, that.idCompra) &&
               Objects.equals(idCliente, that.idCliente);
    }
	
	
	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	
}
