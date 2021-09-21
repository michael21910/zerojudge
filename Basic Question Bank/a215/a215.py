import math

try:
    while True:
        num, sum = map(int, input().split())
        if sum < 0:
            print(1)
            continue
        temp = ( math.sqrt( 1 + 4 * (num * num - num + 2 * sum) ) -1 ) / 2
        output = int(temp) - num + 2
        print(output)
except EOFError:
    pass