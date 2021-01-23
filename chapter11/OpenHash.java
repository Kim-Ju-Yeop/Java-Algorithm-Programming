package ch11;

public class OpenHash<K, D> {

    enum Status {
        OCCUPIED,
        EMPTY,
        DELETED
    }

    static class Bucket<K, D> {
        private K key;
        private D data;
        private Status stat;

        Bucket() {
            stat = Status.EMPTY;
        }

        void set(K key, D data, Status stat) {
            this.key = key;
            this.data = data;
            this.stat = stat;
        }

        void setStat(Status stat) {
            this.stat = stat;
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
    private Bucket<K, D>[] table;

    public OpenHash(int size) {
        try {
            table = new Bucket[size];
            for (int i = 0; i < size; i++) table[i] = new Bucket<>();
            this.size = size;
        } catch (OutOfMemoryError e) {
            this.size = size;
        }
    }

    public int hashValue(K key) {
        return key.hashCode() % size;
    }

    public int reHashValue(int hash) {
        return (hash + 1) % size;
    }

    private Bucket<K, D> searchNode(K key) {
        int hash = hashValue(key);
        Bucket<K, D> p = table[hash];

        for (int i = 0; p.stat != Status.EMPTY && i < size; i++) {
            if (p.stat == Status.OCCUPIED && p.getKey().equals(key)) return p;
            hash = reHashValue(hash);
            p = table[hash];
        }
        return null;
    }

    public D search(K key) {
        Bucket<K, D> p = searchNode(key);
        if (p != null) return p.getData();
        else return null;
    }

    public boolean add(K key, D data) {
        if (search(key) != null) return false;

        int hash = hashValue(key);
        Bucket<K, D> p = table[hash];

        for (int i = 0; i < size; i++) {
            if (p.stat != Status.OCCUPIED) {
                p.set(key, data, Status.OCCUPIED);
                return true;
            }
            hash = reHashValue(hash);
            p = table[hash];
        }
        return false;
    }

    public boolean remove(K key) {
        Bucket<K, D> p = searchNode(key);
        if (p == null) return false;

        p.setStat(Status.DELETED);
        return true;
    }

    public void dump() {
        for (int i = 0; i < size; i++) {
            System.out.printf("%02d  ", i);
            switch (table[i].stat) {
                case OCCUPIED:
                    System.out.printf("%s (%s)\n", table[i].getKey(), table[i].getData()); break;

                case EMPTY:
                    System.out.println("-- 미등록 --"); break;

                case DELETED:
                    System.out.println("-- 삭제 마침 --"); break;
            }
        }
    }
}
