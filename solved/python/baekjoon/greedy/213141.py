import sys

input = sys.stdin.readline().rstrip()
m_count = 0
max_answer = ''
min_answer = ''

for i in input:
    if i == 'M':
        m_count += 1
    else:
        max_answer += str(5 * (10 ** m_count))
        min_answer += '5' if m_count == 0 else str(5 + (10 ** m_count))
        m_count = 0

if m_count > 0:
    max_answer += '1' * m_count
    min_answer += str(1 * (10 ** (m_count - 1)))

print(max_answer)
print(min_answer)
