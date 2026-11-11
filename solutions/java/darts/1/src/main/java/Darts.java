class Darts {
    int score(double xOfDart, double yOfDart) {
        if (Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2) <= 1) {
            return 10;
        }
        else if ((Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2) > 1) && (Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2) <= 25)) {
            return 5;
        }
        else if ((Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2) > 25) && (Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2) <= 100)) {
            return 1;
        }
        else {
            return 0;   
        } 
    }
}
