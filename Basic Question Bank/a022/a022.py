string = input()
print("yes") if (string.lower() == string[::-1].lower()) else print("no")