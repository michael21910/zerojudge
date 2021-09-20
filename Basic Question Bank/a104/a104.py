try:
    while True:
        foo = input()
        arr = input().split()
        for i in range(len(arr)):
            arr[i] = int(arr[i])
        arr.sort()
        for x in arr:
            print(x, end=" ")
        print()      
except:
    pass