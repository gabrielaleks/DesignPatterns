_Remember, knowing concepts like abstraction, inheritance, and polymorphism do not make you a good object oriented designer. A design guru thinks about how to create flexible designs that are maintainable and that can cope with change._

_Patterns don’t give you code, they give you general solutions to design problems. You apply them to your specific application. They aren't invented, but discovered, and most part of them address issues of change in software._

# DesignPatterns
Esse repositório será utilizado para treinar design patterns. Baseado principalmente no conteúdo do livro _Head First Design Patterns: A Brain-Friendly Guide_, embora o livro _Dive Into Design Patterns_ seja utilizado para referência.

# Quais padrões são utilizados e onde
## Strategy
O padrão Strategy define uma família de algoritmos e encapsula cada um deles. Strategy permite que o algoritmo mude independetemente dos clientes que o utilizam. Ele é utilizado em:
- [DuckSim](/code/DuckSim/MiniDuckSimulator.java)

![img](/code/DuckSim/finalresult.jpg)

## Observer
O padrão Observer define uma dependência tipo um-para-muitos entre objetos de modo que quando um objeto tem o estado modificado, todos os seus dependentes são notificados e atualizados automaticamente. Ele é utilizado em:
- [WeatherStationRaw](/code/WeatherStationRaw/WeatherStation.java)

![img](/code/WeatherStationRaw/raw_finalresult.jpg)

- [WeatherStationWithJavaAPI](/code/WeatherStationWithJavaAPI/WeatherStation.java)

![img](/code/WeatherStationWithJavaAPI/api_finalresult.jpg)

## Decorator
O padrão Decorator atribui responsabilidades a um objeto dinamicamente. Decorators fornecem uma alternativa flexível à herança de classes. Utilizado em:
- [StarbuzzCoffee](/code/StarbuzzCoffe/StarbuzzCoffe.java)

![img](/code/StarbuzzCoffe/beverages.jpg)
