try:
    while True:
        num = int(input())
        if num <= 10:
            print(num * 6)
        elif num <= 20:
            print(60 + (num - 10) * 2)
        elif num <= 40:
            print(80 + (num - 20))
        else:
            print("100")
except EOFError:
    pass