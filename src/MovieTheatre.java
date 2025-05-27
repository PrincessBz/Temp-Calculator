import java.util.ArrayList;
import java.util.Scanner;

public class MovieTheatre {
    private static final int ROWS = 10;
    private static final int COLUMNS = 10;
    private static final ArrayList<Seat> seats = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeSeats();

        while (true) {
            System.out.println("Welcome to the Movie Theatre!");
            System.out.println("1. Reserve a seat");
            System.out.println("2. Cancel a reservation");
            System.out.println("3. View all seats");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reserveSeat(scanner);
                    break;
                case 2:
                    cancelReservation(scanner);
                    break;
                case 3:
                    viewSeats();
                    break;
                case 4:
                    System.out.println("Thank you for visiting!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

    }

    private static void initializeSeats() {
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                seats.add(new Seat(row, column));
            }
        }
    }


    private static boolean isValidSeat(int row, int column) {
        return row >= 0 && row < ROWS && column >= 0 && column < COLUMNS;
    }

    private static Seat getSeat(int row, int column) {
        for (Seat seat : seats) {
            if (seat.getRow() == row && seat.getColumn() == column) {
                return seat;
            }
        }
        return null;
    }


    private static void reserveSeat(Scanner scanner) {
        System.out.print("Enter row (0-9): ");
        int row = scanner.nextInt();
        System.out.print("Enter column (0-9): ");
        int column = scanner.nextInt();

        if (isValidSeat(row, column)) {
            Seat seat = getSeat(row, column);
            if (seat != null && !seat.isReserved()) {
                seat.reserve();
                System.out.println("Seat reserved successfully.");
            } else {
                System.out.println("Seat is already reserved or does not exist.");
            }
        } else {
            System.out.println("Invalid seat position.");
        }
    }

    private static void cancelReservation(Scanner scanner) {
        System.out.print("Enter row (0-9): ");
        int row = scanner.nextInt();
        System.out.print("Enter column (0-9): ");
        int column = scanner.nextInt();

        if (isValidSeat(row, column)) {
            Seat seat = getSeat(row, column);
            if (seat != null && seat.isReserved()) {
                seat.cancelReservation();
                System.out.println("Reservation cancelled successfully.");
            } else {
                System.out.println("Seat is not reserved or does not exist.");
            }
        } else {
            System.out.println("Invalid seat position.");
        }
    }

    private static void viewSeats() {
        System.out.println("Current seat reservations:");
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                Seat seat = getSeat(row, column);
                if (seat != null && seat.isReserved()) {
                  System.out.print("X ");
                }
                else {
                  System.out.print("O ");
            }
            }
            System.out.println();
        }
    }








}
