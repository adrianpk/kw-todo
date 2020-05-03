# Todo

A simple todo app based on Spring Boot and Vaadin.

# Run

```shell
$  mvn spring-boot:run
2020-05-03 19:49:01.737  INFO 5060 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-05-03 19:49:01.741  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : Started TodoApplication in 11.28 seconds (JVM running for 11.86)
2020-05-03 19:49:01.814  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : TodoLists found with findAll():
2020-05-03 19:49:01.814  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : -------------------------------
2020-05-03 19:49:01.931  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : List[id='6d966437-130a-4d54-a666-9c00163f0588', name='Buy milk', state='PENDING', archived=false]
2020-05-03 19:49:01.931  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : List[id='7a2f9e3d-fb87-4880-93ed-e9f7e1b5c3a6', name='Clean the house', state='PENDING', archived=false]
2020-05-03 19:49:01.931  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : List[id='ac33af81-98d0-4c93-88ba-868e7b0c8ade', name='Cancel cable subscription', state='PENDING', archived=false]
2020-05-03 19:49:01.931  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : List[id='c13a3a2d-f37f-4841-bf14-a9ab7882162e', name='Repair the roof', state='PENDING', archived=false]
2020-05-03 19:49:01.931  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  :
2020-05-03 19:49:01.935  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : TodoList found with findOne(6d966437-130a-4d54-a666-9c00163f0588):
2020-05-03 19:49:01.935  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : --------------------------------
2020-05-03 19:49:01.968  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : List[id='6d966437-130a-4d54-a666-9c00163f0588', name='Buy milk', state='PENDING', archived=false]
2020-05-03 19:49:01.968  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  :
2020-05-03 19:49:01.968  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : TodoList found with findByNameStartsWithIgnoreCase('Buy milk'):
2020-05-03 19:49:01.968  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : --------------------------------------------
2020-05-03 19:49:01.977  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  : List[id='6d966437-130a-4d54-a666-9c00163f0588', name='Buy milk', state='PENDING', archived=false]
2020-05-03 19:49:01.977  INFO 5060 --- [           main] io.github.kugotech.todo.TodoApplication  :

```
