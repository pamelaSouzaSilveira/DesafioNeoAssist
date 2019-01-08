# DesafioNeoAssist

O presente projeto de minha autoria é apresentado como parte do processo seletivo da vaga de estágio de Desenvolvedor PHP da NeoAssist. 

Conforme solicitado seguem todos os arquivos necessários: arquivo ticketsOrdenados.json com os resultados (constando prioridade e pontuação), bem como a versão ticketsOrdenados.txt, o executável desafioNA.jar (gerado pela IDE), a documentação (gerada pela IDE, que se encontra na pasta dist), o arquivo .txt do dicionário utilizado, o arquivo tickets.json original e o arquivo convertido e modificado para tickets.txt, assim como todos os arquivos e pastas gerados pela IDE. 

O projeto foi realizado na IDE NetBeans 8.2, em linguagem de programação orientada a objetos Java, em ambiente Windows 10; a conversão do arquivo tickets.json para tickets.txt foi realizada por meio da ferramenta gratuita online disponível em: https://onlinejsontools.com/convert-json-to-text. 

A ordenação por data de criação é dada da criação mais antiga para a mais recente (visto que não foi especificada uma ordem crescente ou decrescente); A ordenação por data de atualização é dada da atualização mais recente para a mais antiga (novamente, não foi especificada uma ordem crescente ou decrescente); A ordenação por prioridade é dada da mais alta para a normal (reitero que não foi especificada ordem crescente ou decrescente). 

O filtro de intervalo por data de criação considera um intervalo a partir de um ano x até um ano y e exibe os tickets criados dentro deste período (não foi especificado se seria um período completo x (dd/mm/aaaa), se seria um período parcial y (mm/aaaa) ou um período z (aaaa), então optei por um período de intervalo determinado por [z1(aaaa), z2(aaaa)]). O filtro de prioridade foi dividido em dois: um onde aparecem apenas os tickets de prioridade alta e outro onde aparecem apenas os tickets de prioridade normal, já que não foi especificado se com "prioridade" referia-se apenas aos tickets de prioridade alta ou aos normais.

A paginação foi denotada com os sinais de maior (>) e menor (<) para indicar a página mais a direita e a página mais à esquerda da atual, respectivamente, exibindo um ticket por página (não foi especificada uma quantidade).

O botão "limpar pesquisa atual" deve ser acionado para realizar uma nova pesquisa (uma nova ordenação, um novo filtro, etc), pois ele reinicializa as variáveis, desta forma exibindo resultados consistentes.

Obrigada. 

Atenciosamente, 
Pâmela de Souza Silveira.
