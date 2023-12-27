def solution(N, stages):
    answer = []  
    dct={}
    l=len(stages)
    for i in range(1,N+1):
        if l!=0:
            cnt=stages.count(i)
            dct[i]=cnt/l
            l-=cnt
        else:
            dct[i]=0
    answer=sorted(dct,key=lambda x:dct[x],reverse=True)
    
    return answer