import matplotlib.pyplot as plt
import numpy as np
import random

H = 0
T = 0

labels = ["Heads", "Tails"]
n = int(input("Number of times to run simulation: "))

for i in range(n):
    if(random.randint(0, 1) == 0):
        H += 1 
    else:
        T += 1


output = [H,T]

print(f"Heads: {output[0]}")
print(f"Tails: {output[1]}")
print(f"Heads%: {(output[0])/n:.2%}")
print(f"Tails%: {(output[1])/n:.2%}")
plt.xlabel("Heads/Tails")
plt.ylabel("Frequency")
plt.bar(labels, output, color='blue')
plt.show()
