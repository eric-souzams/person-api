<h1 align="center">Sistema de gerenciamento de pessoas em API REST com Spring Boot</h1>

<p align="center">
  <a href="#sobre">Sobre</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#build">Building</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#features">Features</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#contribuindo">Contribuindo</a>&nbsp;&nbsp;&nbsp;
</p>

## Sobre
Pequeno sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.


## Tecnologias
Este projeto foi desenvolvido usando as seguintes tecnologias:

- [Spring Boot](https://spring.io/)
- [Java](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)

## Build
Você vai precisar da [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) ou superior instalada em seu computador para poder compilar.

```bash
git clone https://github.com/eric-souzams/person-api.git
$ cd /person-api
$ mvn spring-boot:run
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/person
```

## Features
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Desenvolvimento de testes unitários para validação das funcionalidades

## Contribuindo

Este repositório está atualmente em desenvolvimento. Se você quiser contribuir, faça um fork do repositório e coloque a mão na massa, faça as alterações conforme desejar e envie uma pull.