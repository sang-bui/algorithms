


def binarySearch(startIndex, endIndex, searchValue, array):

    mid = (startIndex + endIndex) // 2
    if array[mid] == searchValue:
        return mid
    elif array[mid] > searchValue:
        return binarySearch(startIndex, mid - 1, searchValue, array) 
    else: 
        return binarySearch(mid + 1, endIndex, searchValue, array) 






searchArr = [2, 5, 7, 8, 9, 12, 15, 19, 21, 33]
print(binarySearch(0, len(searchArr) - 1, 15, searchArr)) 