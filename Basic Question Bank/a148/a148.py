try:
    while True:
        info = input().split()
        num = int(info[0])
        sum = 0
        for i in range(1, len(info)):
            sum += int(info[i])
        print("no") if sum > 59 * num else print("yes")
except EOFError:
    pass