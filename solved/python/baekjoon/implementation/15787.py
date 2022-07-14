import sys

input = sys.stdin.readline
n, m = map(int, input().split())
trains = [[0 for _ in range(20)] for _ in range(n)]

for _ in range(m):
    command = list(map(int, input().split()))

    if command[0] == 1:
        trains[command[1] - 1][command[2] - 1] = 1
    elif command[0] == 2:
        trains[command[1] - 1][command[2] - 1] = 0
    elif command[0] == 3:
        trains[command[1] - 1] = [0] + trains[command[1] - 1][:19]
    else:
        trains[command[1] - 1] = trains[command[1] - 1][1:20] + [0]

answer = 0
temp_trains = []

for train in trains:
    if train not in temp_trains:
        temp_trains.append(train)
        answer += 1

print(answer)
