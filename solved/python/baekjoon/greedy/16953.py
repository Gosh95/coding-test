from collections import deque

a, b = map(int, input().split())
answer = -1


def bfs():
    global answer

    q = deque()
    q.append((a, 1))

    while q:
        value, count = q.popleft()

        if value == b:
            answer = count
            break

        if value * 2 <= b:
            q.append((value * 2, count + 1))

        if int(str(value) + '1') <= b:
            q.append((int(str(value) + '1'), count + 1))


bfs()

print(answer)
