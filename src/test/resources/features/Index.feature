Feature: As a potential client i need to open a calculator and do math operations

  @Smoke @Plus
  Scenario Outline: Plus operation
    When '<numero>' '<operacion>' con '<numero2>'
    Then Result is '<resultado>'

    Examples:
      | numero | operacion | numero2 | resultado |
      | 75     | plus      | 10      | 85        |
      | 8      | minus     | 5       | 3         |
      | 3      | multiply  | 300     | 900       |
      | 8      | divide    | 2       | 4         |

