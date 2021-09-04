# Princípios de design
1. Identifique os aspectos da sua aplicação que variam e separe-os daquilo que permenece o mesmo.
    - Pegue as partes que variam e encapsule-as, de modo que no futuro você possa alterá-las ou adicionar mais partes sem alterar aquilo que não varia.
    - Uma forma de fazer isso é colocando o que varia em classes separadas.

2. Programe para uma interface, não para uma implementação.
    - Criar interfaces que representam um comportamento (ex: _FlyBehavior_). Depois, criar classes de comportamento que implementam a interface (ex: _FlyWithWings_ e _FlyNoWay_)

3. Favoreça _composição_ sobre herança.
    - _Composição_ é quando uma classe tem relação de HAS-A com outra. Ao invés de herdar o comportamento, a classe é composta pelo outro objeto (ou seja, um objeto da primeira é instanciado nessa outra classe).
    - Usar composição dá maior flexibildidade, pois permite encapsular algoritmos em suas próprias classes ao mesmo tempo que permite a mudança de comportamento em tempo de execução (desde que o objeto sendo composto implemente a interface corretamente). Exemplos disso em DuckSim.

4. Procure fazer um design desacoplado entre objetos que interagem (ou seja, com interdependência mínima entre eles).
    - Desacoplado: quando a modificação em um objeto não implica na modificação de outro. Isso geralmente tá associado com o uso de interfaces, ou seja, um objeto w só sabe que o outro (x, y, z) implementa certa interface. Isso é bom porque podem ser adicionados vários outros (a, b, c) e o objeto w não precisa se preocupar.

5. Classes devem ser abertas para extensão, porém fechadas para modificação (**open-closed principle**).
    - Abertas para extensão: liberdade para extender classes. Nunca se sabe quando os requisitos irão mudar.
    - Fechadas para modificação: gasta-se muito tempo para que o código funcione da maneira desejada, portanto não devem ser permitidas alterações nele - ele fica fechado.
    - Conclusão: classes devem poder ser extendidas facilmente e permitir a incorporação de novos comportamentos sem que código existente mude. Com isso conseguimos um design resistente a mudanças e flexível o suficiente para se adequar a novos requisitos.
    - Devemos ter cuidado onde aplicar este princípio. Usá-lo em todo lugar é desnecessário e pode levar a um código muito complexo de se entender.




# Notas sobre os Padrões
## Decorator
- Devemos escrever código nos componentes abstratos, não nos concretos. Se escrevermos nos concretos, comportamentos específicos definidos nos decorators não funcionarão.
- Decorators são geralmente criados com outros padrões, como factory e builder. Isso permite um bom encapsulamento do componente concreto e seus decorators.