<h1 align="center" style="font-weight: bold;">Chatbot API 💻</h1>

<p align="center">
 <a href="#tech">Technologies</a> • 
 <a href="#started">Getting Started</a> • 
 <a href="#routes">API Endpoints</a> 
</p>

<p align="center">
    <b>API that responds to automatic messages using keyword mapping </b>
</p>
The API was developed during Fernanda Kipper's <a href="https://www.youtube.com/watch?v=VIrACqbLqvM">live on Youtube</a> 

<h2 id="technologies">💻 Technologies</h2>

- Java
- Spring Boot

<h2 id="started">🚀 Getting started</h2>

Here you describe how to run your project locally


<h3>Installation</h3>

1. Clone the repository:

```bash
git clone https://github.com/seanycarol/chatbot-backend.git
```

2. Install dependencies with Maven


<h3>Usage</h3>

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

<h2 id="routes">📍 API Endpoints</h2>

Here you can list the main routes of your API, and what are their expected request bodies.
​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>POST /api/chat</kbd>     | answers question using keyword mapping [request details](#post-answer-question)

<h3 id="post-answer-question">POST /api/chat</h3>

**REQUEST**
```json
{
  "message": "quando o museu foi criado"
}
```

**RESPONSE**
```json
{
  "message": "O Museu do Doce de Pelotas foi inaugurado em 2004, com o objetivo de preservar e divulgar a história da tradição doceira da cidade."
}
```
    </td>
  </tr>
</table>
