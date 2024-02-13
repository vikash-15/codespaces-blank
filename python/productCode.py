def generate_code(product_deatils):
    # strarr=product_deatils.split(":")
    name,desination,month,year=product_deatils.split(":")
    if len(name)<=3 or len(desination)<=3 or len(year)!=4 or int(month)>12 or int(month)<1:
        return "Invalid input"
    else:
        if len(name)%2==0:
            name_code=name[-3:].upper()
        else:
            name_code=name[:3].upper()
        
        des_code=desination[:1].upper()+desination[-1].upper()

        month_year_code=month+year[-2:]

        return name_code+"/"+des_code+"/"+month_year_code
    
print(generate_code("John:Analyst:12:2021"))
print(generate_code("Sanitizer:Flotrida:9:2019"))
