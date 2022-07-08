import sys

input = sys.stdin.readline
n, k = map(int, input().split())
heights = list(map(int, input().split()))

diff = [heights[i] - heights[i - 1] for i in range(1, n)]
diff.sort()
print(sum(diff[:n - k]))
