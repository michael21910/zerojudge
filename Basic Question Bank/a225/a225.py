try:
    while True:
        n = int(input())
        n = [int(i) for i in input().strip().split(' ')]
        n.sort(reverse = True)
        n.sort(key = lambda x: x%10)
        print(' '.join([str(i) for i in n]))
except EOFError:
    pass