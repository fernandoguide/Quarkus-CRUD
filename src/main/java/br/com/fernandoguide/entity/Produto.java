package br.com.fernandoguide.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import java.math.BigDecimal;

import java.time.LocalDateTime;


@Entity
public class Produto extends PanacheEntity {

    public String nome;

    public BigDecimal valor;
    @CreationTimestamp
    public LocalDateTime dataCriacao;
    @UpdateTimestamp
    public LocalDateTime dataAtualizacao;


}
