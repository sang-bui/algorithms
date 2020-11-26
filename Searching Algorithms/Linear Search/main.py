


def linearSearch(searchValue, array):
    for i in range(len(array) - 1):
        if array[i] == searchValue:
            return i


 
searchArr = [2, 5, 7, 8, 9, 12, 15, 19, 21, 33]
print(linearSearch(15,searchArr)) 