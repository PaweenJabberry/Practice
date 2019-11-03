# Letter Changes
# Have the function LetterChanges(str) take the str parameter being
# passed and modify it using the following algorithm. Replace every letter in the
# string with the letter following it in the alphabet (ie. c becomes d, z becomes
# a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally return
# this modified string.
# 
# Examples
# Input: "hello*3
# Output: Ifmmp*3
# 
# Input: "fun times!"
# Output: gvO Ujnft!
# 
def LetterChanges(str):
    alphabet = list('abcdefghijklmnopqrstuvwxyz')
    newStr = ""
    for x in str:
        if x.isalpha():
            position = alphabet.index(x.lower())
            if position+1 in [0, 4, 8, 14, 20]:
                # print("Upper")
                newStr += alphabet[position+1].upper()
            elif position+1 == 26:
                newStr += alphabet[0].upper()
            else:
                newStr += alphabet[position+1]
        else:
            newStr += x
  # code goes here
    return newStr

# Example Tests
print("Input: \n hello*3")
print("Output: \n",LetterChanges("hello*3"))
print("Input: \n fun times!")
print("Output: \n",LetterChanges("fun times!"))