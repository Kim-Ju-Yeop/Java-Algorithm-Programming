package ch11;

public class ChainHash<K, D> {

    class Node<K, D> {
        private K key;
        private D data;
        private Node<K, D> next;

        Node(K key, D data, Node<K, D> next) {
            this.key = key;
            this.data = data;
            this.next = next;
        }

        K getKey() {
            return key;
        }

        D getData() {
            return data;
        }

        public int hashCode() {
            return key.hashCode();
        }
    }

    private int size;
    private Node<K, D>[] table;

    public ChainHash(int capacity) {
        try {
            table = new Node[capacity];
            size = capacity;
        } catch (OutOfMemoryError e) {
            size = 0;
        }
    }

    public int hashValue(K key) {
        return key.hashCode() % size;
    }

    public D search(K key) {
        int hash = hashValue(key);
        Node<K, D> p = table[hash];

        while (p != null) {
            if (p.getKey().equals(key)) return p.getData();
            else p = p.next;
        }
        return null;
    }

    public boolean add(K key, D data) {
        int hash = hashValue(key);
        Node<K, D> p = table[hash];

        while (p != null) {
            if (p.getKey().equals(key)) return false;
            else p = p.next;
        }
        Node<K, D> temp = new Node<>(key, data, table[hash]);
        table[hash] = temp;
        return true;
    }

    public boolean remove(K key) {
        int hash = hashValue(key);
        Node<K, D> p = table[hash];
        Node<K, D> pp = null;

        while (p != null) {
            if (p.getKey().equals(key)) {
                if (pp == null) table[hash] = p.next;
                else pp.next = p.next;
                return true;
            }
            pp = p;
            p = p.next;
        }
        return false;
    }

    public void dump() {
        for (int i = 0; i < size; i++) {
            Node<K, D> p = table[i];
            System.out.printf("%02d  ", i);

            while (p != null) {
                System.out.printf("-> %s (%s)  ", p.getKey(), p.getData());
                p = p.next;
            }
            System.out.println();
        }
    }
}
