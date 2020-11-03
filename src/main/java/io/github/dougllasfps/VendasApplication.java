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
            List<Cliente> todosClientes = clientes.findAll();
            todosClientes.forEach(System.out::println);

            // Atualizar Clientes:
            System.out.println("Atualizar Clientes: ");
            todosClientes.forEach(c ->  {
                c.setNome(c.getNome() + " atualizado.");
                clientes.save(c);
            });

            // Listar Clientes:
            System.out.println("Listar Clientes: ");
            todosClientes = clientes.findAll();
            todosClientes.forEach(System.out::println);

            // Listar Clientes por Nome:
            System.out.println("Listar Clientes por Nome: ");
            clientes.findByNomeLike("Cli").forEach(System.out::println);

            // Deletar Clientes:
            System.out.println("Deletar Clientes: ");
            clientes.findAll().forEach(c -> {
                clientes.delete(c);
            });

            // Listar Clientes:
            System.out.println("Listar Clientes: ");
            todosClientes = clientes.findAll();
            if (todosClientes.isEmpty()) {
                System.out.println("Nenhum cliente encontrado!");
            } else {
                todosClientes.forEach(System.out::println);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
