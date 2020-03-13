class GrammarGenerator:
    @staticmethod
    def get_file_name():
        print("What is the file name?")
        file_name = input()
        # file_name = "simple.txt"
        # file_name = "sentence.txt"
        g.read_file(file_name)

    @staticmethod
    def read_file(file_name):
        d1 = {}
        with open(file_name) as file:
            for line in file:
                (key, val) = line.split('::=')
                d1[str(key)] = {}
                strippedval = val.strip()
                for stripped in strippedval.split('|'):
                    d1[str(key)][stripped] = stripped
        print(d1)
        for val in d1.values():
            print(val)
        g.get_user_input(d1)

    @staticmethod
    def get_user_input(d1):
        print("Available symbols to generate are:")
        print(list(d1.keys()))
        print("What do you want to generate (Enter to quit) ?")
        generate = input()
        print("How many do you want me to generate?")
        num = input()
        g.recursion_formula(generate, num)

    @staticmethod
    def recursion_formula(generate, num):
        print(generate, num)


if __name__ == '__main__':
    g = GrammarGenerator
    g.get_file_name()
