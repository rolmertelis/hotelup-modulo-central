package br.com.hotelupcore.cadastrosauxiliares;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoItemConforto {
    private UUID uuid;
    private String descricao;
    private LocalDateTime momentoInclusao;
    private LocalDateTime momentoUltimaAlteracao;
}
