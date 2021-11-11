package com.javarush.task.task21.task2108;

/* 
Клонирование растений
*/

public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = (Tree) tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        for (int i = 0; i < tree.branches.length; i++) {
            System.out.println(tree.branches[i]);
        }
        System.out.println(clone.branches);
        for (int i = 0; i < clone.branches.length; i++) {
            System.out.println(clone.branches[i]);
        }
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new Plant(getName());
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            String[] clBranches = new String[this.branches.length];
            for (int i = 0; i < this.branches.length; i++) {
                clBranches[i] = this.branches[i];
            }
            Tree tree = new Tree(getName(), clBranches);
            return tree;
        }

        public String[] getBranches() {
            return branches;
        }
    }
}
