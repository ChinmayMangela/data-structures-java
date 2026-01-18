package patterns;

public class Patterns {

    public static void patternOne(int n) {
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternTwo(int n) {
        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternThree(int n) {
        /*
         *****
         ****
         ***
         **
         *
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternFour(int n) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void patternFive(int n) {
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */
        for (int i = 0; i < 2 * n - 1; i++) {
            int numberOfStarsInARow = i > n - 1 ? 2 * n - i - 2 : i;
            for (int j = 0; j <= numberOfStarsInARow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternSix(int n) {
        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternSeven(int n) {
        /*
         *****
         ****
         ***
         **
         *
         */
        for (int i = 0; i < n; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < n - i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternEight(int n) {
        /*
         *
         ***
         *****
         *******
         *********
         */
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < i * 2 + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternNine(int n) {
        /*
         *********
         *******
         *****
         ***
         *
         */
        for (int i = 0; i < n; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < n * 2 - (2 * i + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternTen(int n) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternEleven(int n) {

        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 0; i < n; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < n - i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void patternTwelve(int n) {
        patternEleven(n);
        patternTen(n);
    }

    public static void patternThirteen(int n) {
        /*
         *
         * *
         *   *
         *     *
         *********
         */
        for (int i = 0; i < n; i++) {
            // for outer space
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            // for first and last line because they don't have any inner space
            if (i == 0 || i == n - 1) {
                for (int star = 0; star < i * 2 + 1; star++) {
                    System.out.print("*");
                }
            } else { // this is for inner part which contains inner space from 1 to n - 2
                System.out.print("*");
                for (int space = 0; space < i * 2 - 1; space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void patternFourteen(int n) {
        /*
         *********
          *     *
           *   *
            * *
             *
         */
        for (int i = 0; i < n; i++) {
            // for outer space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            // for first and last line because they don't have any inner space
            if (i == 0) {
                for (int star = 0; star < (2 * n - 1); star++) {
                    System.out.print("*");
                }
            } else if (i == n - 1) {
                System.out.print("*");
            } else { // this is for inner part which contains inner space from 1 to n - 2
                System.out.print("*");
                int innerSpaceCount = (2 * n) - (2 * i) - 3;
                for (int innerSpace = 0; innerSpace < innerSpaceCount; innerSpace++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int numberOfStarsInEachRow = i > n - 1 ? i + 2 - n : n - i;
            for (int star = 0; star < numberOfStarsInEachRow; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternFifteen(int n) {
        /*
              *
             * *
            *   *
           *     *
          *       *
           *     *
            *   *
             * *
              *
         */
        for(int i = 0; i < 2 * n - 1; i++) {
            int numberOfOuterSpace = i > n - 1 ?  i + 2 - n : n - i;
            for(int space = 0; space < numberOfOuterSpace; space++) {
                System.out.print(" ");
            }

            if(i == 0 || i == 2 * n - 2) {
                System.out.print("*");
            } else {
                System.out.print("*");
                int numberOfInnerSpace = i > n - 1 ? 2 * (2 * n - 2 - i) - 1 : i * 2 - 1;
                for(int space = 0; space < numberOfInnerSpace; space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        patternFifteen(5);
    }


}
