def solution(phone_book):
    answer = True
    phone_number_map = {phone_number: 1 for phone_number in phone_book}

    for phone_number in phone_book:
        for i in range(1, len(phone_number)):
            if phone_number_map.get(phone_number[:i]) == 1:
                return False

    return answer
