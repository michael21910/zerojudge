try:
    while True:
        x = int(input())
        print(x * x - x + 2)
except EOFError:
    pass