# The program is to find out if a sentence is a palindrome or not ignoring punctuation and whitespaces 
def palindrome(s):
    string = ""
    for char in s:
        if char.isalnum():
            string += char
            

    return string==string[::-1]

print(palindrome("A man, a plan, a      canal: Panama"))  # Outputs: False
print(palindrome("Not a palindrome"))  # Outputs: False
print(palindrome("madam ii     madam"))
