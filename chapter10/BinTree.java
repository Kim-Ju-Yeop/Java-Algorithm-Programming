package ch10;

import java.util.Comparator;

public class BinTree<K, D> {

    static class Node<K, D> {
        private K key;
        private D data;
        private Node<K, D> left;
        private Node<K, D> right;

        Node(K key, D data, Node<K, D> left, Node<K, D> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        K getKey() {
            return key;
        }

        D getData() {
            return data;
        }

        void printData() {
            System.out.println(data);
        }
    }

    private Node<K, D> root;
    private Comparator<? super K> comparator = null;

    public BinTree() {
        root = null;
    }

    public BinTree(Comparator<? super K> c) {
        this();
        comparator = c;
    }

    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
    }

    public D search(K key) {
        Node<K, D> p = root;

        while (p != null) {
            int cond = comp(key, p.getKey());

            if (cond > 0) p = p.right;
            else if (cond < 0) p = p.left;
            else return p.getData();
        }
        return null;
    }

    private void addNode(Node<K, D> node, K key, D data) {
        int cond = comp(key, node.getKey());

        if (cond > 0) {
            if (node.right == null) node.right = new Node<>(key, data, null, null);
            else addNode(node.right, key, data);
        } else if (cond < 0) {
            if (node.left == null) node.left = new Node<>(key, data, null, null);
            else addNode(node.left, key, data);
        }
    }

    public void add(K key, D data) {
        if (root == null) root = new Node<>(key, data, null, null);
        else addNode(root, key, data);
    }

    public boolean remove(K key) {
        Node<K, D> p = root;
        Node<K, D> parent = null;
        boolean isLeftChild = true;

        while (true) {
            if (p == null) return false;

            int cond = comp(key, p.getKey());
            if (cond == 0) break;
            else {
                parent = p;
                if (cond < 0) {
                    isLeftChild = true;
                    p = p.left;
                } else {
                    isLeftChild = false;
                    p = p.right;
                }
            }
        }

        if (p.left == null) {
            if (p == root) root = p.right;
            else if (isLeftChild) parent.left = p.right;
            else parent.right = p.right;
        } else if (p.right == null) {
            if (p == root) root = p.left;
            else if (isLeftChild) parent.left = p.left;
            else parent.right = p.left;
        } else {
            parent = p;
            Node<K, D> left = p.left;
            isLeftChild = true;

            while (left.right != null) {
                parent = left;
                left = left.right;
                isLeftChild = false;
            }

            p.key = left.key;
            p.data = left.data;

            if (isLeftChild) parent.left = left.left;
            else parent.right = left.left;
        }
        return true;
    }

    private void printSubTree(Node<K, D> node) {
        if (node != null) {
            printSubTree(node.left);
            System.out.println(node.data);
            printSubTree(node.right);
        }
    }

    public void print() {
        printSubTree(root);
    }
}