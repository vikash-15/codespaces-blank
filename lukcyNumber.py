def find_lucky_number(dob):
    if len(dob) != 10 or dob[2] != '/' or dob[5] != '/':
        return "Invalid format"
    
    dobArr=dob.split("/")
    day=dobArr[0]
    month=dobArr[1]
    year=dobArr[2]

    if not (day.isdigit() and month.isdigit() and year.isdigit()):
        return "Invalid format"
    
    if not (1 <= int(day) <= 31 and 1 <= int(month) <= 12):
        return "Invalid format"
    
    total = int(day) + int(month) + int(year)
    luckynumber=0
    for digit in str(total):
        luckynumber+=int(digit)
    
    return luckynumber

print(find_lucky_number("28/08/1999"))




    
    

