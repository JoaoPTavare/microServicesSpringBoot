package ms_work.controller;

import ms_work.entites.Endereco;
import ms_work.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("{cep}")
    public Endereco getEndereco(@PathVariable String cep) throws Exception {
        return enderecoService.getEndereco(cep);
    }
}
