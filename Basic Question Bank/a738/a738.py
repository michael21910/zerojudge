from sys import stdin
from math import gcd

x = map(int, stdin.read().split())
for a, b in zip(x, x):
    print(gcd(a, b))