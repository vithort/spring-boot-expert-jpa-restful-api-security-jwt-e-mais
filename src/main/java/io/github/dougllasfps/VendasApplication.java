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
            // assim:
            System.out.println("Salvar Clientes: ");
            Cliente cliente = new Cliente("Dougllas");
            clientes.salvar(cliente);
            // ou assim:
            clientes.salvar(new Cliente("Outro Cliente"));


            /*
            // Listar Clientes:
            System.out.println("Listar Clientes: ");
            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            // Atualizar Clientes:
            System.out.println("Atualizar Clientes: ");
            todosClientes.forEach(c ->  {
                c.setNome(c.getNome() + " atualizado.");
                clientes.atualizar(c);
            });

            // Listar Clientes:
            System.out.println("Listar Clientes: ");
            todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            // Listar Clientes por Nome:
            System.out.println("Listar Clientes por Nome: ");
            clientes.buscarPorNome("Cli").forEach(System.out::println);
*/
            // Deletar Clientes:
            /*
            System.out.println("Deletar Clientes: ");
            clientes.obterTodos().forEach(c -> {
                clientes.deletar(c);
            });
             */
/*
            // Listar Clientes:
            System.out.println("Listar Clientes: ");
            todosClientes = clientes.obterTodos();
            if (todosClientes.isEmpty()) {
                System.out.println("Nenhum cliente encontrado!");
            } else {
                todosClientes.forEach(System.out::println);
            }
            */
        };
    }


    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
