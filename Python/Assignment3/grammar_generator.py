class GrammarGenerator:
    @staticmethod
    def get_file_name():
        # print("What is the file name?")
        # file_name = input()
        file_name = "simple.txt"
        g.read_file(file_name)

    # @staticmethod
    # def read_file(file_name):
    #     d1 = {}
    #     with open(file_name) as file:
    #         for line in file:
    #             (key, val) = line.split('::=')
    #             d1[str(key)] = val.strip()
    #     g.get_user_input(d1)

    @staticmethod
    def read_file(file_name):
        d1 = {}
        count = 0
        with open(file_name) as file:
            for line in file:
                (key, val) = line.split('::=')
                d1[str(key)] = {}
                strippedVal = val.strip()
                for stripped in strippedVal.split('|'):
                    # Generate new dictionary per split
                    # d1[str(key)][str(key)] = stripped
                    d1[str(key)][stripped] = stripped
                    # count = count + 1
                    # for val in d1.values():
                    #     print(val)

        print(d1)
        for val in d1.values():
            print(val)
        # g.get_user_input(d1)

    @staticmethod
    def get_user_input(d1):
        print("Available symbols to generate are:")
        print(list(d1.keys()))
        print("What do you want to generate (Enter to quit) ?")
        # generate = input()
        print("How many do you want me to generate?")
        # num = input()


if __name__ == '__main__':
    g = GrammarGenerator
    g.get_file_name()
