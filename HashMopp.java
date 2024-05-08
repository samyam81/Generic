import java.util.ArrayList;

public class HashMopp<K, V> {
    protected K key;
    protected V value;

    public HashMopp(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class InnerHashMopp<K, V> extends HashMopp<K, V> {
    private ArrayList<ArrayList<HashMopp<K, V>>> buckets;
    private int capacity;
    private int size;
    private static final double LOAD_FACTOR = 0.15;

    public InnerHashMopp(int initialcapacity) {
        super(null, null);
        this.capacity = initialcapacity;
        this.size = 0;
        this.buckets = new ArrayList<>(capacity);
        for (int index = 0; index < capacity; index++) {
            buckets.add(new ArrayList<>());
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value) {
        if ((double) (size + 1) / capacity > LOAD_FACTOR) {
            resize();
        }
        int index = hash(key);
        ArrayList<HashMopp<K, V>> bucket = buckets.get(index);

        for (HashMopp<K, V> pair : bucket) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }

        bucket.add(new HashMopp<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        ArrayList<HashMopp<K, V>> bucket = buckets.get(index);

        for (HashMopp<K, V> pair : bucket) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }

        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        ArrayList<HashMopp<K, V>> bucket = buckets.get(index);

        for (HashMopp<K, V> pair : bucket) {
            if (pair.key.equals(key)) {
                bucket.remove(pair);
                size--;
                return;
            }
        }
    }

    private void resize() {
        capacity *= 2;
        ArrayList<ArrayList<HashMopp<K, V>>> newBuckets = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            newBuckets.add(new ArrayList<>());
        }

        for (ArrayList<HashMopp<K, V>> bucket : buckets) {
            for (HashMopp<K, V> pair : bucket) {
                int index = Math.abs(pair.key.hashCode() % capacity);
                newBuckets.get(index).add(pair);
            }
        }

        buckets = newBuckets;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
