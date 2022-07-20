def solution(people, limit):
    people.sort()
    length = len(people)
    answer = length
    left = 0
    right = length - 1

    while left < right:
        if people[left] + people[right] <= limit:
            left += 1
            answer -= 1
        right -= 1

    return answer
