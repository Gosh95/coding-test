import sys

input = sys.stdin.readline
n = int(input())
cranes = sorted(list(map(int, input().split())), reverse=True)
m = int(input())
boxes = sorted(list(map(int, input().split())), reverse=True)
answer = 0

if cranes[0] < boxes[0]:
    answer = -1
else:
    while boxes:
        box_idx = 0
        crane_idx = 0

        while crane_idx < n:
            if box_idx == len(boxes):
                break
            elif cranes[crane_idx] >= boxes[box_idx]:
                boxes.pop(box_idx)
                crane_idx += 1
            else:
                box_idx += 1

        answer += 1

print(answer)
