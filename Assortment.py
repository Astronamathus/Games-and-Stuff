import matplotlib.pyplot as plt
import numpy as np
import random

A = 0
B = 0
C = 0
D = 0
E = 0
F = 0
G = 0
H = 0
I = 0
J = 0
K = 0

labels = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"]
n = int(input("Number of times to run simulation: "))

for i in range(n):
    if(random.randint(0, 10) == 0):
        A += 1 
    elif(random.randint(0, 10) == 1):
        B += 1
    elif(random.randint(0, 10) == 2):
        C += 1
    elif(random.randint(0, 10) == 3):
        D += 1
    elif(random.randint(0, 10) == 4):
        E += 1
    elif(random.randint(0, 10) == 5):
        F += 1
    elif(random.randint(0, 10) == 6):
        G += 1
    elif(random.randint(0, 10) == 7):
        H += 1
    elif(random.randint(0, 10) == 8):
        I += 1
    elif(random.randint(0, 10) == 9):
        J += 1
    elif(random.randint(0, 10) == 10):
        K += 1


output = [A, B, C, D, E, F, G, H, I, J, K]

print(f"A: {output[0]}")
print(f"B: {output[1]}")
print(f"C: {output[2]}")
print(f"D: {output[3]}")
print(f"E: {output[4]}")
print(f"F: {output[5]}")
print(f"G: {output[6]}")
print(f"H: {output[7]}")
print(f"I: {output[8]}")
print(f"J: {output[9]}")
print(f"K: {output[10]}")
print(f"A%: {(output[0])/n:.2%}")
print(f"B%: {(output[1])/n:.2%}")
print(f"C%: {(output[2])/n:.2%}")
print(f"D%: {(output[3])/n:.2%}")
print(f"E%: {(output[4])/n:.2%}")
print(f"F%: {(output[5])/n:.2%}")
print(f"G%: {(output[6])/n:.2%}")
print(f"H%: {(output[7])/n:.2%}")
print(f"I%: {(output[8])/n:.2%}")
print(f"J%: {(output[9])/n:.2%}")
print(f"K%: {(output[10])/n:.2%}")
plt.xlabel("Variable")
plt.ylabel("Frequency")
plt.bar(labels, output, color='blue')
plt.show()
