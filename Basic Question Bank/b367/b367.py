cases = int(input())
for case in range(cases):
    row, col = map(int, input().split())
    arr = list()
    for i in range(row):
        arr += input().split()
    print( ["keep defending", "go forward"][arr == arr[::-1]] )