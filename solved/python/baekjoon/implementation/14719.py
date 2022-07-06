import sys

input = sys.stdin.readline
h, w = map(int, input().split())
blocks = list(map(int, input().split()))

left, right = 0, w - 1
max_left, max_right = blocks[left], blocks[right]
answer = 0

while left < right:
    max_left = max(max_left, blocks[left])
    max_right = max(max_right, blocks[right])

    if max_left >= max_right:
        answer += max_right - blocks[right]
        right -= 1
    else:
        answer += max_left - blocks[left]
        left += 1

print(answer)
