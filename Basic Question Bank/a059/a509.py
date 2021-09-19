import math

cases = int(input())
for i in range(cases):
    min = int(input())
    max = int(input())
    sum = 0
    for j in range(min, max + 1):
        if (int(math.sqrt(j))) == (math.sqrt(j)):
            sum += j
    print("Case " + str(i + 1) + ": " + str(sum))