def convert(number):
    result = ""
    sounds = ["Pling", "Plang", "Plong"]
    for i in range(len(sounds)):
        if number % (2 * i + 3) == 0:
            result += sounds[i]
    if result == "":
        result += str(number)
    return result