package zadanie8_2;

import java.util.Objects;

public class TableContent {
    private String aString;
    private int anInt;

    public TableContent(String aString, int anInt) {
        this.aString = aString;
        this.anInt = anInt;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableContent that = (TableContent) o;
        return anInt == that.anInt &&
                Objects.equals(aString, that.aString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aString, anInt);
    }

    @Override
    public String toString() {
        return "(" + aString + "," + anInt + ")";
    }
}
