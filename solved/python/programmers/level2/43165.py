def solution(numbers, target):
    answer = 0

    def dfs(result, idx):
        if idx == len(numbers):
            if result == target:
                nonlocal answer
                answer += 1
        else:
            dfs(result + numbers[idx], idx + 1)
            dfs(result - numbers[idx], idx + 1)

    dfs(0, 0)

    return answer
