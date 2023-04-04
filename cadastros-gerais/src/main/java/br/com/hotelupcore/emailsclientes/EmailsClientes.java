package br.com.hotelupcore.emailsclientes;

import br.com.hotelupcore.cadastrosauxiliares.TipoEmail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmailsClientes {
    private UUID uuid;
    private String enderecoEmail;
    private TipoEmail tipoEmail;
}
