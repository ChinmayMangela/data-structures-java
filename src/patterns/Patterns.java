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
        int helper = n - 2;
        for (int i = 0; i < 2 * n - 1; i++) {
            int numberOfOuterSpace = i > n - 1 ? i + 2 - n : n - i;
            for (int space = 0; space < numberOfOuterSpace; space++) {
                System.out.print(" ");
            }

            if (i == 0 || i == 2 * n - 2) {
                System.out.print("*");
            } else {
                System.out.print("*");

                int numberOfInnerSpace = i > n - 1 ? (2 * (2 * n - 2 - i)) - 1
                        : i * 2 - 1;
                for (int innerSpace = 0; innerSpace < numberOfInnerSpace; innerSpace++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                helper--;
            }
            System.out.println();
        }
    }


    public static void diamondPattern(int n) {
        /*
         *
         ***
         *****
         *******
         *********
         *******
         *****
         ***
         *
         */
        for (int i = 0; i < 2 * n - 1; i++) {
            int spaceCount = (i < n) ? (n - i - 1) : (i - n + 1);
            for (int space = 0; space < spaceCount; space++) {
                System.out.print(" ");
            }

            int starCount = (i < n) ? (2 * i + 1) : (2 * (2 * n - i - 2) + 1);
            for (int star = 0; star < starCount; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void firstHalfOfSeventeenPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }
            int numberCountForEachRow = i * 2 + 1;
            int breakPoint = numberCountForEachRow / 2;
            int number = i + 1;

            for(int j = 0; j < numberCountForEachRow; j++) {
                System.out.print(number);
                if(j < breakPoint)
                    number--;
                else
                    number++;
            }
            System.out.println();
        }
    }


    public static void secondHalfOfSeventeenPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            int numberCountForEachRow = 2 * (n - i) - 1;
            int breakPoint = numberCountForEachRow / 2;
            int number = n - i;

            for (int j = 0; j < numberCountForEachRow; j++) {
                System.out.print(number);
                if (j < breakPoint)
                    number--;
                else
                    number++;
            }
            System.out.println();
        }
    }


    public static void patternSeventeen(int n) {
        /*
            1
           212
          32123
         4321234
          32123
           212
            1
         */
        for (int i = 0; i < 2 * n - 1; i++) {
            int numberOfSpace = i < n ? n - i - 1 : i + 1 - n;
            for (int space = 0; space < numberOfSpace; space++) {
                System.out.print(" ");
            }

            int numberOfNumberInEachLine = (i < n) ? (2 * i + 1) : (2 * (2 * n - i - 2) + 1);
            int breakPoint = numberOfNumberInEachLine / 2;
            int number = i < n ? i + 1 : (2 * n) - (i + 1);

            for (int j = 0; j < numberOfNumberInEachLine; j++) {
                System.out.print(number);
                if(j < breakPoint) number--;
                else number++;
            }
            System.out.println();
        }
    }

    public static void firstHalfOfEighteenPattern(int n) {
        /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         */
        for(int i = 0; i < n; i++) {
            // Left stars
            for(int star = 0; star < n - i; star++) System.out.print("*");

            // Middle space
            for(int space = 0; space < 2 * i; space++) System.out.print(" ");

            // Right stars
            for(int star = 0; star < n - i; star++) System.out.print("*");
            System.out.println();
        }
    }

    public static void secondHalfOfEighteenPattern(int n) {
        /*
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         */
        for(int i = 0; i < n; i++) {
            // Left stars
            for(int star = 0; star <= i; star++) System.out.print("*");

            // Middle space
            for(int space = 0; space < (2 * n) - (i * 2 + 2); space++) System.out.print(" ");

            // Right stars
            for(int star = 0; star <= i; star++) System.out.print("*");
            System.out.println();
        }
    }

    public static void patternEighteen(int n) {
        /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         */

        for(int i = 0; i < 2 * n; i++) {
            int starCountInEachRow = i < n ? (n - i) : (i - n) + 1;
            // Left stars
            for(int star = 0; star < starCountInEachRow; star++) System.out.print("*");
            int spaceCountInEachRow = (2 * n) - (starCountInEachRow * 2);

            // Middle space
            for(int space = 0; space < spaceCountInEachRow; space++) System.out.print(" ");

            // Right stars
            for(int star = 0; star < starCountInEachRow; star++) System.out.print("*");
            System.out.println();
        }
    }

    public static void patternNineteen(int n) {
        /*
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         */
        for(int i = 0; i < 2 * n - 1; i++) {
            int starCountInEachRow = i < n ? (i + 1) : (2 * n - i - 1);
            // Left stars
            for(int star = 0; star < starCountInEachRow; star++) System.out.print("*");
            int spaceCountInEachRow = (2 * n) - (starCountInEachRow * 2);

            // Middle space
            for(int space = 0; space < spaceCountInEachRow; space++) System.out.print(" ");

            // Right stars
            for(int star = 0; star < starCountInEachRow; star++) System.out.print("*");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        patternNineteen(5);
    }


}
