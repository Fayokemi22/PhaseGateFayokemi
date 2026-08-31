def greatest_common_factor(first_number, second_number):
    greatest_number = 0
    for count in range(1, first_number, second_number):
        if first_number % count == 0 and second_number % count == 0:
            greatest_number = count
            return greatest_number


first_number = int(input("Enter First Number "))
second_number = int(input("Enter Second Number "))

print(greatest_common_factor(first_number, second_number))
