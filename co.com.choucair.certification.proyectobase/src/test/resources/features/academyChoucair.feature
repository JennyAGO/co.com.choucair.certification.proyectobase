
@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the choucair Academy with the automation course

  @scenario1
  Scenario: Search for a automation course
    Given than Jennifer want to learn automation at the Academy choucair
    | strUser   | strPassword |
    | TuUsuario | TuClave     |
    When She search for the course on the Choucair Academy platform
    | strCourse               |
    | Metodología Bancolombia |
    Then she finds the course called
    | strCourse               |
    | Metodología Bancolombia |