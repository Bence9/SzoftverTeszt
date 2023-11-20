public class Holdjaro {

    private static int map[][] = {
            { 0, 0, 0, 1, 1, 0, 0, 1 },
            { 0, 1, 0, 0, 0, 1, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0, 1, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 1, 0, 0 },
            { 0, 1, 0, 1, 0, 0, 0, 0 },
            { 0, 1, 0, 0, 1, 0, 0, 0 }
    };

    private static int currentPosition[] = { 4, 5 }; // aktuális pozíció
    private static char currentHeading = 'N'; // aktuális irány
    private static int previousPosition[] = { -1, -1 }; // pozíció visszaállítás
    private static char previousHeading; // irány visszaállítás

    public static void main(String args[]) {

        Turn('r');
        System.out.println(" " + currentHeading + currentPosition[0] + currentPosition[1]);
        
    }

    public static char Turn(char direction) {

        if (direction == 'r') {

            switch (currentHeading) {
                case 'N':
                    currentHeading = 'E';
                    break;

                case 'E':
                    currentHeading = 'S';
                    break;

                case 'S':
                    currentHeading = 'W';
                    break;

                case 'W':
                    currentHeading = 'N';
                    break;
            }
        }

        if (direction == 'l') {

            switch (currentHeading) {
                case 'N':
                    currentHeading = 'W';
                    break;

                case 'E':
                    currentHeading = 'N';
                    break;

                case 'S':
                    currentHeading = 'E';
                    break;

                case 'W':
                    currentHeading = 'S';
                    break;
            }
        }
        return currentHeading;
    }
}
