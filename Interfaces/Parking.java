class AllocatedSlot {
    String status = "parking halts";

    void execute(int count) {
        System.out.println(status);
    }
}

class ReleaseSlot {
    String status = "parking status";

    void execute(int count) {
        System.out.println(status);
    }
}

class ReserveSlot {
    String status = "parking status";

    void execute(int count) {
        System.out.println(status);
    }
}

class ParkingStatus {
    int totalSlots = 150;

    int getAvailableStatus(int occupied) {
        return totalSlots - occupied;
    }
}

class ParkingStatusUpdate {
    int totalSlots = 120;
    int occupiedSlots;
    void updateOccupiedSlots(int count) {
        occupiedSlots = count;
    }
}

class ParkingController {
    String operation = "parking";

    void process(int count) {
        ParkingStatus ps = new ParkingStatus();
        ParkingStatusUpdate psu = new ParkingStatusUpdate();

        psu.updateOccupiedSlots(count);

        int available = ps.getAvailableStatus(count);

        if (available == 2) {
            new AllocatedSlot().execute(count);
        } else if (available > 2 && available < ps.totalSlots) {
            new ReleaseSlot().execute(count);
        } else {
            new ReserveSlot().execute(count);
        }
    }
}

public class Parking {
    public static void main(String[] args) {
        ParkingController pc = new ParkingController();
        pc.process(120);
    }
}