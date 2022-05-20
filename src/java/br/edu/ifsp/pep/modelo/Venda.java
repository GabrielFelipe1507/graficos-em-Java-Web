package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table(name="venda")
public class Venda implements Serializable{
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)   
   private long id;
   @Column(name="data", nullable = false)
   @Temporal(javax.persistence.TemporalType.DATE)
   private Date data;
   @Column(name="valor", nullable = false)
   private double valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Venda(long id, Date data, double valor) {
        this.id = id;
        this.data = data;
        this.valor = valor;
    }

    public Venda() {
    }
   
}
