string = str(input())
arr = ["BNZ", "AMW", "KLY", "JVX", "HU", "GT", "FS", "ER", "DOQ", "CIP"]
sum = 0
for i in range(0, len(string) - 1):
    sum += (ord(string[i]) - ord('0')) * (8 - i)
sum += ord(string[len(string) - 1]) - ord('0')
if (10 - (sum % 10) % 10) == 10:
    print("BNZ")
else:
    print(arr[(10 - (sum % 10) % 10)])