# Enquete
Crie uma Pauta, cadastre os associados, vote na pergunta da pauta respondendo sim ou não. A pauta será encerrada. o Resultado da enquete será contabilizado.
	
Pré Requisitos

Instalar e ter configurado o banco de dados postgres na porta 5432 e usar os seguintes dados:
	login: postgres 
	senha: admin
Para alterar estes valores pode editar o arquivo application. 
Enquete\src\main\resources\application
Ter Eclipse configurado com java 8 e Maven 

Rodar a aplicação
Criar a configuração maven install do projeto Enquete
Usar a classe EnqueteApplication.java para rodar como Java Aplication.
A aplicação irá rodar o spring boot no servidor tom-cat e disponibilizar os serviços rest abaixo:
	Mapped "{[/api/associado/grava],methods=[POST]}" 
	Mapped "{[/api/pauta/criar],methods=[POST]}" 
	Mapped "{[/api/votosPauta/encerrarPauta/{pautaId}],methods=[GET]}" 
	Mapped "{[/api/votosPauta/gravarVotosPauta]

A apicação cria também as tabelas na base postgress.
Roteiro para executar os serviços
Criar associados     http://localhost:8080/api/associado/grava
[ {"nome":"joao"},
  {"nome":"carlos"}, 
  {"nome":"maria"},
  {"nome":"jose"},
  {"nome":"joana"}, 
  {"nome":"lucas"}
  ]
retorno
[{"id":1,"nome":"joao"},{"id":2,"nome":"carlos"},{"id":3,"nome":"maria"},{"id":4,"nome":"jose"},{"id":5,"nome":"joana"},{"id":6,"nome":"lucas}]
Criar pauta  http://localhost:8080/api/pauta/criar
{"nome":"java","pergunta":"programa java"}
votar    http://localhost:8080/api/voto/votar
method POST
body

{"associado":{"id":1,"nome":"joao"}, "pauta":{"id":1,"nome":"java","pergunta":"programa java"},"simNao":true}
{"associado":{"id":2,"nome":"carlos"}, "pauta":{"id":1,"nome":"java","pergunta":"programa java"},"simNao":true}
{"associado":{"id":3,"nome":"maria"}, "pauta":{"id":1,"nome":"java","pergunta":"programa java"},"simNao":false}
{"associado":{"id":4,"nome":"jose"}, "pauta":{"id":1,"nome":"java","pergunta":"programa java"},"simNao":true}
{"associado":{"id":5,"nome":"joana"}, "pauta":{"id":1,"nome":"java","pergunta":"programa java"},"simNao":false}

encerrar pauta  http://localhost:8080/api/votosPauta/encerrarPauta/1
gravar votos pauta
http://localhost:8080/api/votosPauta/gravarVotosPauta
method POST
body

{"pauta":{"id":1,"nome":"java","pergunta":"programa java"},"sim":3,"nao":2,"total":5}

