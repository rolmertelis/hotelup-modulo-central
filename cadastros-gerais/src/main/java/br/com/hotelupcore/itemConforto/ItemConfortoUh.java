package br.com.hotelupcore.itemConforto;

import br.com.hotelupcore.unidadeshabitacionais.Uh;
import br.com.hotelupcore.cadastrosauxiliares.TipoItemConforto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ItemConfortoUh {
    private UUID uuid;
    private Uh uh;
    private int quantidade;
    private TipoItemConforto itemConforto;
    private LocalDateTime momentoInclusao;
    private LocalDateTime momentoUltimaAlteracao;



}
