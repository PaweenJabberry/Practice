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
print(LongestWord(A))
A = "fun&!!!lil time"
print(LongestWord(A))