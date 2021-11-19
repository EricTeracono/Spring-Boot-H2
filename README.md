# Spring-Boot-H2
Aplicativo feito para o Desafio PADO.

Primeiramente para rodar o aplicativo é necessário o IDE de preferência, eu por exemplo utilizei o IDE Eclipse

Link para Download:

https://www.eclipse.org/downloads/

Também é necessário um client de REST, utilizei o Advanced REST Client, mas qualquer um pode ser utilizado:

Link Para Download:

https://install.advancedrestclient.com/install

O próximo passo é baixar os arquivos desse GitHub, e importa-los na IDE:

Para importar no Eclipse o caminho é:

File->Import->Maven->Existing Maven Projects->Next

Agora clicar em browse e selecionar a pasta spring-boot-h2 onde foi instalado no computador.

Após importado o projeto, clique em cima do spring-boot-h2, selecione agora Run->Run (botão verde de play) para rodar o aplicativo. Clique em SpringBootH2Application e em OK. O aplicativo agora está rodando.

O Aplicativo é um sistema para cadastros de dispositivos IoT e tem 3 funcionalidades.

A primeira é o cadastro de um único dispositivo IoT.

Para isso, no Advanced REST Client, em HTTP request, selecione

Method:POST
Request URL: http://localhost:8080/registrar

Em Headers, nos campos escreva

Header name: content-type

Header value: application/json

Em Body selecione:

Body content type: application/json

Editor view: Raw Input

Para cadastrar o dispositivo, um exemplo para colocar no Body seria:

![image](https://user-images.githubusercontent.com/94720397/142698296-6b32e58f-0abd-427d-a0fd-75364bada2e7.png)

E clique em Format JSON, se já não o estiver.

Aperte então o botão SEND no canto superior direito. 
A resposta será 201 Created e embaixo o Id do dispositivo e o mac do dispositivo.

A segunda funcionalidade é a listagem de todos os dispositivos cadastrados.

Criaremos novamente um HTTP Request, com as seguintes informações.

Method:GET
http://localhost:8080/listar

Em Headers, nos campos escreva

Header name: content-type

Header value: application/json

Aperte o botão de SEND.

Um exemplo da lista que vai aparecer é:

![image](https://user-images.githubusercontent.com/94720397/142698245-5e6157ea-d875-493d-a729-21d2751f3ea4.png)

E a terceira e ultima funcionalidade é a possibilidade de procurar um dispositivo atraves do seu ID.

Em HTTP request, os campos serão:

Method:GET
http://localhost:8080/listar/"numero_de_id_do_dispositivo"

exemplos:

http://localhost:8080/listar/1

http://localhost:8080/listar/2

Aperte o botão de SEND e o resultado será o dispositivo do ID que você procurou.

Esse é o programa, espero que tenham gostado.

Att, Eric.
