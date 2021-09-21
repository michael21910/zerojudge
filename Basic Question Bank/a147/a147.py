try:
    while True:
        num = int(input())
        for i in range(1, num, 1):
            if i % 7 == 0:
                continue
            else:
                print(i, end=" ")
        print()
except EOFError:
    pass