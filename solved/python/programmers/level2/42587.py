from collections import deque


def solution(priorities, location):
    answer = 0
    queue = deque([[priorities[i], i] for i in range(len(priorities))])
    priorities.sort(reverse=True)

    while queue:
        answer += 1
        max_priority = priorities[0]

        while max_priority != queue[0][0]:
            queue.append(queue.popleft())

        priority, idx = queue.popleft()
        priorities.pop(0)

        if idx == location:
            break

    return answer
