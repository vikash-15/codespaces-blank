def generate_sectret_key(name):
    if len(name) < 2 or len(name) > 10:
        return "Invalid Input"
    else:
        name = name.lower()
        sum=0;
        for char in name:
            sum += ord(char)
        avg=int(sum/len(name))
        return chr(avg)
print(generate_sectret_key("A"))