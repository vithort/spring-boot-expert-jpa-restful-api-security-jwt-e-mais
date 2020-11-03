package io.github.dougllasfps;

import io.github.dougllasfps.domain.entity.Cliente;
import io.github.dougllasfps.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {
            // Salvar Clientes:
            System.out.println("Salvar Clientes: ");
            clientes.save(new Cliente("Dougllas"));
            clientes.save(new Cliente("Outro Cliente"));

            // Listar Clientes:
            System.out.println("Listar Clientes: ");
            boolean existe = clientes.existsByNome("Dougllas");
            System.out.println("Existe um cliente com o nome Dougllas?  " + existe);

            // Listar Clientes com @Query
            List<Cliente> result = clientes.encontrarPorNome("Dougllas");
            result.forEach(System.out::println);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
