try:
    while True:
        crime, red_hat = input().split()
        print(int(red_hat) + 1) if int(crime) != int(red_hat) else print(int(red_hat))
except EOFError:
    pass