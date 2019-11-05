# Letter Capitalize
# Have the function LetterCapitalize(str) take the str parameter being
# passed and capitalize the first letter of each word. Words will be separated by
# only one space.
# 
# Examples
# Input: "hello world"
# Output: Hello World
# 
# Input: "i ran there"
# Output: I Ran There
# 
def LetterCapitalize(str):
    allWord = str.split()
    newSen = []
    for x in allWord:
        x = list(x)
        x[0] = x[0].upper()
        x = ''.join(x)
        newSen.append(x)
    return " ".join(newSen)

# Example Test
A = "hello world"
print("Input: \n hello world")
print("Output: \n",LetterCapitalize(A))
A = "i ran there"
print("Input: \n i ran there")
print("Output: \n",LetterCapitalize(A))
A = "h3llo yo people"
print("Input: \n h3llo yo people")
print("Output: \n",LetterCapitalize(A))