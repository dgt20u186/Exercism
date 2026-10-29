"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


#TODO (student): define your EXPECTED_BAKE_TIME (required) and PREPARATION_TIME (optional) constants below.

EXPECTED_BAKE_TIME = 40
 
def bake_time_remaining(time):
    """Calculate the bake_time_remaining.
    
    Parameters:
        time (int): The actual minutes the lasagna has been in the oven.
    
    Returns:
        int: The total time elapsed (in minutes) the lasagna still needs to bake.
    
    """
    return EXPECTED_BAKE_TIME - time

def preparation_time_in_minutes(number_of_layers):
    """Returns how many minutes the lasagna still needs to bake.
    
    Parameters:
        number_of_layers (int): The number of layers you want to add to the lasagna.
    
    Returns:
        int: The total time elapsed (in minutes) you would spend making them.
    
    """
    return number_of_layers * 2

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.
    
    Parameters:
        number_of_layers (int): The number of layers in the lasagna.
        elapsed_bake_time (int): Time the lasagna has been baking in the oven.
    
    Returns:
        int: The total time elapsed (in minutes) preparing and baking.
    
    """
    return number_of_layers * 2 + elapsed_bake_time
