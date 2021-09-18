try:
    while True:
        num = int(input())
        print(int((num ** 3 + num * 5) / 6 + 1))
except EOFError:
    pass