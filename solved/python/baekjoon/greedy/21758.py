import sys

input = sys.stdin.readline
n = int(input())
honey = list(map(int, input().split()))
answer = 0
total = sum(honey)
temp = honey[0]

for i in range(1, n):
    temp += honey[i]
    answer = max(answer, (total - honey[0] - honey[i]) + (total - temp))


temp = honey[n - 1]
for i in range(n - 2, -1, -1):
    temp += honey[i]
    answer = max(answer, (total - honey[n - 1] - honey[i]) + (total - temp))

for i in range(1, n - 1):
    answer = max(answer, total - honey[0] - honey[n - 1] + honey[i])

print(answer)
