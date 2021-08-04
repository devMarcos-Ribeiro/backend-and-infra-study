# Testes de API automatizados com Postman.

## Aba Tests:
- Postman possui uma aba chamada "Tests" que nela é possível incluir alguns scripts de testes para verificar a integridade, resposta, automatizar atribuição de valores a variáveis etc.

- A aba testes possui alguns exemplos de scripts já prontos como "Set a global variable", "Set an environment variable", "Status code is 200" etc.

## Os scripts:

- Os scripts são escritos em JavaScript como mostra a <a href="https://learning.postman.com/docs/writing-scripts/test-scripts/">documentação</a>.

- Exemplo de script que deve garantir que o status da resposta é 200:
```js
pm.test("Status code is 200", () => {
    pm.response.to.have(200);
})
```

## Scripts criado no curso "Automatizando Testes de API com Postman" em Alura+

- Corpo de resposta da API:
```json
[
    {
        "postId":1,
        "id":1,
        "name":"Laboris exercitation proident commodo commodo.",
        "email":"Eliseo@gardner.biz",
        "body": "Dolor labore labore reprehenderit consectetur qui eu occaecat sit adipisicing elit ex."
    }
]
```

- Garantir que a respota esteja em formato **.json**
```js
pm.test("Response is json format", () => {
    pm.response.to.be.json;
});
```
-Tiny Validator (Usado para validar o formato da resposta: se é um array, inteiro etc)
```js
pm.test("Response is in a valid format", () => {
    var schema = {
        type: "array" // Garantir que o corpo da resposta seja um array.
        items: { // acessar os itens de dentro do corpo (array)
            type: "object",
            required: ['postId', 'name', 'calopsita'], // Se 'calopsita' fosse um campo obrigatório na resposta, o teste iria falhar pois o corpo devolvido não contém calopsita
            properties { // acessar as propriedades do objeto em si.
                postId: {
                    type: "integer"
                },
                body: {
                    type: "string"
                }
            }
        }
    }
    console.log(pm.response.json()); // Para acessar o console do postman utiliza-se do atalho Ctrl + Alt + C
    pm.expect(tv4.validate(pm.response.json(), schema)).to.be.true;
})
```