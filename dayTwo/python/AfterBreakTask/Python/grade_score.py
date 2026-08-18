def grade(average):
    if 90<=average <=100:
        return "A"
    elif 80<=average <=90:
        return "B"
    elif 70<=average <=80:
        return "C"
    elif 60<=average <=70:
        return "D"
    else:
        return "F"


def main():
    score_one = float(input("First Score: "))
    score_two = float(input("Second Score: "))
    score_three = float(input("Third Score: "))

    average = (score_one + score_two + score_three) / 3

    print(grade(average))
    print("The Average is",average)
    
main()
