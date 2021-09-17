from sys import stdin

for s in stdin:
    print(eval(s.replace('/', '//')))