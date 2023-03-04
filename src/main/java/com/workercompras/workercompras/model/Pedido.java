package com.workercompras.workercompras.model;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pedido implements Serializable {

    @Serial
    private static final long serialVersionUID = 8426333489931208381L;

    @EqualsAndHashCode.Include
    private Long id;
    private String nome;
    private Long produto;

    private BigDecimal valor;

    private LocalDate dataCompra;

    private String cpf;

    private String cep;
}
