Feature: The step hierarchy with a failed step in a report
  """
  The scenarios describe the behaviour for Serenity <= 4.2.34
  """

  Scenario: When failing from a Task class the When step is a sibling to the Given step
    Given the scenario fails from Task class
    When just to see where the step is located in the report

  Scenario: When failing from Task.where the When step is a child to the Given step
    """
    Unexpected: the When step is a child to the Given step
    """
    Given the scenario fails from Task.where
    When just to see where the step is located in the report
