cases = int(input())
for i in range(0, cases):
    num_list = [eval(x) for x in input().split(' ')]
    for num in num_list:
        print(num, end=" ")
    if(num_list[2] + num_list[1] - num_list[0] == num_list[3]):
        print(num_list[3] + num_list[1] - num_list[0])
    else:
        print(int(num_list[3] * (num_list[1] / num_list[0])))