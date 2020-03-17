# This class is a grammar generator.
class GrammarGenerator:

    # Asks the user what file to read.
    @staticmethod
    def get_file_name():
        print("What is the file name?")
        # file_name = input()
        file_name = "simple.txt"
        # file_name = "sentence.txt"
        g.read_file(file_name)

    # Stores dictionary of non-terminals and then a dictionary of terminals
    @staticmethod
    def read_file(file_name):
        d1 = {}
        with open(file_name) as file:
            for line in file:
                (key, val) = line.split('::=')
                d1[str(key)] = {}
                stripped_val = val.strip()
                for stripped in stripped_val.split('|'):
                    d1[str(key)][stripped] = stripped
        print(d1)
        for val in d1.values():
            print(val)
        # g.get_user_input(d1)

    # Informs the user what symbols are available in the dictionary
    # and asks the user what to generate and how many.
    @staticmethod
    def get_user_input(d1):
        print("Available symbols to generate are:")
        print(list(d1.keys()))
        print("What do you want to generate (Enter to quit) ?")
        generate = input()
        print("How many do you want me to generate?")
        num = input()
        g.recursion_formula(generate, num)

    # Recursion formula to iterate through non-terminal and terminal grammar
    @staticmethod
    def recursion_formula(generate, num):
        print(generate, num)


# Calls methods in GrammarGenerator.
if __name__ == '__main__':
    g = GrammarGenerator
    g.get_file_name()
