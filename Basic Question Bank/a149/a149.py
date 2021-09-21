cases = int(input())
for i in range(cases):
    string = str(input())
    output = ord(string[0]) - ord('0')
    for j in range(1, len(string)):
        output = output * (ord(string[j]) - ord('0'))
    print(output)