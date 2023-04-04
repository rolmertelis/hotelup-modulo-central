package br.com.hotelupcore.nossosclientes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NossoClienteService {

    NossoClienteRepository nossoClienteRepository;

    public NossoCliente retornaNossoClientePeloId(UUID idCliente){
        return nossoClienteRepository.retornaClientePeloId(idCliente);
    }

}
