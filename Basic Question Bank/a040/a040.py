ans = [k for k in map(str, range(*map(int, input().split()))) if int(k) == sum(map(lambda x:int(x)**len(k), k))]
print(*ans, 'none'*(not ans))