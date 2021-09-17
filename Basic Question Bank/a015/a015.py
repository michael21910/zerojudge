from sys import stdin

for s in stdin:
    row, col = map(int, s.split())
    matrix = []
    for i in range(row):
        matrix.append(stdin.readline().strip().split())
    for i in range(col):
        for j in range(row):
            print(matrix[j][i], end=" ")
        print()