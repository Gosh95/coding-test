def solution(s):
    stack = [s[0]]

    for i in range(1, len(s)):
        if stack:
            if stack[-1] == s[i]:
                stack.pop()
                continue

        stack.append(s[i])

    return 1 if not stack else 0
