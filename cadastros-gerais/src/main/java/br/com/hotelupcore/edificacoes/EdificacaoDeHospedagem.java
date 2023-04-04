package br.com.hotelupcore.edificacoes;

import br.com.hotelupcore.cadastrosauxiliares.TipoEdificacao;
import br.com.hotelupcore.nossosclientes.NossoCliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EdificacaoDeHospedagem {
    private UUID uuid;
    private TipoEdificacao tipoEdificacao;
    private NossoCliente nossoCliente;
    private String endereco;
}
