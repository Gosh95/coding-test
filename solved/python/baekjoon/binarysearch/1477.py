import sys

input = sys.stdin.readline
n, m, l = map(int, input().split())
arr = list(map(int, input().split()))

arr = [0] + sorted(arr) + [l]
left, right = 1, l - 1
answer = 0

while left <= right:
    count = 0
    mid = (left + right) // 2

    for i in range(1, len(arr)):
        diff = arr[i] - arr[i - 1]
        if diff > mid:
            count += (diff - 1) // mid

    if count > m:
        left = mid + 1
    else:
        answer = mid
        right = mid - 1

print(answer)
