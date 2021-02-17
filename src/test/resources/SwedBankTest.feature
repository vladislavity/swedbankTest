Feature: Swedbank loan calculator test

  Scenario:

    Given Open browser with Swedbank loan calculator
    When I am applying for a loan with a co-applicant -> NO
    When I have children (dependants) in family -> YES
    When Dependants in family -> 2 or more
    When Total monthly income -> 1000 EUR
    When I have existing loan obligations (incl. in Swedbank) -> NO
    When Choose loan amount -> 45000 eur
    When Choose loan term -> 11 years
    Then Find out monthly payment
    Then Find out loan amount