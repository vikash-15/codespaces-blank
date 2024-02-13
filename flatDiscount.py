def calculate_discount(s):
    strArr=s.split(":")
    houseNo=strArr[0]
    type=strArr[1]
    digitSum=0

    # for i in range(0,len(houseNo)):
    #     digitSum+=int(houseNo[i])

    for digit in houseNo:
        digitSum+=int(digit)

    if type.lower()=="2bhk":
        if digitSum %2==0:
            return discountedAmt(3700000,5)
        else:
           return  discountedAmt(3900000,4)

    if type.lower()=="3bhk":
        if digitSum%2==0:
            return discountedAmt(4900000,7)
        else:
            return discountedAmt(5100000,8)

def discountedAmt(amount,n):
    return f"{(n)/100*amount:.2f}"

print(calculate_discount("123:2bhk"))




