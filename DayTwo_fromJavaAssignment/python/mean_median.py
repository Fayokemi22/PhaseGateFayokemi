LetterX = int(input("Enter First Integer : "))
LetterY= int(input("Enter Second Integer : "))
LetterZ= int(input("Enter Third Integer : "))
    
mean = (LetterX + LetterY + LetterZ) / 3

median = LetterY; 
    
if LetterX==median:
    print("The median is : " ,LetterX)
    
    
elif (LetterZ==median):
    
    print("The median is : " , LetterZ)
    
else:
        print("The median is : " ,LetterY)
    
    
print("The mean is : ",round(mean,2))   
        
