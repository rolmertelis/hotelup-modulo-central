package br.com.hotelupcore.nossosclientes;

import java.util.UUID;

public class NossoClienteRepository {

    public NossoCliente retornaClientePeloId(UUID idCliente){
        NossoCliente nossoCliente = new NossoCliente();
        nossoCliente.setIdCliente(idCliente);
        return nossoCliente;
    }

}
