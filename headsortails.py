import matplotlib.pyplot as plt
import numpy as np
import random

labels = ["Heads", "Tails"]
output = [0,0]

for i in range(10000):
    if(random.randint(0, 1) == 0):
        output[0] += 1 
    else:
        output[1] += 1
    
print(f"Tails: {output[0]}")
print(f"Heads: {output[1]}")
plt.xlabel("Heads/Tails")
plt.ylabel("Frequency")
plt.bar(labels, output, color='skyblue')
plt.show()
