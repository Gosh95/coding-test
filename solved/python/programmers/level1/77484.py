def solution(lottos, win_nums):
    answer = []
    ranking = [6, 6, 5, 4, 3, 2, 1]
    score, zero_count = 0, lottos.count(0)

    for i in range(len(lottos)):
        if lottos[i] in win_nums:
            score += 1

    answer.append(ranking[score + zero_count])
    answer.append(ranking[score])

    return answer
