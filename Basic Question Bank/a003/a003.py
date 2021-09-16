num_list =  [eval(x) for x in input().split(' ')]
target = (num_list[0] * 2 + num_list[1]) % 3
if target == 0:
    print("普通")
elif target == 1:
    print("吉")
else:
    print("大吉")