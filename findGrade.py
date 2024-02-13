def find_exam_result(correct,incorrect):
    total = correct + incorrect
    if total == 0 or total!=120:
        return "Invalid number of questions"
    else:
        totalMarks = correct*2 - incorrect
        percentage = (totalMarks/240)*100
        if percentage >= 75:
            return "A grade"
        elif percentage >= 60:
            return "B"
        elif percentage >= 50:
            return "C"
        else:
            return "Soryr, you failed the exam."

print(find_exam_result(40,80))

