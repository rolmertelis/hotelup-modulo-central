package br.com.hotelupcore.nossosclientes;

import br.com.hotelupcore.emailsclientes.EmailsClientes;
import br.com.hotelupcore.cadastrosauxiliares.tipodocumento.TipoDocumento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NossoClienteResponse {
    private String RazoSocial;
    private String NomeFantasia;
    private String RACF;
    private String documento;
    private String enderecoFisico;
    private TipoDocumento tipoDocumento;
    private NossoCliente grupoEconomico;
    private Set<EmailsClientes> emails;
    private String urlSite;
    private String urlSiteReservas;
}

