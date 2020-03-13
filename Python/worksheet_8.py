# Matthew Clark
# CS320 - Programming Languages
# Worksheet 8 - Python

import random


class Worksheet8:

    # Question 1
    @staticmethod
    def name():
        name = input("Enter your name: ")
        surname = input("Enter your surname: ")
        print("Hello", name, surname)

    # Question 2a
    @staticmethod
    def alphabet_a():
        prefixes = "JKLMNOPQ"
        suffix = "ack"
        for letter in prefixes:
            print(letter + suffix)

    # Question 2b
    @staticmethod
    def alphabet_b():
        s = "Part1Part 1"
        s[0] = 'B'
        print(s)

    # Question 2c
    @staticmethod
    def alphabet_c():
        s = "Part1Part 1"
        s = 'B' + s[1:]
        print(s)

    # Question 2d
    @staticmethod
    def alphabet_d():
        s = "Part 1Part 1"
        print(s[-1])

    # Question 3
    @staticmethod
    def prime():
        start = 2
        end = 20
        for val in range(start, end):
            if val > 1:
                for n in range(2, val):
                    if (val % n) == 0:
                        break
                else:
                    print(val)

    # Question 4
    @staticmethod
    def roll_six():
        count = 0;
        rand = random.randint(1, 6)
        while (rand != 6):
            rand = random.randint(1, 6)
            count = count + 1
            print("Rolled: ", rand)
        print("You got a six in", count, "turns.")

    # Question 5
    @staticmethod
    def sign(num1, num2):
        if(num1 > 0 & num2 > 0):
            return "Positive"
        if(num1 < 0 & num2 < 0):
            return "Positive"
        if(0 in [num1, num2]):
            return "Zero"
        else:
            return "Negative"

    # Question 6
    @staticmethod
    def rotate_right(num_list):
        last = num_list[len(num_list) - 1]
        temp_list = [last]
        loc = 0
        while(loc != len(num_list) - 1):
            temp = num_list[loc]
            temp_list.append(temp)
            loc = loc + 1
        print(temp_list)

    # Question 7
    @staticmethod
    def remove_even_length(str_list):
        loc = 0
        while(loc < len(str_list)):
            temp = str_list[loc]
            print(temp)
            if(len(temp) % 2 == 0):
                str_list.remove(temp)
            loc = loc + 1
        print(str_list)

    # Question 8
    @staticmethod
    def num_unique(num_list):
        my_set = {}
        loc = 1
        count = 0
        for val in num_list:
            my_set[loc] = val
            count = count + 1
            if(val in my_set):
                count = count - 1
            loc = loc + 1
        print(count)
        print(my_set)

    # Question 9
    @staticmethod
    def multiply(num_list):
        sum = 1
        for num in num_list:
            sum = num * sum
        print(sum)

    # Question 10
    @staticmethod
    def isPalindrome(str_list):
        for word in str_list:
            i = 0
            j = len(word) - 1
            if(word[i] == word[j]):
                # print(word[i], word[j])
                i = i + 1
                j = j - 1
            else:
                print("Word is not palindrome")
                break
            print("Word is palindrome")

    # Question 11
    @staticmethod
    def match_words(str_list):
        count = 0
        for word in str_list:
            last = len(word) - 1
            if(len(word) >= 2):
                if(word[0] == word[last]):
                    count = count + 1
        print(count)

    # Question 12
    @staticmethod
    def string_reverse(str):
        temp = ""
        for ch in str:
            temp = ch + temp
        print(temp)

    # Question 13
    @staticmethod
    def is_valid_parenthese(str):
        open_stack = []
        close_stack = []
        for ch in str:
            if(ch == '{' or ch == '[' or ch == '('):
                open_stack.append(ch)
            else:
                close_stack.append(ch)
        if(len(open_stack) == len(close_stack)):
            print("True")
        else:
            print("False")

    # Question 14



# Main
if __name__ == '__main__':
    exercise = Worksheet8()
    # exercise.name()
    # exercise.alphabet_a()
    # exercise.alphabet_b() # not meant to work
    # exercise.alphabet_c()
    # exercise.alphabet_d()
    # exercise.prime()
    # exercise.roll_six()
    # print(exercise.sign(-1, 1))
    # exercise.rotate_right(num_list = [1, 2, 3, 4])
    # exercise.remove_even_length(str_list = ["to", "be", "or", "not", "to", "be"])
    # exercise.num_unique(num_list = [3, 7, 3, -1, 2, 3, 7, 2, 15, 15])
    # exercise.multiply(num_list = [8, 2, 3, -1, 7])
    # exercise.isPalindrome(str_list = ["aza", "anna", "hello"])
    # exercise.match_words(str_list = ['abc', 'xyz', 'aba', '1221'])
    # exercise.string_reverse("cba4321")
    # exercise.is_valid_parenthese("(){}{{}}}")
    exercise.threeSum(int_list = [-25, -10, -7, -3, 2, 4, 8, 10])