import random
print("Enter your guess below:")
flag = False
r = int(random.randint(1, 100))
while(flag == False):
    s = int(input())
    if(s < r):
        print("Too low")
    elif(s > r):
        print("Too high")
    else:
        print("Just right")
        flag = True

print("Game over")
