coef_list = [eval(x) for x in input().split(' ')]
a = coef_list[0]; b = coef_list[1]; c = coef_list[2]
if b ** 2 - 4 * a * c < 0 :
    print("No real root")
elif b ** 2 - 4 * a * c == 0:
    print("Two same roots x=" + str(int((-b) / (2 * a))))
else:
    print("Two different roots x1=" + str(int(((-b) + ((b ** 2 - 4 * a * c) ** 0.5)) / (2 * a))) + " , x2=" + str(int(((-b) - ((b ** 2 - 4 * a * c) ** 0.5)) / (2 * a))))