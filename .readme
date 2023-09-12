#2.1 Intenção
Sua intenção é realizar o desacoplamento de uma abstração de sua
implementação para que os dois possam variar independentemente.

#2.2 Motivação
Quando uma abstração pode ter mais de uma implementação, o usual é
acomodá-las através do uso de herança. Uma classe abstrata define a interface
da abstração, e subclasses concretas implementam de diferentes formas. Porém,
essa abordagem nem sempre é suficiente. Herança conecta uma implementação
a sua abstração de forma permanente, o que dificulta sua modificação, extensão
e reuso da abstração e implementação de forma independente. O padrão Bridge
procura separar implementação e abstração em duas classes distintas.

#2.3 Aplicabilidade
* Se quer evitar a ligação permanente entre implementação e abstração,
principalmente nos casos em que precisa selecionar a implementação em
tempo de execução;
* Ambas abstração e implementação devem ser extensíveis por subclasses,
que é garantido pela Bridge que permite combinar e estendê-las de forma
independente;
* Trocas de implementação de uma abstração não deve ter impacto no
cliente, ou seja, seu código não deve ser recompilado;
* Se quer evitar a proliferação de classes especializadas para cada tipo de
implementação;
* Se quer compartilhar implementações entre vários objetos.

2.4 Estrutura
* Os clientes acessam o objeto através de sua abstração (Abstraction), enquanto
que a implementação (Implementor) fica oculta do cliente.

2.5 Consequências
* 1. Desacoplamento entre abstração e implementação permite eliminar a
dependência de compilação entre ambas;
* 2. Melhorias na extensibilidade em função da independência entre a
abstração e implementação;
* 3. Implementação é ocultada do cliente;
* 4. Impacto sobre a performance devido a dupla indireção

2.6 Benefícios
* Implementação pode ser selecionada em tempo de execução;
* Abstração e implementação podem ser estendidas ou compostas de forma
mais flexível.