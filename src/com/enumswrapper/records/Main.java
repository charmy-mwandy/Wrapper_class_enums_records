package com.enumswrapper.records;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        printAllToLimit(100);


        int[] numbersList = {1, 2, 3, 4, 1, 3, 4, 5, 2, 3, 4, 6, -1};

        SelectionSort s1 = new SelectionSort();

       // System.out.println(s1.toString(numbersList)); // Initial list
       // selectionSort(numbersList);
       // System.out.println(Arrays.toString(numbersList)); // Sorted list

        Day d = Day.valueOf("TUE");
        switch (d) {
            case SUN:
                System.out.println("It is a Jolly Day");
                break;
            case MON:
                System.out.println("First Working Day");
                break;
            case TUE:
                System.out.println("Second Working Day");
                break;
            case WED:
                System.out.println("Third Working Day");
                break;
            case THU:
                System.out.println("Fourth Working Day");
                break;
            case FRI:
                System.out.println("Fifth Working Day");
                break;
            case SAT:
                System.out.println("Shopping Day");
                break;
        }

        Day tuday = Day.FRI;
        if (tuday == Day.FRI){
            System.out.println("It's Friday");
        }

        CrewMember geetha = new CrewMember(FlightCrewJob.PILOT,"Geetha");
        CrewMember bob = new CrewMember(FlightCrewJob.FLIGHT_ATTENDANT,"Bob");
        whoIsInCharge(geetha,bob);


    }

     static void whoIsInCharge(CrewMember member1, CrewMember member2) {
        CrewMember theBoss = member1.getJob().compareTo(member2.getJob()) > 0 ? member1 : member2;
        System.out.println(theBoss.getJob().getTitle() + " " + theBoss.getName() + " is boss.");
    }

    static  void printAllToLimit(int n){
        for (int i = 1; i <= n; i++);{
            System.out.println(i);
        }

    }
}

/**public class SelectionSort {
    public static void selectionSort(int[] numbersList) {
        int n = numbersList.length;
        for (int i = 0; i < n - 1; i++) {
            int mixIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbersList[j] < numbersList[mixIndex]) {
                    mixIndex = j;
                }
            }
            int temp = numbersList[mixIndex];
            numbersList[mixIndex] = numbersList[i];
            numbersList[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbersList = {1, 2, 3, 4, 1, 3, 4, 5, 2, 3, 4, 6, -1};

        System.out.println(Arrays.toString(numbersList)); // Initial list
        selectionSort(numbersList);
        System.out.println(Arrays.toString(numbersList)); // Sorted list
    }
}*/






