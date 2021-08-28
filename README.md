# API de exemplo de como consumir o serviço dos correios de rastreamento de objetos utilizando Spring Cloud OpenFeign 

Foi desenvolvido um serviço simples para consumir a API dos correios de rastreamento de objetos, utilizando 
Spring Boot e Spring Cloud OpenFeign.


 Objetivos
  - verificar a versão da API dos Correios;
  - Listar os eventos do(s) objeto(s);
  - Listar o primeiro evento do(s) objeto(s);
  - Listar o último evento do(s) objeto(s);
  
### Stack utilizada

* Java 11
* Spring Boot Web; Cloud OpenFeign;
* Maven
* Lombok

### Instalação

```sh
$ git clone https://github.com/TiagoPastor/customer-consume-api-correios.git
$ cd customer-consume-api-correios
$ mvn package
$ cd target
$ java -jar customer-consume-api-correios.jar
```

### Spring Boot Version

```
Pode importar como projeto maven existente no Spring Tool Suite 4 que foi a versão usada para desenvolver
```

### Arquivo de Collection Json - Usar no Postman

```
  - O arquivo de Collection Json está na pasta Docs. Pode copiar e importar no postman para testar os payloads da api
```

### Exemplo do Json que a API recebe. É a mesma estrutura que é passada para os Correios. 

```
    {
      "objetos": ["XX999999999XX"]
    }
	
```





  
