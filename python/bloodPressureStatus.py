# def generate_status (BP_Level):
#         levelArr=BP_Level.split('/')
#         systolic = int(levelArr[0])
#         diastolic = int(levelArr[1])
#         if systolic < 90 and diastolic < 60:
#             return "Low BP"
#         elif 90 <= systolic <= 120 and 60 <= diastolic <= 80:
#             return "Normal"
#         elif 121 <= systolic <= 140 and 81 <= diastolic <= 90:
#             return "Pre-High BP"
#         elif 141 <= systolic <= 190 and 91 <= diastolic <= 100:
#             return "High BP"
#         elif systolic > 190 and diastolic > 100:
#             return "Hyper Tension"
#         else:
#             return "Invalid BP Level"

# print(generate_status("89/58"))
# print(generate_status("115/65"))
        

def generate_status(BP_Level):
    systolic, diastolic = map(int, BP_Level.split('/'))  # Split the input and convert to integers

    if systolic < 90 and diastolic < 60:
        return "Low BP"
    elif 90 <= systolic <= 120 and 60 <= diastolic <= 80:
        return "Normal"
    elif 121 <= systolic <= 140 and 81 <= diastolic <= 90:
        return "Pre-High BP"
    elif 141 <= systolic <= 190 and 91 <= diastolic <= 100:
        return "High BP"
    elif systolic > 190 and diastolic > 100:
        return "Hyper Tension"
    else:
        return "Invalid BP Level"
    
print(generate_status("89/58"))
print(generate_status("115/65"))
            
