# Longest Word
# 
# Have the function LongestWord(sen) take the sen parameter being passed
# and return the largest word in the string. If there are two or more words that
# are the same length, return the first word from the string with that length.
# Ignore punctuation and assume sen will not be empty.
# 
# Examples
# Input: "fun&!! time"
# Output: time
# 
# Input: "I love dogs"
# Output: love
# 
import re
def LongestWord(sen):
  # Search only characters
  allWord = ""
  allWord = " ".join(re.split("[^a-zA-Z]", sen))
  # Find longest word and return
  maxLength = 0
  for x in allWord.split():
    if(len(x) > maxLength):
      sen = str(x).strip()
      maxLength = len(x)
  return sen

# Example Test
A = "I love dogs"
print("Input: \n I love dogs")
print("Output: \n",LongestWord(A))
A = "fun&!!!lil time"
print("Input: \n fun&!!!lil time")
print("Output: \n",LongestWord(A))