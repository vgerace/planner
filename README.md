![image](https://raw.githubusercontent.com/vgerace/planner/main/pictures-nlw/Wallpaper%20-%201920x1080.png?token=GHSAT0AAAAAACUCSYXNZQLBEU5D35YW7BN4ZUNQUDQ)

<h3> Projeto NLW 16: Journey -  Trilha Java ☕ </h3>

---

![Status](https://img.shields.io/static/v1?label=STATUS&message=DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

<p>A NLW, idealizada pela <a target="_blank">Rocketseat</a>, pode-se traduzir como: "Next Level Week"! Uma semana de código para colocar em prática e elevar o nível da sua programação! <br><br>
A aplicação Backend <b>Planner</b> tem como principal funcionalidade o cadastro de uma viagem com suas informações principais para que possa auxiliar no planejamento e gerenciamento.
<br>

Meu objetivo em participar do evento foi a revisão de conceitos e recursos do mundo Java e Spring, o que colaborou para estudar e ampliar meus conhecimentos! 😄</p>


##  🗒️ Índice

* [Requisitos Funcionais](#requisitos-funcionais)
* [Como executar](#como-executar)
* [Tecnologias](#tecnologias)
* [Agradecimento](#agradecimento)

<h2>📌 Requisitos Funcionais</h2><a name = "requisitos-funcionais"></a>

  <ol>
        <li>
            <strong>Cadastro de Viagem:</strong>
            <p>O usuário informa o destino, data de início, data de término, e-mails dos convidados, nome completo e e-mail.</p>
        </li>
        <li>
            <strong>Confirmação de Viagem:</strong>
            <p>O criador da viagem recebe um e-mail com um link para confirmar a nova viagem.</p>
            <p>Ao clicar no link, a viagem é confirmada, os convidados recebem e-mails de confirmação e o criador é redirecionado para a página da viagem.</p>
        </li>
        <li>
            <strong>Confirmação de Convidado:</strong>
            <p>Ao clicar no link de confirmação, o convidado é redirecionado para o aplicativo.</p>
            <p>O convidado deve informar seu nome (além do e-mail que já estará preenchido).</p>
            <p>O convidado é confirmado na viagem após informar seu nome.</p>
        </li>
        <li>
            <strong>Links Importantes da Viagem:</strong>
            <p>Na página do evento, os participantes da viagem podem adicionar links importantes da viagem, como reserva de AirBnB, lugares para visitar, etc.</p>
        </li>
        <li>
            <strong>Adição de Atividades:</strong>
            <p>Na página do evento, o idealizador e convidados podem adicionar atividades que ocorrerão durante a viagem com título, data e horário.</p>
        </li>
        <li>
            <strong>Convite de Novos Participantes:</strong>
            <p>Novos participantes podem ser convidados dentro da página do evento por e-mail.</p>
            <p>Os novos participantes devem passar pelo fluxo de confirmação como qualquer outro convidado.</p>
        </li>
    </ol>


<h2> 🎯 Como executar </h2><a name = "como-executar"></a>

Na linha de comando execute:

```bash

# Clone o repositório
$ git clone https://github.com/vgerace/planner

# Entre no diretório
$ cd planner/target

# Execute o comando abaixo para startar o app
$ java -jar planner-0.0.1-SNAPSHOT.jar

[Java]

# Entre no diretório
$ cd planner/src/main/java

$ Execute a classe PlannerApplication

```

<h2> Aula 1 - Estruturação do Projeto e Funcionalidades Iniciais </h2><a name = "aula-1"></a>

- [X] Criação do projeto com Spring, Flyway, Dev Tools, Lombok, JPA e H2 Database
- [X] Configuração do banco de dados na aplicação
- [X] Criação das entidades que representam uma Trip
- [X] Criação da migration para criação da tabela Trips
- [X] Criação do repository da entidade Viagem
- [X] Criação do Endpoint do cadastro e consulta de viagem


<h2> Aula 2 - Implementação da funcionalidade das viagens, cadastro e confirmação de participantes </h2><a name = "aula-2"></a>

- [X] Criação do Endpoint de atualização de viagem
- [X] Criação da tabela de Participant e Entidade
- [X] Criação do Repository da Entidade Participante
- [X] Criação od Endpoint de Confirmação de Participante
- [X] Criação od Endpoint para Connvidar Participante
- [X] Criação do Endpoint para Consultar Participantes

<h2> Aula 3 - Implementação de todas as funcionalidades sobre as atividades da viagem e os links </h2><a name = "aula-3"></a>

- [X] Criação da tabela de Activites e Entidade
- [X] Criação do Repository da Entidade Atividade
- [X] Criação do Endpoint para criação da Atividadde
- [X] Criação od Endpoint para consultar atividades de uma viagem
- [X] Criação da tabela de Links e Entidade
- [X] Criação do Repository da Entidade Links
- [X] Criação do Endpoint para criação de link
- [X] Criação do Endpoint para consultar links de uma viagem

<h2> Desafios Aula 3 </h2>

- [X] Implementação de validação nos campos de data. (A data de começo da viagem é inferior a data de término) e (A data de uma atividade está entre as datas da viagem)
- [X] Extração do Core das Trips para dentro da classe Service
- [X] Mapeamento das Exceções da Aplicação com tratativas de erro personalizadas

<h2>⚙️ Tecnologias</h2><a name = "tecnologias"></a>
<ul>
<li>[Java-JDK] (https://www.oracle.com/java/technologies/downloads/)</li>
<li>[Maven] (https://maven.apache.org/download.cgi)</li>
<li>[Spring Boot] (https://start.spring.io/)</li>
<li>[Flyway] (https://flywaydb.org/)</li>
<li>[Insomnia] (https://insomnia.rest/download)</li>
<li>[Intellij] (https://www.jetbrains.com/idea/)</li>

</ul>

<h2>👏🏾 Agradecimento</h2><a name = "agradecimento"></a>
<p> Quero registrar meu agradecimento a todos envolvidos da equipe Rocketseat e sua comunidade, que impulsionaram e colaboraram para a realização desse projeto. </p>

