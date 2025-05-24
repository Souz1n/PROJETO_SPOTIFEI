# PROJETO_SPOTIFEI 

# Visão Geral

Spotifei é um sistema de streaming de músicas desenvolvido como projeto prático da disciplina arquitetura de software e programação orientada a objeto. A aplicação em Java com interface e PostgreSQL, simula funcionalidades de uma plataforma musical.

# Funcionalidades Desenvolvidas

### Login e Cadastro

* *Login de usuário* e *login administrador*
* *Cadastro de novos usuários*
* Validações de login via banco de dados

### Músicas

* *Cadastro de músicas e artistas*
* *Busca de músicas* pelo nome,artista ou gênero
* *Exibição de dados*: artista, ano e gênero

### Pesquisa com Curtida/Descurtida

* Ao pesquisar uma música, o usuário pode:

  * Curtir a música
  * Descurtir a música
  * Adicionar a música em uma playlist

### Playlists

* Criação de playlists personalizadas 
* incrementar música e editar playlist  
* Visualização das playlists criadas em formato de lista

### Estatísticas (Admin)

* *Top 5 músicas mais curtidas*
* *Top 5 músicas mais descurtidas*
* *Total de usuários registrados*
* *Total de músicas no sistema*

### Histórico do Usuário

* Exibe:

  * Últimas 10 músicas buscadas
  * Lista de curtidas
  * Lista de descurtidas

### Tecnologias Utilizadas

| Tecnologia | Finalidade |
|------------|------------|
| **Java (GUI)** | Interface gráfica |
| **PostgreSQL** | Banco de dados relacional |
| **NetBeans IDE** | Ambiente de desenvolvimento |
| **Git/GitHub** | Commits e colaboração do cógido com docente |

### Arquitetura do Projeto

O projeto foi construído seguindo o padrão de arquitetura **MVC (Model-View-Controller)**, visando uma melhor organização e separação de responsabilidades:

- **Model**: contém as classes que representam os dados da aplicação (ex: `Musica`, `Usuario`, `Playlist`) e classes DAO que realizam a comunicação com o banco de dados.
- **View**: contém as interfaces gráficas desenvolvidas (ex: `telaLogCad`, `telaMenuUser`, `telaMenuAdm`).
- **Controller**: responsável por gerenciar a lógica de controle e ações entre Model e View (ex: `ControleLogin`, `ControleMusica`).


### Modelagem do Banco de Dados

Principais tabelas do sistema:

| Tabela              | Atributos                                      
|---------------------|------------------------------------------------|
| **artista**         | `id`, `banda`, `id_pessoa`                     | 
| **historico**       | `nome_musica`, `id`, `id_usuario`, `tipo`      | 
| **curtidas**        | `id`, `status`, `id_musica`, `id_usuario`      | 
| **musica**          | `id`, `id_artista`, `ano`, `nome_musica`, `genero` 
| **pessoa**          | `nome`, `id`, `email`                          | 
| **playlist**        | `id`, `id_musica`, `id_usuario`, `nome`        | 
| **playlist_musica** | `id`, `id_usuario`, `id_musica`, `id_playlist` | 
| **usuarios**        | `id`, `senha`, `id_pessoa`                     |

### Como Executar o Projeto

1. Clonar o repositório:

bash
git clone https://github.com/Souz1n/PROJETO_SPOTIFEI.git


2. Abrir no *NetBeans IDE*
3. Configurar a conexão com o banco PostgreSQL em Conexao.java
4. Executar main a partir da tela telaHome

### Conclusão

Este projeto integra diversos conceitos fundamentais da área de desenvolvimento de software, como bancos de dados relacionais, modelagem de dados, interfaces gráficas e o padrão de arquitetura MVC (Model-View-Controller).

O Spotifei foi um projeto desafiador desenvolvido durante o semestre, com foco principal na experiência do usuário, buscando tornar a interação com o sistema intuitiva e eficiente. A implementação envolveu a construção de múltiplas funcionalidades, unindo diferentes partes do sistema.

O desenvolvimento foi realizado em dupla, o que agregou ainda mais valor ao projeto, pois permitiu a divisão de responsabilidades e a inclusão de uma área administrativa que contempla funcionalidades específicas voltadas à gestão e manutenção do sistema.


### Desenvolvedores

Brayan André da Costa   ```– RA: 22.124.005-4```

Gustavo Souza Alvarenga ```– RA: 22.124.058-3```
