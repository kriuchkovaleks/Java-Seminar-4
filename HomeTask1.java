// 1) Реализуйте сущность “Deque” с помощью массива Integer, массив ограничен в размере size <=5 . Нужно реализовать методы

// boolean offerFirst(Integer element); //добавляет элемент element в самое начало массива. Если элемент удачно добавлен, возвращает true, иначе - false
// boolean offerLast(Integer element); //добавляет элемент element в конец массива. Если элемент удачно добавлен, возвращает true, иначе - false
// Integer peekFirst(); //возвращает без удаления элемент из начала массива. Если массив пуст, возвращает значение null
// Integer peekLast(); //возвращает без удаления последний элемент массива. Если массив пуст, возвращает значение null
// Integer pollFirst(); //возвращает с удалением элемент из начала массива. Если массив пуст, возвращает значение null
// Integer pollLast(); //возвращает с удалением последний элемент массива. Если массив пуст, возвращает значение null

public class HomeTask1 {
    public static void main(String[] args) {

        int[] array = new int[0];// { 1, 2, 3, 4, 5 };
        System.out.println("offeFirst:");
        System.out.println(offerFirst(110, array));
        System.out.println("offeLast:");
        System.out.println(offerLast(110, array));
        System.out.println("peekFirst:");
        System.out.println(peekFirst(array));
        System.out.println("peekLast:");
        System.out.println(peekLast(array));
        System.out.println("pollFirst:");
        System.out.println(pollFirst(array));
        System.out.println("pollLast:");
        System.out.println(pollLast(array));
    }

    private static boolean offerFirst(Integer element, int[] arr) { // добавляет элемент element в самое начало массива.
                                                                    // Если элемент удачно добавлен, возвращает true,
                                                                    // иначе - false

        int[] new_arr = new int[arr.length + 1];

        new_arr[0] = element;

        for (int i = 1; i < new_arr.length; i++) {
            new_arr[i] = arr[i - 1];
        }
        for (int i : new_arr) {
            System.out.println(i);
        }
        if (new_arr[0] == element) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean offerLast(Integer element, int[] arr) { // добавляет элемент element в конец массива. Если
                                                                   // элемент удачно добавлен, возвращает true, иначе -
                                                                   // false
        int[] new_arr = new int[arr.length + 1];

        new_arr[new_arr.length - 1] = element;

        for (int i = 0; i < (new_arr.length - 1); i++) {
            new_arr[i] = arr[i];
        }
        for (int i : new_arr) {
            System.out.println(i);
        }
        if (new_arr[new_arr.length - 1] == element) {
            return true;
        } else {
            return false;
        }
    }

    private static Integer peekFirst(int[] arr) { // возвращает без удаления элемент из начала массива. Если массив
                                                  // пуст, возвращает значение null
        if (arr.length == 0) {
            return null;
        } else {
            return arr[0];
        }
    }

    private static Integer peekLast(int[] arr) { // возвращает без удаления последний элемент массива. Если массив пуст,
                                                 // возвращает значение null
        if (arr.length == 0) {
            return null;
        } else {
            return arr[arr.length - 1];
        }
    }

    private static Integer pollFirst(int[] arr) { // возвращает с удалением элемент из начала массива. Если массив пуст,
                                                  // возвращает значение null
        if (arr.length == 0) {
            return null;
        } else {
            int[] new_arr = new int[arr.length - 1];
            for (int i = 0; i < new_arr.length; i++) {
                new_arr[i] = arr[i + 1];
                System.out.println(new_arr[i]);
            }
            return arr[0];
        }
    }
    private static Integer pollLast(int[] arr) { // возвращает с удалением элемент из начала массива. Если массив пуст,
                                                  // возвращает значение null
        if (arr.length == 0) {
            return null;
        } else {
            int[] new_arr = new int[arr.length - 1];
            for (int i = 0; i < new_arr.length; i++) {
                new_arr[i] = arr[i];
                System.out.println(new_arr[i]);
            }
            return arr[arr.length - 1];
        }
    }
}
