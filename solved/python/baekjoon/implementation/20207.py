import sys

input = sys.stdin.readline
n = int(input())
length = 367
calendar = [0] * length

for i in range(n):
    start, end = map(int, input().split())

    for j in range(start, end + 1):
        calendar[j] += 1

width, height, answer = 0, 0, 0

for i in range(1, length):
    if calendar[i] != 0:
        width += 1
        height = max(height, calendar[i])
    else:
        answer += width * height
        width, height = 0, 0

print(answer)
