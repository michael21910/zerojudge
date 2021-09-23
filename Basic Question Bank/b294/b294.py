try:
    while True:
        days = int(input())
        sum = 0
        num = [int(i) for i in input().split()]
        for i in range(days):
            sum += num[i] * (i + 1)
        print(sum)
except EOFError:
    pass