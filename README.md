 📊 Sistema de Gestão Escolar

Este projeto é um sistema para gestão de uma escola, permitindo o controle de alunos, professores, cursos, disciplinas e matrículas.  
O objetivo é organizar as informações acadêmicas, facilitando o gerenciamento de cursos e o acompanhamento dos alunos.


 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot (Web, Data JPA)
- H2 Database
- JPA / Hibernate
- Maven
- Arquitetura RESTful

🧠 Funcionalidades Principais

👨‍🎓 Alunos
- Cadastro de alunos  
- Consulta de dados  
- Associação com matrículas  

 👨‍🏫 Professores
- Cadastro de professores  
- Definição de especialidade  
- Associação com disciplinas  

 📚 Cursos
- Cadastro de cursos  
- Definição de carga horária  
- Classificação por:
  - Nível (Técnico, Graduação, Pós-graduação)
  - Tipo (Presencial, EAD, Híbrido)

📖 Disciplinas
- Cadastro de disciplinas  
- Associação com:
  - Curso  
  - Professor  

 📝 Matrículas
- Realização de matrícula de alunos em cursos  
- Registro de data da matrícula  
- Controle do vínculo aluno-curso  

 🧱 Modelagem do Domínio

 Entidades:
- Aluno
- Professor
- Curso
- Disciplina
- Matricula

 Enumerações:
- NivelCurso
- TipoCurso

🌐 API REST – Endpoints Principais

 Alunos
GET    /alunos  
GET    /alunos/{id}  
POST   /alunos  
PUT    /alunos/{id}  
DELETE /alunos/{id}  

Professores
GET    /professores  
POST   /professores  
PUT    /professores/{id}  
DELETE /professores/{id}  

 Cursos
GET    /cursos  
POST   /cursos  
PUT    /cursos/{id}  
DELETE /cursos/{id}  

 Disciplinas
GET    /disciplinas  
POST   /disciplinas  
PUT    /disciplinas/{id}  
DELETE /disciplinas/{id}  

 Matrículas
GET    /matriculas  
POST   /matriculas  
PUT    /matriculas/{id}  
DELETE /matriculas/{id}  

 ⚙️ Regras de Negócio

- Aluno pode se matricular em um curso  
- Curso possui várias disciplinas  
- Professor pode ministrar várias disciplinas  
- Disciplina pertence a um curso  
- Matrícula vincula aluno a um curso  

 🛠️ Como Executar

Requisitos:
- Java 17+
- Maven

  Executar:
mvn spring-boot:run

  Acessar:
http://localhost:8080  
http://localhost:8080/h2-console  

📌 Status do Projeto

- ✔️ Back-end funcional  
- ✔️ CRUD completo  
- ✔️ API REST funcionando  
- ✔️ Banco H2 configurado  
- ⬜ Front-end não implementado  

## 🤝 Contribuições

Sugestões e melhorias são bem-vindas!
