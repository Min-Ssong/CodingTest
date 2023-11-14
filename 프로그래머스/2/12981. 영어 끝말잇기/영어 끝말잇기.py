def solution(n, words):
    prev = [words[0]]
    for i in range(1, len(words)):
        if words[i] in prev:
            return [i % n + 1, i // n + 1]
        elif prev[-1][-1] != words[i][0]:
            return [i % n + 1, i // n + 1]
        else:
            prev.append(words[i])
    return [0, 0]