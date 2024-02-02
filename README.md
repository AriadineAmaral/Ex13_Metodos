# Ex13_Metodos
#### Exercício desenvolvido para a faculdade

## Requisitos:

### Parte I - Preenchendo os vetores

Os vetores deverão ser declarados e preenchidos no método principal (MAIN).

A) Vetor com 5 posições para armazenar o nome de 5 produtos, contendo os seguintes valores, previamente
informados:
{"Refrigerante Lata","Água sem gás","Água com gás","Suco de
Laranja","Barra de Chocolate"};

B) Vetor com 5 posições para armazenar o preço dos 5 produtos, contendo os seguintes valores previamente
informados:
{2.80, 1.90, 2.10,2.30,4.90};

C) Vetor com 5 posições para armazenar o nome de 5 serviços, contendo os seguintes valores, previamente
informados:
{"Lavanderia","Sauna","Almoço","Café da Manhã","Jantar"};

D) Vetor com 5 posições para armazenar o preço dos 5 serviços, contendo os seguintes valores previamente
informados:
{10.50,60.80,42.90,35.60,60.40};

As matrizes deverão ser declaradas como Global.
- Matriz com 5x2 para armazenar o nome do cliente e o tipo de acomodação.
- Matriz com 5x2 para armazenar o número do quarto e quantidade de diárias.

##

### Parte II - Entrada de dados

No método principal (MAIN) faça a captação dos campos:
- Nome do cliente
- Tipo de acomodação (Faça validação do campo)
- Número do quarto (Preenchimento automático do campo)
- Quantidade de diárias

##

### Parte III - Métodos

Faça um método para a entrada de dados do consumo de serviços de cada hospedagem.
O método receberá o array com o nome dos serviços como parâmetro, e deverá retornar a matriz preenchida
com as informações relativas aos consumos de serviços durante a hospedagem. O método deverá ser chamado através
do método principal (MAIN).
Crie uma matriz 5x5 do tipo int, onde:
- Nas linhas da matriz serão armazenadas 5 hospedagens.
- Em cada uma das colunas da matriz será armazenada a quantidade consumida de cada um dos 5
serviços.

Calcular o valor de cada hospedagem.
Crie um método que receba como parâmetro o tipo de hospedagem e a quantidade de diárias. O método deve
retornar o valor da estadia e deve ser chamado a partir do método gerarRelatorioGerencial.

Faça um método para a saída de dados gerarRelatorioGerencial.
Crie um método que receba a matriz com a relação do consumo de produtos, a matriz com a relação de
consumo de serviços, o vetor com o preço dos produtos e o vetor com o preço dos serviços.
- No método calcule o total de consumo de produtos, total de consumo de serviços e o total geral, referente
a cada uma das 05 hospedagens.
- O método não retorna informações e deve ser chamado a partir do método principal (MAIN).
CÁLCULO  TOTAL GERAL = VALOR ESTADIA + TOTAL SERVIÇO + TOTAL PRODUTO


