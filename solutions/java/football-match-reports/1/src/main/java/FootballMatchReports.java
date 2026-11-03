public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String onField = "";
        switch (shirtNum) {
            case 1:
                onField = "goalie";
                break;
            case 2:
                onField = "left back";
                break;
            case 3:
                onField = "center back";
                break;
            case 4:
                onField = "center back";
                break;
            case 5:
                onField = "right back";
                break;
            case 6:
                onField = "midfielder";
                break;
            case 7:
                onField = "midfielder";
                break;
            case 8:
                onField = "midfielder";
                break;
            case 9:
                onField = "left wing";
                break;
            case 10:
                onField = "striker";
                break;
            case 11:
                onField = "right wing";
                break;
            default:
                onField = "invalid";
                break;
        }

        return onField;
    }
}
