package fouzi;

import java.sql.*;

public class ReservationdbManagement {
    private static final String URL = "jdbc:mysql://localhost:3306/reservation";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static boolean addSalle(String code, String batiment, int numSalle) throws SQLException {
        String query = "INSERT INTO salle (code, batiment, num_salle) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, code);
            stmt.setString(2, batiment);
            stmt.setInt(3, numSalle);
            return stmt.executeUpdate() > 0;
        }
    }

    public static boolean removeSalle(String code) throws SQLException {
        String query = "DELETE FROM salle WHERE code = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, code);
            return stmt.executeUpdate() > 0;
        }
    }

    public static boolean updateSalle(String code, String newBatiment, int newNumSalle) throws SQLException {
        String query = "UPDATE salle SET batiment = ?, num_salle = ? WHERE code = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newBatiment);
            stmt.setInt(2, newNumSalle);
            stmt.setString(3, code);
            return stmt.executeUpdate() > 0;
        }
    }

    public static boolean addReservation(String codeSalle, String employeeName, Timestamp startTime, int duration, String reservationCode) throws SQLException {
        String query = "INSERT INTO Reservations (code_salle, employee_name, start_time, duration, reservation_code) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, codeSalle);
            stmt.setString(2, employeeName);
            stmt.setTimestamp(3, startTime);
            stmt.setInt(4, duration);
            stmt.setString(5, reservationCode);
            return stmt.executeUpdate() > 0;
        }
    }

    public static boolean removeReservation(String reservationCode) throws SQLException {
        String query = "DELETE FROM Reservations WHERE reservation_code = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, reservationCode);
            return stmt.executeUpdate() > 0;
        }
    }

    public static boolean updateReservation(String reservationCode, Timestamp newStartTime, int newDuration) throws SQLException {
        String query = "UPDATE Reservations SET start_time = ?, duration = ? WHERE reservation_code = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setTimestamp(1, newStartTime);
            stmt.setInt(2, newDuration);
            stmt.setString(3, reservationCode);
            return stmt.executeUpdate() > 0;
        }
    }


}
