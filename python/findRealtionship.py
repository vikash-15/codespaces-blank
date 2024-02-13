def findRealtionship(name1,name2):
    length1 = len(name1)
    length2 = len(name2)
    totalLength=length1+length2
    remainderValue = totalLength%6
    if remainderValue == 0:
        return "Soulmates"
    elif remainderValue == 1:
        return "Colleguers"
    elif remainderValue == 2:
        return "Friends"
    elif remainderValue==3:
        return "Good friends"
    elif remainderValue==4:
        return "Best friends"
    elif remainderValue==6:
        return "Close friends"
    
print(findRealtionship("Glenn","Kim"))
print(findRealtionship("Lilly","Lenny"))
    