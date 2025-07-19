import matplotlib.pyplot as plt
import math
n = 100
c = []
for r in range(0, 101):
    c.append((math.factorial(n))/((math.factorial(r))*(math.factorial(n-r))))
    print(c)

l = list(range(0, 101))

plt.xlabel("r")
plt.ylabel("Combination")
plt.plot(l, c)
plt.show()
