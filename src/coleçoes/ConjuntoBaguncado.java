package coleçoes;

import java.util.HashSet;
import java.util.Set;

public class
ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();



        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println("Tamanho e: " + conjunto.size());


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        conjunto.addAll(nums);
        System.out.println(conjunto);

    }
}
