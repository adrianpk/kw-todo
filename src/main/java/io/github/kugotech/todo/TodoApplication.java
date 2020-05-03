package io.github.kugotech.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class TodoApplication {

	private static final Logger log = LoggerFactory.getLogger(TodoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(TodoRepo repo) {
		return (args) -> {
			// Save some todos.
			repo.save(new Todo("Buy milk", Todo.Status.PENDING));
			repo.save(new Todo("Clean the house", Todo.Status.PENDING));
			repo.save(new Todo("Cancel cable subscription", Todo.Status.DONE));
			repo.save(new Todo("Repair the roof", Todo.Status.ARCHIVED));

			// fetch all todos.
			log.info("Todos found with findAll():");
			log.info("-------------------------------");
			List<Todo> todos = repo.findAll();
			for (Todo todo : todos) {
				log.info(todo.toString());
			}
			log.info("");

			// fetch todos by id.
			UUID id = todos.get(0).getId();
			log.info("Todos found with findOne(" + id + "):");
			log.info("--------------------------------");
			Todo todo = repo.findById(id).get(0);
			log.info(todo.toString());
			log.info("");

			// Fetch todos by name.
			log.info("Todos found with findByNameStartsWithIgnoreCase('Buy milk'):");
			log.info("--------------------------------------------");
			for (Todo buyTheMilk : repo.findByNameStartsWithIgnoreCase("Buy")) {
				log.info(buyTheMilk.toString());
			}
			log.info("");
		};
	}
}
