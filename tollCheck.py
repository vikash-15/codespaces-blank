def check_number(vehicle_number):

    if len(vehicle_number)!=10:
        return "Invalid vehicle number"
    else:
        last4digit=vehicle_number[len(vehicle_number)-4:]
        digitSum=0
        sum=0
        for digit in str(last4digit):
            digitSum+=int(digit)
        
        if digitSum%2==0:
            print("even")
            for i in range(0,len(last4digit),2):
                sum+=int(last4digit[i])
            return sum

        else:
            print("odd")
            for i in range(1,len(last4digit),2):
                print("even iterates at ", i)
                sum+=int(last4digit[i])
            return sum
            
print(check_number("TN43CD1112"))
        




