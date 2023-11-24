public class Holdjaro {

    private static int map[][] = {
            { 0, 0, 0, 1, 1, 0, 0, 1 },
            { 0, 1, 0, 0, 0, 1, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0, 1, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 1, 0, 0 },
            { 0, 1, 0, 1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 1, 0, 0, 0 }
    };

    private static int currentPosition[] = { 4, 5 }; // aktuális pozíció
    private static char currentHeading = 'N'; // aktuális irány
    private static int previousPosition[] = { -1, -1 }; // pozíció visszaállítás
    private static char previousHeading; // irány visszaállítás

    public static void main(String args[]) {

        Turn('r');
        System.out.println(" " + currentHeading + currentPosition[0] + currentPosition[1]);
        
        Move('f');
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


public static String Move(char direction) {

    Task: switch (direction) {

        case 'f':
            switch (currentHeading) {
                case 'N':
                    previousHeading = currentHeading;
                    for (int i = 0; i < currentPosition.length; i++) {
                        previousPosition[i] = currentPosition[i];
                    }
                    if (currentPosition[0] == 0) {
                        if (currentPosition[1] >= 0 && currentPosition[1] <= 3) {
                            currentPosition[1] += 4;
                        } else if (currentPosition[1] >= 4 && currentPosition[1] <= 7) {
                            currentPosition[1] -= 4;
                        }
                        currentHeading = 'S';
                    } else {
                        currentPosition[0] -= 1;
                    }
                    if (map[currentPosition[0]][currentPosition[1]] == 1) {
                        currentHeading = previousHeading;
                        for (int i = 0; i < currentPosition.length; i++) {
                            currentPosition[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'S':
                    previousHeading = currentHeading;
                    for (int i = 0; i < currentPosition.length; i++) {
                        previousPosition[i] = currentPosition[i];
                    }
                    if (currentPosition[0] == 7) {
                        if (currentPosition[1] >= 0 && currentPosition[1] <= 3) {
                            currentPosition[1] += 4;
                        } else if (currentPosition[1] >= 4 && currentPosition[1] <= 7) {
                            currentPosition[1] -= 4;
                        }
                        currentHeading = 'N';
                    } else {
                        currentPosition[0] += 1;
                    }
                    if (map[currentPosition[0]][currentPosition[1]] == 1) {
                        currentHeading = previousHeading;
                        for (int i = 0; i < currentPosition.length; i++) {
                            currentPosition[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'E':
                    previousHeading = currentHeading;
                    for (int i = 0; i < currentPosition.length; i++) {
                        previousPosition[i] = currentPosition[i];
                    }
                    if (currentPosition[1] == 7) {
                        currentPosition[1] = 0;
                    } else {
                        currentPosition[1] += 1;
                    }
                    if (map[currentPosition[0]][currentPosition[1]] == 1) {
                        currentHeading = previousHeading;
                        for (int i = 0; i < currentPosition.length; i++) {
                            currentPosition[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'W':
                    previousHeading = currentHeading;
                    for (int i = 0; i < currentPosition.length; i++) {
                        previousPosition[i] = currentPosition[i];
                    }
                    if (currentPosition[1] == 0) {
                        currentPosition[1] = 7;
                    } else {
                        currentPosition[1] -= 1;
                    }
                    if (map[currentPosition[0]][currentPosition[1]] == 1) {
                        currentHeading = previousHeading;
                        for (int i = 0; i < currentPosition.length; i++) {
                            currentPosition[i] = previousPosition[i];
                        }
                    }

                    break Task;

            }
            
        case 'b':
            switch (currentHeading) {
                case 'N':
                    previousHeading = currentHeading;
                    for (int i = 0; i < currentPosition.length; i++) {
                        previousPosition[i] = currentPosition[i];
                    }
                    if (currentPosition[0] == 7) {
                        if (currentPosition[1] >= 0 && currentPosition[1] <= 3) {
                            currentPosition[1] += 4;
                        } else if (currentPosition[1] >= 4 && currentPosition[1] <= 7) {
                            currentPosition[1] -= 4;
                        }
                        currentHeading = 'S';
                    } else {
                        currentPosition[0] += 1;
                    }
                    if (map[currentPosition[0]][currentPosition[1]] == 1) {
                        currentHeading = previousHeading;
                        for (int i = 0; i < currentPosition.length; i++) {
                            currentPosition[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'S':
                    previousHeading = currentHeading;
                    for (int i = 0; i < currentPosition.length; i++) {
                        previousPosition[i] = currentPosition[i];
                    }
                    if (currentPosition[0] == 0) {
                        if (currentPosition[1] >= 0 && currentPosition[1] <= 3) {
                            currentPosition[1] += 4;
                        } else if (currentPosition[1] >= 4 && currentPosition[1] <= 7) {
                            currentPosition[1] -= 4;
                        }
                        currentHeading = 'N';
                    } else {
                        currentPosition[0] -= 1;
                    }
                    if (map[currentPosition[0]][currentPosition[1]] == 1) {
                        currentHeading = previousHeading;
                        for (int i = 0; i < currentPosition.length; i++) {
                            currentPosition[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'E':
                    previousHeading = currentHeading;
                    for (int i = 0; i < currentPosition.length; i++) {
                        previousPosition[i] = currentPosition[i];
                    }
                    if (currentPosition[1] == 0) {
                        currentPosition[1] = 7;
                    } else {
                        currentPosition[1] -= 1;
                    }
                    if (map[currentPosition[0]][currentPosition[1]] == 1) {
                        currentHeading = previousHeading;
                        for (int i = 0; i < currentPosition.length; i++) {
                            currentPosition[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'W':
                    previousHeading = currentHeading;
                    for (int i = 0; i < currentPosition.length; i++) {
                        previousPosition[i] = currentPosition[i];
                    }
                    if (currentPosition[1] == 7) {
                        currentPosition[1] = 0;
                    } else {
                        currentPosition[1] += 1;
                    }
                    if (map[currentPosition[0]][currentPosition[1]] == 1) {
                        currentHeading = previousHeading;
                        for (int i = 0; i < currentPosition.length; i++) {
                            currentPosition[i] = previousPosition[i];
                        }
                    }

                    break Task;
            }
    }
    return currentHeading + "" + currentPosition[0] + currentPosition[1];
	}
}
