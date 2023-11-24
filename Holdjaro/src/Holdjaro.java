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

    private static int position[] = { 4, 5 }; // aktuális pozíció
    private static char Orientation = 'N'; // aktuális irány
    private static int previousPosition[] = { -1, -1 }; // előző pozíció
    private static char previousDirection; // előző irány

    public static void main(String args[]) {

        Turn('r');
        System.out.println(" " + Orientation + position[0] + position[1]);
        
        Move('f');
        System.out.println(" " + Orientation + position[0] + position[1]);
        
    }

    public static char Turn(char direction) {

        if (direction == 'r') {

            switch (Orientation) {
                case 'N':
                    Orientation = 'E';
                    break;

                case 'E':
                    Orientation = 'S';
                    break;

                case 'S':
                    Orientation = 'W';
                    break;

                case 'W':
                    Orientation = 'N';
                    break;
            }
        }

        if (direction == 'l') {

            switch (Orientation) {
                case 'N':
                    Orientation = 'W';
                    break;

                case 'E':
                    Orientation = 'N';
                    break;

                case 'S':
                    Orientation = 'E';
                    break;

                case 'W':
                    Orientation = 'S';
                    break;
            }
        }
        return Orientation;
    }


public static String Move(char direction) {

    Task: switch (direction) {

        case 'f':
            switch (Orientation) {
                case 'N':
                    previousDirection = Orientation;
                    for (int i = 0; i < position.length; i++) {
                        previousPosition[i] = position[i];
                    }
                    if (position[0] == 0) {
                        if (position[1] >= 0 && position[1] <= 3) {
                            position[1] += 4;
                        } else if (position[1] >= 4 && position[1] <= 7) {
                            position[1] -= 4;
                        }
                        Orientation = 'S';
                    } else {
                        position[0] -= 1;
                    }
                    if (map[position[0]][position[1]] == 1) {
                        Orientation = previousDirection;
                        for (int i = 0; i < position.length; i++) {
                            position[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'S':
                    previousDirection = Orientation;
                    for (int i = 0; i < position.length; i++) {
                        previousPosition[i] = position[i];
                    }
                    if (position[0] == 7) {
                        if (position[1] >= 0 && position[1] <= 3) {
                            position[1] += 4;
                        } else if (position[1] >= 4 && position[1] <= 7) {
                            position[1] -= 4;
                        }
                        Orientation = 'N';
                    } else {
                        position[0] += 1;
                    }
                    if (map[position[0]][position[1]] == 1) {
                        Orientation = previousDirection;
                        for (int i = 0; i < position.length; i++) {
                            position[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'E':
                    previousDirection = Orientation;
                    for (int i = 0; i < position.length; i++) {
                        previousPosition[i] = position[i];
                    }
                    if (position[1] == 7) {
                        position[1] = 0;
                    } else {
                        position[1] += 1;
                    }
                    if (map[position[0]][position[1]] == 1) {
                        Orientation = previousDirection;
                        for (int i = 0; i < position.length; i++) {
                            position[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'W':
                    previousDirection = Orientation;
                    for (int i = 0; i < position.length; i++) {
                        previousPosition[i] = position[i];
                    }
                    if (position[1] == 0) {
                        position[1] = 7;
                    } else {
                        position[1] -= 1;
                    }
                    if (map[position[0]][position[1]] == 1) {
                        Orientation = previousDirection;
                        for (int i = 0; i < position.length; i++) {
                            position[i] = previousPosition[i];
                        }
                    }

                    break Task;

            }
            
        case 'b':
            switch (Orientation) {
                case 'N':
                    previousDirection = Orientation;
                    for (int i = 0; i < position.length; i++) {
                        previousPosition[i] = position[i];
                    }
                    if (position[0] == 7) {
                        if (position[1] >= 0 && position[1] <= 3) {
                            position[1] += 4;
                        } else if (position[1] >= 4 && position[1] <= 7) {
                            position[1] -= 4;
                        }
                        Orientation = 'S';
                    } else {
                        position[0] += 1;
                    }
                    if (map[position[0]][position[1]] == 1) {
                        Orientation = previousDirection;
                        for (int i = 0; i < position.length; i++) {
                            position[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'S':
                    previousDirection = Orientation;
                    for (int i = 0; i < position.length; i++) {
                        previousPosition[i] = position[i];
                    }
                    if (position[0] == 0) {
                        if (position[1] >= 0 && position[1] <= 3) {
                            position[1] += 4;
                        } else if (position[1] >= 4 && position[1] <= 7) {
                            position[1] -= 4;
                        }
                        Orientation = 'N';
                    } else {
                        position[0] -= 1;
                    }
                    if (map[position[0]][position[1]] == 1) {
                        Orientation = previousDirection;
                        for (int i = 0; i < position.length; i++) {
                            position[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'E':
                    previousDirection = Orientation;
                    for (int i = 0; i < position.length; i++) {
                        previousPosition[i] = position[i];
                    }
                    if (position[1] == 0) {
                        position[1] = 7;
                    } else {
                        position[1] -= 1;
                    }
                    if (map[position[0]][position[1]] == 1) {
                        Orientation = previousDirection;
                        for (int i = 0; i < position.length; i++) {
                            position[i] = previousPosition[i];
                        }
                    }

                    break Task;

                case 'W':
                    previousDirection = Orientation;
                    for (int i = 0; i < position.length; i++) {
                        previousPosition[i] = position[i];
                    }
                    if (position[1] == 7) {
                        position[1] = 0;
                    } else {
                        position[1] += 1;
                    }
                    if (map[position[0]][position[1]] == 1) {
                        Orientation = previousDirection;
                        for (int i = 0; i < position.length; i++) {
                            position[i] = previousPosition[i];
                        }
                    }

                    break Task;
            }
    }
    return Orientation + "" + position[0] + position[1];
	}
}
