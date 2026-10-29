def square(number):
    if (number < 1 or number > 64):
        raise ValueError("square must be between 1 and 64")
    else:    
        grains_num = 1
        for i in range(1, number):
            grains_num *= 2
        return grains_num


def total():
    return 2 ** 64 - 1
