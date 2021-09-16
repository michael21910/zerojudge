import sys
for line in sys.stdin:
    year = int(line)
    print('閏年') if year % 4 == 0 and year % 100 != 0 or year % 400 == 0 else print("平年")