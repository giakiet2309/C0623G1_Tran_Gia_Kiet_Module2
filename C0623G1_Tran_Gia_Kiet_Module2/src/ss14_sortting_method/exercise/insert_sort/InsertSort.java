package ss14_sortting_method.exercise.insert_sort;


public class InsertSort {
    public static int[] InsertSort(int[] sortList) {
        int insertItem = 0;
        for (int i = 1; i < sortList.length; i++) {
            insertItem = sortList[i];
            for (int j = i - 1; j >= 0; j--) {
                if (insertItem >= sortList[j]) {
                    sortList[j + 1] = insertItem;
                    break;
                } else {
                    sortList[j + 1] = sortList[j];
                    sortList[j] = insertItem;
                }
            }
        }
        return sortList;
    }
}

