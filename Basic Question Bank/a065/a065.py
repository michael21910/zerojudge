try:
    while True:
        string = str(input())
        output = ""
        for i in range(1, 7):
            output = output + str(abs(ord(string[i]) - ord(string[i - 1])))
        print(output)
except EOFError:
    pass