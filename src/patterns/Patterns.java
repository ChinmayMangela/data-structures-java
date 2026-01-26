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

            int starCount = (2 * n) - (spaceCount * 2 + 1);
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
                if (j < breakPoint) number--;
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
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int star = 0; star < n - i; star++) System.out.print("*");

            // Middle space
            for (int space = 0; space < 2 * i; space++) System.out.print(" ");

            // Right stars
            for (int star = 0; star < n - i; star++) System.out.print("*");
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
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int star = 0; star <= i; star++) System.out.print("*");

            // Middle space
            for (int space = 0; space < (2 * n) - (i * 2 + 2); space++) System.out.print(" ");

            // Right stars
            for (int star = 0; star <= i; star++) System.out.print("*");
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

        for (int i = 0; i < 2 * n; i++) {
            int starCountInEachRow = i < n ? (n - i) : (i - n) + 1;
            // Left stars
            for (int star = 0; star < starCountInEachRow; star++) System.out.print("*");
            int spaceCountInEachRow = (2 * n) - (starCountInEachRow * 2);

            // Middle space
            for (int space = 0; space < spaceCountInEachRow; space++) System.out.print(" ");

            // Right stars
            for (int star = 0; star < starCountInEachRow; star++) System.out.print("*");
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
        for (int i = 0; i < 2 * n - 1; i++) {
            int starCountInEachRow = i < n ? (i + 1) : (2 * n - i - 1);
            // Left stars
            for (int star = 0; star < starCountInEachRow; star++) System.out.print("*");
            int spaceCountInEachRow = (2 * n) - (starCountInEachRow * 2);

            // Middle space
            for (int space = 0; space < spaceCountInEachRow; space++) System.out.print(" ");

            // Right stars
            for (int star = 0; star < starCountInEachRow; star++) System.out.print("*");
            System.out.println();
        }
    }

    public static void patternTwenty(int n) {
        /*
         ****
         *  *
         *  *
         *  *
         ****
         */
        for (int i = 1; i < 2 * n; i++) {
            if (i > 1 && i < 2 * n - 1) {
                if (i % 2 != 0) {
                    System.out.print("*");
                    for (int space = 0; space < n - 3; space++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                } else {
                    continue;
                }
            } else {
                for (int stars = 0; stars < n - 1; stars++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void patternTwentyOne(int n) {
        /*
        1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15
         */
        int number = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void patternTwentyTwo(int n) {
        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
         */
        for (int i = 1; i <= n; i++) {
            int number = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = 1 - number;
            }
            System.out.println();
        }
    }

    public static void firstHalfOfPatternTwentyFour(int n) {
        /*
         *        *
         **      **
         * *    * *
         *  *  *  *
         *   **   *
         */
        for (int i = 0; i < n; i++) {
            System.out.print("*");  // Left border star
            if (i == 0) {
                for (int space = 0; space < (2 * n) - 2; space++) System.out.print(" ");
            } else {
                // This loop is responsible for printing inner space
                for (int space = 0; space < i - 1; space++) {
                    System.out.print(" ");
                }

                System.out.print("*"); // inner star

                // This loop is responsible for second inner(middle) space
                for (int space = 0; space < (2 * n) - (i * 2 + 2); space++) {
                    System.out.print(" ");
                }

                System.out.print("*"); // inner star

                // This loop is responsible for printing inner space
                for (int space = 0; space < i - 1; space++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");  // Right border star
            System.out.println();
        }

    }

    public static void secondHalfOfPatternTwentyFour(int n) {
        /*
         *   **   *
         *  *  *  *
         * *    * *
         **      **
         *        *
         */
        for (int i = 0; i < n; i++) {
            System.out.print("*");  // Left border star
            if (i == n - 1) {
                for (int space = 0; space < (2 * i); space++) System.out.print(" ");
            } else {
                // This loop is responsible for printing left inner space
                for (int space = 0; space < n - (i + 2); space++) {
                    System.out.print(" ");
                }

                System.out.print("*"); // inner star

                // This loop is responsible for second inner(middle) space
                for (int space = 0; space < (2 * i); space++) {
                    System.out.print(" ");
                }

                System.out.print("*"); // inner star

                // This loop is responsible for printing right inner space
                for (int space = 0; space < n - (i + 2); space++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");  // Right border star
            System.out.println();
        }

    }

    public static void patternTwentyFour(int n) {
        /*
         *        *
         **      **
         * *    * *
         *  *  *  *
         *   **   *
         *   **   *
         *  *  *  *
         * *    * *
         **      **
         *        *
         */

        for (int i = 0; i < 2 * n; i++) {
            System.out.print("*");  // Left border star
            if (i == 0 || i == 2 * n - 1) {
                for (int space = 0; space < (2 * n - 2); space++) System.out.print(" ");
            } else {
                int innerSpace = i < n ? (i - 1) : (2 * n) - (i + 2);
                // This loop is responsible for printing left inner space
                for (int space = 0; space < innerSpace; space++) {
                    System.out.print(" ");
                }

                System.out.print("*"); // inner star

                int middleInnerSpace = i < n ? (2 * n) - (i * 2 + 2) : (i * 2) - (2 * n);
                // This loop is responsible for second inner(middle) space
                for (int space = 0; space < middleInnerSpace; space++) {
                    System.out.print(" ");
                }

                System.out.print("*"); // inner star

                // This loop is responsible for printing right inner space
                for (int space = 0; space < innerSpace; space++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");  // Right border star
            System.out.println();
        }
    }


    public static void patternTwentyFive(int n) {
        /*
             *****
            *   *
           *   *
          *   *
         *****
         */

        for (int i = 0; i < n; i++) {
            // left outer space
            for (int space = 0; space < n - (i + 1); space++) {
                System.out.print(" ");
            }
            System.out.print("*"); // Left border space
            boolean isFirstAndLastLine = i == 0 || i == n - 1;
            for (int j = 0; j < n - 2; j++) {
                System.out.print(isFirstAndLastLine ? "*" : " ");
            }
            System.out.print("*"); // Right border space
            System.out.println();

        }
    }

    public static void patternTwentySix(int n) {
        /*
        1 1 1 1 1 1
        2 2 2 2 2
        3 3 3 3
        4 4 4
        5 5
        6
         */
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public static void patternTwentySeven(int n) {
        /*
        1 2 3 4  17 18 19 20
          5 6 7  14 15 16
            8 9  12 13
              10 11
         */

    }

    public static void patternTwentyEight(int n) {
        /*
              *
             * *
            * * *
           * * * *
          * * * * *
           * * * *
            * * *
             * *
              *
         */
        for(int i = 0; i < 2 * n - 1; i++) {
            int spaces = i < n ? (n - i - 1) : (i + 1 - n);
            for(int sp = 0; sp < spaces; sp++) {
                System.out.print(" ");
            }
            for(int stars = 0; stars < n - spaces; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTwentyNine(int n) {
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
            int starsCountInEachRow = i < n ? i + 1 : (2 * n - i - 1);
            for(int stars = 0; stars < starsCountInEachRow; stars++) {
                System.out.print("*");
            }
            int spacesCount = (2 * n) - (2 * starsCountInEachRow);
            for(int sp = 0; sp < spacesCount; sp++) {
                System.out.print(" ");
            }
            for(int stars = 0; stars < starsCountInEachRow; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternThirty(int n) {
        /*
               1
             2 1 2
           3 2 1 2 3
         4 3 2 1 2 3 4
       5 4 3 2 1 2 3 4 5
         */
        for(int i = 0; i < n; i++) {
            int number = i + 1;
            for(int spaces = 0; spaces < n - i - 1; spaces++) {
                System.out.print(" ");
            }
            int countOfNumbersInEachRow = (2 * i + 1);
            int breakPoint = countOfNumbersInEachRow / 2;
            for(int num = 0; num < countOfNumbersInEachRow; num++) {
                System.out.print(number);
                if(num < breakPoint) number--;
                else number++;
            }
            System.out.println();
        }
    }

    public static void patternThirtyTwo(int n) {
        /*
        E
        D E
        C D E
        B C D E
        A B C D E
         */
        for(int i = 0; i < n; i++) {
            int start = 'A' + (n - i - 1);
            for(int j = 0; j <= i; j++) {
                System.out.print((char) start);
                start++;
            }
            System.out.println();
        }
    }

    public static void patternThirtyThree(int n) {
        /*
        a
        B c
        D e F
        g H i J
        k L m N o
         */

        int asciiNumber = 'A';
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(asciiNumber % 2 == 0) {
                    System.out.print((char) asciiNumber);
                } else {
                    System.out.print((char)(asciiNumber + 32));
                }

                asciiNumber++;
            }
            System.out.println();
        }
    }

    public static void patternThirtyFour(int n) {
        /*
        E D C B A
        D C B A
        C B A
        B A
        A
         */

        for(int i = 0; i < n; i++) {
            int start = 'A' + (n - i - 1);
            for(int j = 0; j < n - i; j++) {
                System.out.print((char) start);
                start--;
            }
            System.out.println();
        }
    }

    public static void patternThirtyFive(int n) {
        /*
        1        1
        12      21
        123    321
        1234  4321
        1234554321
         */
        for(int i = 0; i < n; i++) {
            for(int num = 0; num <= i; num++) {
                System.out.print(num + 1);
            }
            int numberOfSpacesInEachRow = (2 * n) - (i * 2 + 2);
            for(int spaces = 0; spaces < numberOfSpacesInEachRow; spaces++) {
                System.out.print(" ");
            }
            int number = i + 1;
            for(int num = 0; num <= i; num++) {
                System.out.print(number);
                number--;
            }
            System.out.println();
        }
    }

    // https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
    public static void main(String[] args) {
        patternThirtyFive(5);
    }


}
