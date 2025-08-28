public class DogWalker {
    private int maxDogs;
    private DogWalkCompany company;

    public DogWalker(int max, DogWalkCompany comp) {
        this.maxDogs = max;
        this.company = comp;
    }

    // to be implemented in part A
    public int walkDogs(int hour) {
        int dogsAvailable = company.numAvailableDogs(hour);

        if (dogsAvailable > this.maxDogs) {
            this.company.updateDogs(hour, maxDogs);
        } else {
            this.company.updateDogs(hour, dogsAvailable);
        }
        
        return dogsAvailable;
    }

    // to be implemented in part B
    public int dogWalkShift(int startHour, int endHour) {
        int earnings = 0;

        for (int hour = startHour; hour < endHour; hour++) {
            int dogsWalked = walkDogs(hour);
            earnings += dogsWalked * 5; // Assuming $10 per dog

            if(this.company.numAvailableDogs(hour) == 0 || (hour >= 9 && hour < 17)) {
                earnings += 3;
            }
        }

        return earnings;
    }
}