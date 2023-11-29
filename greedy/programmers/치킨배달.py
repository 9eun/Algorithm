from itertools import permutations

def solution(n, weak, dist):
    length = len(weak)
    for i in range(length):
        weak.append(weak[i]+n)
    answer = len(dist)+1
    
    for s in range(length):
        for friends in list(permutations(dist,len(dist))):
            count =1
            p = weak[s] + friends[count-1]
            for index in range(s,s+length):
                if p<weak[index]:
                    count+=1
                    if count > len(dist):
                        break
                    p = weak[index] + friends[count-1]
            answer = min(answer, count)
    if answer > len(dist):
        return -1            
    return answer
