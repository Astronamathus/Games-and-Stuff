import datetime
##Gets current time
GMT = datetime.datetime.now(datetime.timezone.utc).strftime("%H:%M")
GMTH = datetime.datetime.now(datetime.timezone.utc).strftime("%H")
GMTM = datetime.datetime.now(datetime.timezone.utc).strftime("%M")
GMTT = int(GMTH) * 60 + int(GMTM)
##Function for calculating local time
SYD = 150
KOL = 82.5
NYC = -60
BJ = 120
def localtime(City, City_name):
    LT = City * 4
    Time = LT + GMTT
    Hours = Time // 60
    Minutes = Time % 60

    if Hours >= 24:
        Hoursn = Hours - 24

    if Minutes < 10:
        Minutesn = str(Minutes).zfill(2)

    if Hours > 24 and Minutes < 10:
        print("New York   "+ str(Hoursn)+ ":"+ str(Minutesn)+ " AM️")

    if Hours > 24 and Minutes > 10:
        print("New York   "+ str(Hoursn)+ ":"+ str(Minutes)+ " AM")

    if Hours < 24 and Minutes < 10:
        print("New York   "+ str(Hours)+ ":"+ str(Minutesn)+ " PM")

    if Hours < 24 and Minutes > 10:
        print("New York   "+ str(Hours)+ ":"+ str(Minutes)+ " PM")
        
print("World Clock")
print("Available Cities: 1) Sydney  2) Kolkata  3) New York City    4) Beijing")
City = input("Your choice:")

if City == '1':
    City = SYD
    City_name = "Sydney"
    localtime(City, City_name)

elif City == '2':    
    City = KOL
    City_name = "Kolkata"
    localtime(City, City_name)    

elif City == '3':    
    City = NYC
    City_name = "New York City"
    localtime(City, City_name)    

elif City == '4':    
    City = BJ
    City_name = "Beijing"
    localtime(City, City_name)    
