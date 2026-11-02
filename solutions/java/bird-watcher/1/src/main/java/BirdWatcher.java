class BirdWatcher {
    private static int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        ++this.birdsPerDay[birdsPerDay.length - 1];
    }

    public boolean hasDayWithoutBirds() {
        boolean flag = false;
        
        for (int item: this.birdsPerDay) {
            if (item == 0) {
                flag = true;
                break;
            }
        }
        
        return flag;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if (numberOfDays < birdsPerDay.length) {
            for (int i = 0; i < numberOfDays; ++i) {
                count += this.birdsPerDay[i];
            }
        }
        else {
            for (int i = 0; i < birdsPerDay.length; ++i) {
                count += this.birdsPerDay[i];
            }
        }
        
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int item: this.birdsPerDay) {
            if (item >= 5) {
                ++busyDays;
            }
        }
        return busyDays;
    }
}
