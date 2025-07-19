import matplotlib.pyplot as plt
import mendeleev
from mendeleev import element

at_vl = []

for atomic_number in range(1, 119):
    elem = element(atomic_number)
    at_vl.append(elem.atomic_volume)

at_no = list(range(1, 119))

plt.xlabel("Atomic Number")
plt.ylabel("Atomic Volume (cm³/mol)")
plt.plot(at_no, at_vl)
plt.show()
