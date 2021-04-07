# language: es
Característica: PetBook Search
  Como usuario web
  Quiero usar PetBook
  Para encontrar perros o gatos

  Escenario: Buscar Perros
    Cuando El usuario da click en el boton perro en Petbook Search
    Entonces debe ver como resultados Imagenes de perros
  Escenario: Buscar Gatos
    Cuando El usuario da click en el boton gato en Petbook Search
    Entonces debe ver como resultados Imagenes de gatos
  Escenario: Buscar Todos los animales
    Cuando El usuario da click en el boton all en Petbook Search
    Entonces debe ver como resultados Imagenes de Todas las mascotas
