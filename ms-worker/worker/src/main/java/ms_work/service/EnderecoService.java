package ms_work.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import ms_work.entites.Endereco;
import ms_work.integration.viaCep.EnderecoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class EnderecoService {
    @Autowired
    private ObjectMapper objectMapper;


    public Endereco getEndereco(String cep) throws Exception {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("http://viacep.com.br/ws/" + cep + "/json/")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            EnderecoResponse enderecoResponse = objectMapper.readValue(response.body(), EnderecoResponse.class);
            return new Endereco(null, enderecoResponse.cep(), enderecoResponse.logradouro(), null, enderecoResponse.estado());
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
