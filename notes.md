# Princípios de design
1. Identifique os aspectos da sua aplicação que variam e separe-os daquilo que permenece o mesmo.
    - Pegue as partes que variam e encapsule-as, de modo que no futuro você possa alterá-las ou adicionar mais partes sem alterar aquilo que não varia.
    - Uma forma de fazer isso é colocando o que varia em classes separadas.

2. Programe para uma interface, não para uma implementação.
    - Criar interfaces que representam um comportamento (ex: _FlyBehavior_). Depois, criar classes de comportamento que implementam a interface (ex: _FlyWithWings_ e _FlyNoWay_)