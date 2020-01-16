def solution(S):
    # write your code in Python 3.6
    splitCount = 1
    curentPosition = 0
    checkDuplicates = 1

    print(S)

    while (checkDuplicates == 1):
        checkDuplicates = 0
        curentPosition = 1;
        for x in S:
            if S.count(x)>1:
                S = S[curentPosition:]
                print(S)
                splitCount+=1
                checkDuplicates = 1
                break;
            curentPosition+=1

    # print(listTargetSplit)
    return splitCount

# Example Test
# A = "world"
# print("Output: \n",solution(A))
# A = "dddd"
# print("Output: \n",solution(A))
A = "cycle"
print("Output: \n",solution(A))
# A = "abba"
# print("Output: \n",solution(A))
# A = "abacdce"
# print("Output: \n",solution(A))