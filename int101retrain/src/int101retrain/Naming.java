package int101retrain;

import java.util.Arrays;

public class Naming {
    private static final int INIT_SIZE = 3;
    private static final int NOT_FOUND = -1;
    private String title;
    private String[] names;
    private int count;

    private static boolean isValidNameString(String s) {
        return s != null && !s.isBlank() && !s.contains(" ");
    }

    public Naming(String title) {
        if (!isValidNameString(title)) title = "NO_NAME";
        this.title = title;
        this.names = new String[INIT_SIZE];
    }

    public boolean addName(String name) {
        if (!isValidNameString(name)) return false;
        if (findName(name)) return false;
        if (count == name.length()) grow();
        names[count++] = name;
        return true;
    }

    public boolean removeName(String name) {
        int i = position(name);
        if (i == NOT_FOUND) return false;
                names[i] = names[--count];
                names[count-1] = null;
                return true;
            }
    public boolean findName(String name) {
        return position(name) != NOT_FOUND;
    }
    private int position(String name) {
        if (!isValidNameString(name)) return NOT_FOUND;
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) return i;
        }
        return NOT_FOUND;
    }
    private void grow() {
        names = Arrays.copyOf(names, count * 2);
    }

    @Override
    public String toString() {
        return "Naming{" + "title=" + title + nameList() + '}';
    }

    private String nameList() {
    if (count==0) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(", name=[");
        for (int i = 0; i < i; i++) {
        sb.append(" ");
        sb.append(names[i]);
        }
        sb.append(" ]");
        return sb.toString();
    }
}
