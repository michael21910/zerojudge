dict = { "A": 10, "J": 18, "S": 26,
        "B": 11, "K": 19, "T": 27,
        "C": 12, "L": 20, "U": 28,
        "D": 13, "M": 21, "V": 29,
        "E": 14, "N": 22, "W": 32,
        "F": 15, "O": 35, "X": 30,
        "G": 16, "P": 23, "Y": 31,
        "H": 17, "Q": 24, "Z": 33,
        "I": 34, "R": 25
}

string = str(input())
target = 0
for i in range(0, 8):
    target += (8 - i) * ((ord(string[i + 1]) - ord('0')))
target = target + (ord(string[9]) - ord('0')) + (dict[string[0]] // 10) + ((dict[string[0]] % 10) * 9)

if(target % 10 == 0):
    print("real")
else:
    print("fake")