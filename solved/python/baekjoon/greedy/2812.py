import sys

input = sys.stdin.readline
n, k = map(int, input().split())
nums = list(input())

count = k
stack = []

for i in range(n):
    while count > 0 and stack and stack[-1] < nums[i]:
        stack.pop()
        count -= 1
    stack.append(nums[i])

print(''.join(stack[:n - k]))
