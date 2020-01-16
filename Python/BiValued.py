def solution(A):
    # write your code in Python 3.6
    setOfDuplicates = []
    listOfIndexDuplicates = []
    currentPosition = 0;
    for x in A:
        if A.count(x)>1:
            setOfDuplicates.append(x)
            listOfIndexDuplicates.append(currentPosition)
        currentPosition+=1
    print(setOfDuplicates)
    print(listOfIndexDuplicates)
    return (max(listOfIndexDuplicates)-min(listOfIndexDuplicates)+1)

# Example Test
A = [4, 2, 2, 4, 2]
print("Output: \n",solution(A))
A = [1, 2, 3, 2]
print("Output: \n",solution(A))
A = [0, 5, 4, 4, 5, 12]
print("Output: \n",solution(A))
A = [4, 4]
print("Output: \n",solution(A))
# print("Input: \n hello world")
# print("Output: \n",solution(A))