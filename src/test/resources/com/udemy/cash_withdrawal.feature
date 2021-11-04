Feature: Cash withdrawal with cash machine.

  Scenario: Try bigger cash withdrawal then balance.
    Given Account with balance 200zl
    When User try cash withdrawal 300zl
    Then Balance is not change and equals 300zl