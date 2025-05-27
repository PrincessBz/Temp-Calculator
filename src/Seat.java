public class Seat {
    private final int row;
    private final int column;
    private boolean isReserved;

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.isReserved = false;
    }

    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    public boolean isReserved() {
        return isReserved;
    }

    public void reserve() {
        if (!isReserved) {
            isReserved = true;
        } else {
            System.out.println("Seat is already reserved.");
        }
    }

    public void cancelReservation() {
        if (isReserved) {
            isReserved = false;
        } else {
            System.out.println("Seat is not reserved.");
        }
    }
    @Override
    public String toString() {
        return "Seat{" +
                "row=" + row +
                ", column=" + column +
                ", isReserved=" + isReserved +
                '}';
    }






}
