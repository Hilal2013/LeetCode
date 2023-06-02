package easy.hilal;

import java.util.*;
import java.util.stream.Collectors;

public class ReviewIteratorComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
//Collections.sort(students);//compile time eror
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        // List<Integer> list1=Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7);
        Integer[] arr = {7, 8, 1, 2, 3, 4, 6};
        // List<Integer> list2=Arrays.asList(arr);
        // ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(arr));
        Collections.addAll(list, arr);
        System.out.println(list);//[1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 7, 8, 1, 2, 3, 4, 6]
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
        List<String> listS = new ArrayList<>(Arrays.asList("Hilal", "Zeyna"));
        String[] arrayS = listS.toArray(new String[0]);
        System.out.println(Arrays.toString(arrayS));
        int frequency = Collections.frequency(list, 7);
        System.out.println(frequency);
        Collections.sort(list, ((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0));//descending order
        // Collections.sort(list,((o1, o2) -> o2-o1));//descending order return -1 desc
        //  Collections.sort(list,((o1, o2) -> o1-o2));//asc return 1 asc
        System.out.println(list);
        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());

        //convert an ArrayList to Array using streams
        int[] arr2 = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr2));

        List<Integer> listNew = list.stream().sorted().collect(Collectors.toList());
        System.out.println(listNew);
        System.out.println("Printing with iterator..............");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {//i cannot jump into specific element
            System.out.println(iter.next());

        }
        System.out.println("Printing Backwards with iterator..............");

        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());

        }
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));
//remove Ahmed ignorecasesensitvity
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String each = it.next();
            if (each.equalsIgnoreCase("Ahmed")) {
                it.remove();
            }
        }
        System.out.println(names);//[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        names.removeIf( p -> p.equalsIgnoreCase("daniel"));
        System.out.println(names);//[John, Ercon, Mustafa, Mohammed, Yuliia, Chris]

     // default boolean removeIf(Predicate<? super E> filter) {
        //        Objects.requireNonNull(filter);
        //        boolean removed = false;
        //        final Iterator<E> each = iterator();
        //        while (each.hasNext()) {
        //            if (filter.test(each.next())) {
        //                each.remove();
        //                removed = true;
        //            }
        //        }
        //        return removed;
        //    }


    }
}
