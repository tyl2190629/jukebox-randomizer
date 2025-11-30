import java.util.ArrayList;

public class Jukebox implements JukeInterface {
    private ArrayList<Record> records;

    // Constructor
    public Jukebox() {
        records = new ArrayList<>();
    }

    // Implementing JukeInterface methods
    @Override
    public void insert(Record aRecord) {
        records.add(aRecord);
    }

    @Override
    public void insert(int slot, Record aRecord) {
        records.add(slot, aRecord);
    }

    @Override
    public boolean remove(Record aRecord) {
        return records.remove(aRecord);
    }

    @Override
    public boolean contains(Record aRecord) {
        return records.contains(aRecord);
    }

    @Override
    public int findSlot(Record aRecord) {
        return records.indexOf(aRecord);
    }

    @Override
    public Record random() {
        int size = records.size();
        if (size == 0) {
            return null;
        }
        int randomIndex = (int) (Math.random() * size);
        return records.get(randomIndex);
    }

    @Override
    public String toString() {
        return records.toString();
    }
}