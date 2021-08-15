# Princípios de design
1. Identifique os aspectos da sua aplicação que variam e separe-os daquilo que permenece o mesmo.
    - Pegue as partes que variam e encapsule-as, de modo que no futuro você possa alterá-las ou adicionar mais partes sem alterar aquilo que não varia.
    - Uma forma de fazer isso é colocando o que varia em classes separadas.

2. Programe para uma interface, não para uma implementação.
    - Criar interfaces que representam um comportamento (ex: _FlyBehavior_). Depois, criar classes de comportamento que implementam a interface (ex: _FlyWithWings_ e _FlyNoWay_)

3. Favoreça _composition_ sobre herança.
    - _Composition_ é quando uma classe tem relação de HAS-A com outra. Ao invés de herdar o comportamento, a classe é composta pelo outro objeto (ou seja, eles são instanciados nessa outra classe).
    - Usar composition dá maior flexibildidade, pois permite encapsular algoritmos em suas próprias classes ao mesmo tempo que permite a mudança de comportamento em tempo de execução (desde que o objeto sendo composto implemente a interface corretamente). Exemplos disso em DuckSim.