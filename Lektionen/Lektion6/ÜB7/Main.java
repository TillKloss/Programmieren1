package Lektion6.ÜB7;

public class Main {
        public static String formatName(String firstName, String lastName) {
            return lastName + ", " + firstName;
        }
        public static String formatNameWithMatriculationNr(String firstName, String lastName, int matriculationNr) {
            return formatName(firstName, lastName) + " (" + matriculationNr + ")";
        }
        public static String formatNameWithMatriculationNrAndMail(String firstName, String lastName, int matriculationNr, String email) {
            return formatNameWithMatriculationNr(firstName, lastName, matriculationNr) + ": " + email;
        }
        public static void main(String[] args) {
            System.out.println(formatName("John", "Doe"));
            System.out.println(formatNameWithMatriculationNr("John", "Doe", 5011111));
            System.out.println(formatNameWithMatriculationNrAndMail("John", "Doe", 5011111, "john.doe@student.fhws.de"));
        }
    }
