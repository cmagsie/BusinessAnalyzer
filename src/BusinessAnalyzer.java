import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BusinessAnalyzer {
    private List<Business> businessesList;
    private Queue<String> historyList;
    private String listType;

    public BusinessAnalyzer(String listType, String filename) {
        this.listType = listType.trim().toUpperCase();
        this.historyList = new ArrayDeque<>();

        if (this.listType.equals("AL")) {
            businessesList = new ArrayList<>();
        } else if (this.listType.equals("LL")) {
            businessesList = new LinkedList<>();
        } else {
            throw new IllegalArgumentException("List type can only be either AL or LL.");
        }

        readCSV(filename);
    }

    private void readCSV(String filename) {
        int count = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (count == 0) {
                    ++count;
                    continue;
                }

                ++count;
                String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                businessesList.add(new Business(data[26], data[1], data[2], data[3], data[4], data[7], data[8], data[9],
                        data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17],
                        data[18].trim().equals("true") ? true : false, data[19].trim().equals("true") ? true : false,
                        data[20], data[21], data[22], data[23], data[24], data[25],
                        data[27].trim().isEmpty() ? null : Integer.parseInt(data[27].trim()),
                        data[28].trim().isEmpty() ? null
                                : Integer.parseInt(data[28].trim()),
                        data[29].trim().isEmpty() ? null
                                : Integer.parseInt(data[29].trim()),
                        data[30].trim().isEmpty() ? null
                                : Integer.parseInt(data[30].trim()),
                        data[31].trim().isEmpty() ? null : Integer.parseInt(data[31].trim())));
            }

            reader.close();
        } catch (Exception exception) {
            System.out.println("Count: " + count);
            exception.printStackTrace();
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean isQuiting = false;
        while (!isQuiting) {
            System.out.println(
                    "\nApplication commands are as follows:\n\nZip number Summary, e.g., Zip 94018 Summary\n\nNAICS number Summary, e.g., NAICS 4855 Summary\n\nSummary\n\nHistory\n");
            System.out.println("\nType quit to exit the application.\n");
            System.out.print("Please enter the command: ");
            String input = scanner.nextLine();
            isQuiting = !processInput(input);
        }
        scanner.close();
    }

    private boolean processInput(String input) {
        String[] command = input.trim().toLowerCase().split("\\s+");
        if (command[0].equals("quit")) {
            System.out.println("\nExiting the application.");
            return false;
        } else if (command[0].equals("zip")) {
            if (command.length != 3) {
                System.out.println("\nInvalid command.");
            } else {
                historyList.add(input);
                handleZipCommand(command);
            }
        } else if (command[0].equals("naics")) {
            if (command.length != 3) {
                System.out.println("\nInvalid command.");
            } else {
                historyList.add(input);
                handleNaicsCommand(command);
            }
        } else if (command[0].equals("summary")) {
            if (command.length != 1) {
                System.out.println("\nInvalid command.");
            } else {
                historyList.add(input);
                handleSummaryCommand();
            }
        } else if (command[0].equals("history")) {
            if (command.length != 1) {
                System.out.println("\nInvalid command.");
            } else {
                handleHistoryCommand();
            }
        } else {
            System.out.println("\nInvalid command.\n");
        }

        return true;
    }

    private void handleZipCommand(String[] command) {
        int totalBusinesses = 0;
        ArrayList<String> totalBusinessTypes = new ArrayList<>();
        int neighborhoods = 0;

        for (int i = 0; i < businessesList.size(); i++) {
            if (businessesList.get(i).getZipcode().trim().equals(command[1].trim())) {
                ++totalBusinesses;
                if (!totalBusinessTypes.contains(businessesList.get(i).getAccountNumber().trim())) {
                    totalBusinessTypes.add(businessesList.get(i).getAccountNumber().trim());
                }
                neighborhoods += businessesList.get(i).getNeighborhoods() == null ? 0
                        : businessesList.get(i)
                                .getNeighborhoods();
            }
        }

        System.out.println("\n" + command[1] + " Business Summary");
        System.out.println("Total Businesses: " + totalBusinesses);
        System.out.println("Business Types: " + totalBusinessTypes.size());
        System.out.println("Neighborhood: " + neighborhoods + "\n");
    }

    private void handleNaicsCommand(String[] command) {
        int totalBusinesses = 0;
        ArrayList<String> totalBusinessCodes = new ArrayList<>();
        int neighborhoods = 0;

        for (int i = 0; i < businessesList.size(); i++) {
            if (businessesList.get(i).getNaicsCode().trim().isEmpty()) {
                continue;
            }

            String[] ranges = businessesList.get(i).getNaicsCode().split("\\s+");
            for (int j = 0; j < ranges.length; j++) {
                String[] range = ranges[j].split("-");

                if (command[1].trim().compareToIgnoreCase(range[0].trim()) > 0 && command[1].trim()
                        .compareToIgnoreCase(range[1].trim()) < 0) {
                    ++totalBusinesses;
                    if (!totalBusinessCodes.contains(businessesList.get(i).getZipcode().trim())) {
                        totalBusinessCodes.add(businessesList.get(i).getZipcode().trim());
                    }
                    neighborhoods += businessesList.get(i).getNeighborhoods() == null ? 0
                            : businessesList.get(i)
                                    .getNeighborhoods();

                    break;
                }
            }
        }

        System.out.println("\nTotal Businesses: " + totalBusinesses);
        System.out.println("Zip Codes: " + totalBusinessCodes.size());
        System.out.println("Neighborhood: " + neighborhoods + "\n");
    }

    private void handleSummaryCommand() {
        int closedBusinesses = 0;

        for (int i = 0; i < businessesList.size(); i++) {
            if (!businessesList.get(i).getBusinessEndDate().trim().isEmpty()) {
                ++closedBusinesses;
            }
        }

        System.out.println("\nTotal Businesses: " + businessesList.size());
        System.out.println("Closed Businesses: " + closedBusinesses + "\n");
    }

    private void handleHistoryCommand() {
        System.out.println();
        while (historyList.peek() != null) {
            System.out.println(historyList.poll());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println(
                    "Invalid command. Usage:\n\tBusinessAnalyzer Registered_Business_Locations_-_San_Francisco.csv AL\n\tOR\n\tBusinessAnalyzer Registered_Business_Locations_-_San_Francisco.csv LL");
            System.exit(1);
        }

        new BusinessAnalyzer(args[1], args[0]).run();
    }
}