package desafio.itau.springboot.DTO;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactioRequest {
   @NotNull

    private Double valor;
   @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
