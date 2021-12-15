# BackendDeveloperChallenge

BackendDeveloperChallenge is a java rest ws for dealing with countries.

## Installation

#SQL 
    CREATE DATABASE "DeveloperChallengeDB"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
	
    CREATE TABLE public.Pais
    (
        id serial PRIMARY KEY NOT NULL,
        nome varchar(64) NOT NULL,
        capital varchar(64) NOT NULL,
        regiao varchar(64) NOT NULL,
        subregiao varchar(64),
        area varchar(64)
    );
    CREATE UNIQUE INDEX Pais_id_uindex ON public.Pais (id);

##Wildfly (minor version 16.0.0.Final)
Add the following datasource:

<datasource jta="false" jndi-name="java:jboss/datasources/DeveloperChallengeDS" pool-name="challenge-unit" enabled="true" use-java-context="true" statistics-enabled="true">
   <connection-url>jdbc:postgresql://127.0.0.1:5432/DeveloperChallengeDB</connection-url>
	<driver-class>org.postgresql.Driver</driver-class>
	<driver>org.postgresql</driver>
	<pool>
		<allow-multiple-users>true</allow-multiple-users>
	</pool>
	<security>
		<user-name>draft</user-name>
		<password>Password.1</password>
	</security>
</datasource>


##Maven (minor version 3.6.1)
Use the package to generate the artifact.

```bash
mvn clean package
```

## Usage

```WS
/pais
PaisSpec

# add Pais
@POST
@Path("/adicionar")
@RequestBody(AdicionarPaisRequest)
@Response(AdicionarPaisResponse) 

# returns Paises
@POST
@Path("/listar")
@RequestBody(ListarPaisesRequest)
@Response(ListarPaisesResponse) 

# Edit Pais
@POST
@Path("/editar")
@RequestBody(EditarPaisRequest)
@Response(EditarPaisResponse) 

# Remove Pais
@POST
@Path("/remover")
@RequestBody(RemoverPaisRequest)
@Response(RemoverPaisResponse) 
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)
