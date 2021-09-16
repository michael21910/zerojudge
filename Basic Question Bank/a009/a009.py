string = str(input())
for char in string:
    if(char == " "):
        print(" ", end="")
        continue
    print(chr(ord(char) + 2), end="")