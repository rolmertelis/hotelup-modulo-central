package br.com.hotelupcore.unidadeshabitacionais;

import br.com.hotelupcore.itemConforto.ItemConfortoUh;
import br.com.hotelupcore.localizacoesedificacoes.LocalizacaoEdificacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Uh {
    private UUID uuid;
    private int numeroInterno;
    private int numeroMininoHospedes;
    private int numeroMaximoHospedes;
    private boolean vistaExterna;
    private boolean VistaPanoramica;
    private boolean acessoIndependente;
    private boolean acessoCaeiraDeRodas;
    private boolean sinalizacaoPessoaCega;
    private LocalizacaoEdificacao localizacao;
    private List<ItemConfortoUh> itensConfortoUh;
    private LocalDateTime momentoInclusao;
    private LocalDateTime momentoUltimaAlteracao;




}
