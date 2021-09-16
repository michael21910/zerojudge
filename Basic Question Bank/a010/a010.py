import math

def calculate_count_based_on_base(number, base):
    counter = 0
    while(number % base == 0):
        counter += 1
        number //= base
    return number, counter

number = eval(input())
info = []

# check 2 first
number, c = calculate_count_based_on_base(number, 2)
if c:
    info.append((2, c))
# then check the rest
upper_bound = int(math.sqrt(number)) + 1
for i in range(3, upper_bound, 2):
    if(i > number):
        break
    number, c = calculate_count_based_on_base(number, i)
    if c:
        info.append((i, c))
if number > 1:
    info.append((number, 1))

printed_first_element = False
for pair in info:
    if pair[1] > 1:
        if ~printed_first_element:
            print(str(pair[0]) + "^" + str(pair[1]), end="")
            printed_first_element = ~printed_first_element
        else:
            print(" * " + str(pair[0]) + "^" + str(pair[1]), end="")
    else:
        if ~printed_first_element:
            print(str(pair[0]), end="")
            printed_first_element = ~printed_first_element
        else:
            print(" * " + str(pair[0]), end="")