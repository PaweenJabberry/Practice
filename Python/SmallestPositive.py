# Write a function:
#     def solution(Array int A)
# that, given an array A of N integers, return the smallest positive integer
# (greater than 0) that does not occur in A.
# For example, given A = [1,3,6,4,1,2], the function should return 5.
# Given A = [1,2,3], the funtion should return 4.
# Given A = [-1,-3], the funtion should return 1.
# Write an efficient algorithm for the following assumptions:
#       - N is an integer within the range [1..100,000];
#       - each element of array A is an integer within the range
#         [-1,000,000..1,000,000].
def solution(A):
    A.sort()
    result = 0
    if max(A) >= 0:
        start = min(i for i in A if i > 0)
        start = A.index(start)
        for x in A[start:]:
            if x - result > 1:
                break;
            else:
                result = x
            
    return result+1

# Example Tests
A = [1,3,6,4,1,2]
print("Input: \n [1,3,6,4,1,2]")
print("Output: \n",solution(A))
A = [-1,-3]
print("Input: \n [-1,-3]")
print("Output: \n",solution(A))
A = [1,2,3]
print("Input: \n [1,2,3]")
print("Output: \n",solution(A))