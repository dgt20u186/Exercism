def is_armstrong_number(number):
    nums = []
    sum_power_num = 0
    if number in range(10):
        return True
    else:
        digits = [int(digit) for digit in str(number)]
        return sum(digit ** len(digits) for digit in digits) == number           