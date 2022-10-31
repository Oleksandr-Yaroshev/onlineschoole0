package seoncd_lesson;

public class Four_Task {
    public static void main(String[] args) {
        int searchFlat = 157;
        int floors = 9;
        int entrances = 12;
        int flats = 4;

        int currentFlat = 0;
        int searchFloor = 0;
        int searchEntrance = 0;
        for(int entrance = 1; entrance <= entrances; entrance++) {
            for(int floor = 1; floor <= floors; floor++) {
                for(int flat = 1; flat <= flats; flat++) {
                    currentFlat++;
                    if (currentFlat == searchFlat) {
                        searchFloor = floor;
                        searchEntrance = entrance;
                        break;
                    }
                }
            }
        }
        System.out.println(searchFloor);
        System.out.println(searchEntrance);

    }
}
