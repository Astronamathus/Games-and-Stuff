import tkinter as tk
from tkinter import messagebox
import random
from collections import Counter
import matplotlib.pyplot as plt

moves = ['rock', 'paper', 'scissors']
win_map = {'rock': 'paper', 'paper': 'scissors', 'scissors': 'rock'}
history = []
scores = {'wins': 0, 'losses': 0, 'ties': 0}

def predict_next_move():
    if len(history) < 3:
        return random.choice(moves)
    freq = Counter(history[-5:])
    predicted = freq.most_common(1)[0][0]
    return win_map[predicted]

def get_winner(player, ai):
    if player == ai:
        scores['ties'] += 1
        return "It's a tie!"
    elif win_map[player] == ai:
        scores['losses'] += 1
        return "You lose!"
    else:
        scores['wins'] += 1
        return "You win!"

def play(player_move):
    history.append(player_move)
    ai_move = predict_next_move()
    result = get_winner(player_move, ai_move)
    result_label.config(text=f"AI played: {ai_move}\n{result}")
    score_label.config(text=f"Wins: {scores['wins']} | Losses: {scores['losses']} | Ties: {scores['ties']}")

def show_stats():
    if not history:
        messagebox.showinfo("Stats", "No moves played yet!")
        return
    move_freq = Counter(history)
    plt.bar(move_freq.keys(), move_freq.values(), color='skyblue')
    plt.title("Your Move Frequencies")
    plt.xlabel("Move")
    plt.ylabel("Count")
    plt.show()

# Set up main GUI
root = tk.Tk()
root.title("AI Rock-Paper-Scissors")

title = tk.Label(root, text="Choose Your Move:", font=("Roboto", 14))
title.pack(pady=10)

button_frame = tk.Frame(root)
button_frame.pack()

for move in moves:
    b = tk.Button(button_frame, text=move.capitalize(), font=("Roboto", 12), width=10,
                  command=lambda m=move: play(m))
    b.pack(side=tk.LEFT, padx=10)

result_label = tk.Label(root, text="", font=("Roboto", 12))
result_label.pack(pady=10)

score_label = tk.Label(root, text="Wins: 0 | Losses: 0 | Ties: 0", font=("Roboto", 12))
score_label.pack()

stats_btn = tk.Button(root, text="📊 Show Stats", font=("Roboto", 12), command=show_stats)
stats_btn.pack(pady=5)

quit_btn = tk.Button(root, text="🚪 Quit", font=("Roboto", 12), command=root.destroy)
quit_btn.pack(pady=5)

root.mainloop()
