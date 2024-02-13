def replace_the_word(Sentences, word):
    strArr = Sentences.split(" ")
    for i in range(len(strArr)):
        if strArr[i].lower() == word.lower():
            strArr[i] = "*" * len(word)
    
    return " ".join(strArr)

print(replace_the_word("tHe quick brown fox jumps over the lazy dog", "the"))