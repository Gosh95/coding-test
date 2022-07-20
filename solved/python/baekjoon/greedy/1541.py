formula = list(input().split('-'))
arr = []

for f in formula:
    if f.__contains__('+'):
        temp = list(map(int, f.split('+')))
        arr.append(sum(temp))
        continue

    arr.append(int(f))

answer = arr[0]

for i in range(1, len(arr)):
    answer -= arr[i]

print(answer)
