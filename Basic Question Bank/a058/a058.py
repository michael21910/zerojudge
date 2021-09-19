cases = int(input())
arr = [0] * 3
for i in range(cases):
    arr[int(input()) % 3] += 1
print(arr[0], arr[1], arr[2])