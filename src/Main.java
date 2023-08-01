import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       /*HomeWork2
        int [] array = {1,4, 2, 8, 56, 34, 28, 67};
        System.out.println(Arrays.toString(array));
        HomeWork2.heapSort(array);
        System.out.println(Arrays.toString(array)); */

        /*HomeWork3
        HomeWork3 homeWork3 = new HomeWork3();
        homeWork3.addLast(1);
        homeWork3.addLast(2);
        homeWork3.addLast(3);
        homeWork3.addLast(4);
        homeWork3.addLast(5);
        homeWork3.addLast(6);
        homeWork3.addLast(7);
        homeWork3.addLast(8);
        System.out.println(homeWork3.printNode());
        homeWork3.reverse();
        System.out.println(homeWork3.printNode());*/

        //HomeWork4

        HomeWork4_BinaryTree binaryTree = new HomeWork4_BinaryTree();

        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(15);
        binaryTree.insert(3);
        binaryTree.insert(8);
        binaryTree.insert(11);
        binaryTree.insert(17);
        binaryTree.insert(19);

        System.out.println(binaryTree.findNode(8));






    }








}
