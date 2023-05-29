#Author Yohel
  #language: en

  #historia de usuario
  Feature: Generar una simulacion de consulta de id de profesor
    Como usuario necesito buscar en el sitio web de la udea el id de un profesor
    para obtener la información de grupos asignados a el

  #hay escenarios multiples y singulares (se ejecuta solo un escenario)
  # se puede enviar diferentes filas de parametros para ejecutar la prueba
  #Scenario Outline: envia multiples combinaiciones de parametros

  Scenario: Buscar la pagina de la udea y buscar por profesor
    Given que me encuentro en la pagina principal de la udea
    When busco el id de un profesor
    Then puedo ver la informacion de los grupos asignados a el



