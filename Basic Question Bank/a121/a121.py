def isPrime(n):
    if(n == 1): return 0
    if(n in [2, 3, 5]): return 1
    if(n % 2 == 0): return 0
    u, t = n - 1, 0
    while(u % 2 == 0):
        u >>= 1; t += 1
    sprp = [2, 7, 61]
    for sk in sprp:
        a = sk % n
        if(a == 0 or a == 1 or a == n - 1):
            continue
        x = pow(a, u, n)
        if(x == 1 or x == n - 1):
            continue
        for i in range(t - 1):
            x = pow(x, 2, n)
            if(x == 1):
                return 0
            if(x == n - 1):
                break
        if(x != n - 1):
            return 0
    return 1
from sys import stdin
for s in stdin:
    a, b = map(int, s.split())
    r = sum([isPrime(z) for z in range(a, b + 1)])
    print(r)