package array;

public class ArrayList {

    public static final int INITIAL_SIZE = 10;
    private int[] itemsArray;
    private int lastItemIndex;

    public ArrayList() {
        this.itemsArray = new int[INITIAL_SIZE];
        this.lastItemIndex = -1;
    }

    public int add(int value) {
        if (itemsArray.length == lastItemIndex + 1) {
            increaseItemsArray();
        }
        itemsArray[lastItemIndex + 1] = value;
        this.lastItemIndex++;
        return value;
    }

    public int get(int index) {
        if (index > lastItemIndex) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return itemsArray[index];
    }

    private void increaseItemsArray() {
        int[] newItemsArrays = new int[itemsArray.length * 2];
        for (int i = 0; i < itemsArray.length; i++) {
            newItemsArrays[i] = itemsArray[i];
        }
        itemsArray = newItemsArrays;
    }

    public int set(int index, int value) {
        if (index > lastItemIndex) {
            throw new IllegalArgumentException("Index out of bound");
        }
        itemsArray[index] = value;
        return index;
    }

    public int remove(int value) {
        int indexOfValue = this.indexOf(value);
        if (indexOfValue == -1) {
            return -1;
        }

        for (int i = indexOfValue; i < lastItemIndex; i++) {
            itemsArray[i] = itemsArray[i + 1];
        }
        lastItemIndex--;
        return indexOfValue;
    }

    public int indexOf(int value) {
        for (int i = 0; i <= lastItemIndex; i++) {
            if (itemsArray[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return this.lastItemIndex + 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0; i < lastItemIndex; i++) {
            stringBuilder.append(itemsArray[i]);
            stringBuilder.append(",");
        }
        stringBuilder.append(itemsArray[lastItemIndex]);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
