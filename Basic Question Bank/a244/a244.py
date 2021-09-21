cases = int(input())
for i in range(cases):
    command, num1, num2 = map(int, input().split())
    if command == 1:
        print(num1 + num2)
    elif command == 2:
        print(num1 - num2)
    elif command == 3:
        print(num1 * num2)
    else:
        print(num1 // num2)