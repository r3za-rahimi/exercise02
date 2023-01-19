public class GenericRepository<T extends BaseClass> {

    private BaseClass[] data =  new BaseClass[100];

    private int emptyIndex = 0;





    public void add(T element) {

        if (emptyIndex < data.length) {
            data[emptyIndex++] = element;
        }

    }

    // TODO: 1/17/23
    // afzayesh size array after array is full like arraylist
    //System.arraycopy()

    // after remove shift element

    // new method add(T[] elements){
    // new constractor(GenericRepository<T> repo){
    // add new element to old element

    // add  interface to genericRepository

    // }


    public T getById(long id) {

        for (int i = 0; i < data.length; i++) {

        }

    }

    public T get(int index) {


        if (isIndexValid(index)) {

            return null;
        }
        return (T) data[index];
    }

    private boolean isIndexValid(int index) {
        return index < 0 || index >= data.length;
    }

    public int find(T element) {

        for (int i = 0; i < data.length; i++) {

            if (data[i].equals(element)) {
                return i;
            }

        }
        return -1;
    }


    private void shiftElement() {

        //todo behineh

        T[] newData = (T[]) new Object[100];

        int objectIndex = 0;
        for (int i = 0; i < data.length; i++) {

            if (data[i] != null) {

                newData[objectIndex++] = (T) data[i];
            }
        }

        data = newData;
    }

    public void remove(int index) {
        if (isIndexValid(index)) {

            return;
        }

        data[index] = null;
        shiftElement();
    }

    public void remove(T element) {

        int i = find(element);
        if (i == -1) {

            return;
        }
        remove(i);
    }

    // TODO: 1/17/23
//    public void removeall(T element){
//
//
//
//    }


    //public void clear(){


//}
    public void update(int index, T element) {


        if (isIndexValid(index)) {

            return;
        }

        data[index] = element;
    }

    public T[] subElement(int from, int end) {

        if (from < 0 || from > end || end >= data.length) {

            return null;
        }

        T[] newElement = (T[]) new Object[end - from + 1];

        int index = 0;
        for (int i = from; i < end; i++) {

            newElement[index++] = (T) data[i];

        }

        return newElement;

    }


    public void print() {

        for (BaseClass x : data) {

            System.out.println(x);

        }

    }

}
