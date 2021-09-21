try:
    while True:
        string = str(input())
        string = string.lower()
        counter = [0] * 26
        for i in range(len(string)):
            if 'a' <= string[i] and string[i] <= 'z':
                counter[ord(string[i]) - ord('a')] += 1
        oddCounter = 0
        for count in counter:
            if count % 2 == 1:
                oddCounter += 1
        print("no...") if oddCounter > 1 else print("yes !")
except EOFError:
    pass