import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        //COMPLETE ME: print each name using an index based for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        //COMPLETE ME: print each name (again!) using enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }
        //COMPLETE ME: print each name (a third time!) using a while loop
        int l = 0;
        while (l < names.size()) {
            System.out.println(names.get(l));
            l++;
        }

        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // COMPLETE ME: print each Cat’s name using a
        // standard for loop
        for (int k = 0; k < catList.size(); k++) {
            System.out.println(catList.get(k).getName());
        }
        // COMPLETE ME: print each Cat’s name using an
        // enhanced for loop
        for (Cat cat : catList) {
            System.out.println(cat.getName());
        }

        int j = 0;
        while (j < catList.size()) {
            System.out.println(catList.get(j).getName());
            j++;
        }

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        //COMPLETE ME!
        for(int m = 0; m < nums.length; m++)
        {
            if(m + 2 < nums.length)
            {
                numList.set(m, nums[m + 1] + nums[m + 2]);
            }
        }

        System.out.println(numList);

    }
}