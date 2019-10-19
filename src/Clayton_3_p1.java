import java.security.SecureRandom;
import java.util.Scanner;

public class Clayton_3_p1
{
    private static double incorrect;
    private static double correct;
    private static double percentage;

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int user;

        System.out.println("Please Enter Your Level Of Difficulty.");
        System.out.println("Press 1 for stage one problems");
        System.out.println("Press 2 for stage two problems");
        System.out.println("Press 3 for stage three problems");
        System.out.println("Press 4 for stage four problems");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");


        if (user == 1)
        {
            questionOne();
        }

        if(user == 2)
        {
            for (int i = 0; i < 10; i++)
            {
                questionTwo();
            }
        }

        if(user == 3)
        {
            for (int i = 0; i < 10; i++)
            {
                questionThree();
            }
        }

        if(user == 4)
        {
            for (int i = 0; i < 10; i++)
            {
                questionFour();
            }
        }


        System.out.printf("\ncorrect: %.2f, incorrect: %.2f\n", correct, incorrect);
        percentage = (correct / 10) * 100;
        System.out.print("You scored a %");
        System.out.printf("%.2f\n", percentage);
        if(percentage > 75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else if(percentage < 75)
        {
            System.out.println("Please ask your teacher for extra help\n");
            for(int i = 0; i < 10; i++)
            {
                questionOne();
            }
            System.out.printf("correct: %.2f, incorrect: %.2f\n", correct, incorrect);
            percentage = (correct / 10) * 100;
            System.out.print("You scored a %");
            System.out.printf("%.2f", percentage);

        }


    }

    public static void questionOne ()
    {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int user;

        System.out.println("Please Enter Your Choice of Arithmetic.");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Multiplication");
        System.out.println("Press 3 for Subtraction");
        System.out.println("Press 4 for Division");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if(user == 1)
        {
            for (int i = 0; i < 10; i++)
            {
                int randIntOne = rand.nextInt(10);
                int randIntTwo = rand.nextInt(10);

                System.out.printf("What is %d + %d?\n", randIntOne, randIntTwo);

                int math = randIntOne + randIntTwo;
                int input;

                input = scnr.nextInt();
                System.out.printf("You answered: %d\n", input);

                if (input == math)
                {
                    Clayton_3_p1.correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String correctResponse;

                    switch (positive)
                    {
                        case 1:
                            correctResponse = "Very good!";
                            break;
                        case 2:
                            correctResponse = "Excellent!";
                            break;
                        case 3:
                            correctResponse = "Nice work!";
                            break;
                        default:
                            correctResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(correctResponse);
                }
                else
                {
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String incorrectResponse;
                    Clayton_3_p1.incorrect++;

                    switch (negative)
                    {
                        case 1:
                            incorrectResponse = "No. Please try again.";
                            break;
                        case 2:
                            incorrectResponse = "Wrong try once more.";
                            break;
                        case 3:
                            incorrectResponse = "I believe in you!";
                            break;
                        default:
                            incorrectResponse = "Don't give up!";
                            break;
                    }
                    System.out.println(incorrectResponse);

                }

            }
        }

        if(user == 2)
        {
            for (int i = 0; i < 10; i++)
            {
                int randIntOne = rand.nextInt(10);
                int randIntTwo = rand.nextInt(10);

                System.out.printf("What is %d x %d?\n", randIntOne, randIntTwo);

                int math = randIntOne * randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("You answered: %d\n", input);

                if (input == math)
                {
                    Clayton_3_p1.correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String correctResponse;

                    switch (positive)
                    {
                        case 1:
                            correctResponse = "Very good!";
                            break;
                        case 2:
                            correctResponse = "Excellent!";
                            break;
                        case 3:
                            correctResponse = "Nice work!";
                            break;
                        default:
                            correctResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(correctResponse);
                }
                else
                {
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String incorrectResponse;
                    Clayton_3_p1.incorrect++;

                    switch (negative) {
                        case 1:
                            incorrectResponse = "No. Please try again.";
                            break;
                        case 2:
                            incorrectResponse = "Wrong try once more.";
                            break;
                        case 3:
                            incorrectResponse = "I believe in you!";
                            break;
                        default:
                            incorrectResponse = "Don't give up!";
                            break;
                    }
                    System.out.println(incorrectResponse);

                }

            }
        }

        if(user == 3)
        {
            for (int i = 0; i < 10; i++)
            {
                int randIntOne = rand.nextInt(10);
                int randIntTwo = rand.nextInt(10);

                System.out.printf("What is %d - %d?\n", randIntOne, randIntTwo);

                int math = randIntOne - randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("You answered: %d\n", input);

                if (input == math)
                {
                    Clayton_3_p1.correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String correctResponse;

                    switch (positive)
                    {
                        case 1:
                            correctResponse = "Very good!";
                            break;
                        case 2:
                            correctResponse = "Excellent!";
                            break;
                        case 3:
                            correctResponse = "Nice work!";
                            break;
                        default:
                            correctResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(correctResponse);
                }
                else
                {
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String incorrectResponse;
                    Clayton_3_p1.incorrect++;

                    switch (negative)
                    {
                        case 1:
                            incorrectResponse = "No. Please try again.";
                            break;
                        case 2:
                            incorrectResponse = "Wrong try once more.";
                            break;
                        case 3:
                            incorrectResponse = "I believe in you!";
                            break;
                        default:
                            incorrectResponse = "Don't give up!";
                            break;
                    }
                    System.out.println(incorrectResponse);

                }

            }
        }

        if(user == 4)
        {
            for (int i = 0; i < 10; i++)
            {
                int randIntOne = rand.nextInt(10);
                int randIntTwo = rand.nextInt(10);

                System.out.printf("What is %d / %d?\n", randIntOne, randIntTwo); //divide better

                int math = randIntOne / randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("You answered: %d\n", input);

                if (input == math)
                {
                    Clayton_3_p1.correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String correctResponse;

                    switch (positive)
                    {
                        case 1:
                            correctResponse = "Very good!";
                            break;
                        case 2:
                            correctResponse = "Excellent!";
                            break;
                        case 3:
                            correctResponse = "Nice work!";
                            break;
                        default:
                            correctResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(correctResponse);
                }
                else
                {
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String incorrectResponse;
                    Clayton_3_p1.incorrect++;

                    switch (negative)
                    {
                        case 1:
                            incorrectResponse = "No. Please try again.";
                            break;
                        case 2:
                            incorrectResponse = "Wrong try once more.";
                            break;
                        case 3:
                            incorrectResponse = "I believe in you!";
                            break;
                        default:
                            incorrectResponse = "Don't give up!";
                            break;
                    }
                    System.out.println(incorrectResponse);

                }

            }
        }


    }

    public static void questionTwo ()
    {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int randIntOne = rand.nextInt(100);
        int randIntTwo = rand.nextInt(100);

        System.out.printf("What is %d x %d?\n", randIntOne, randIntTwo);

        int math = randIntOne * randIntTwo;
        int input = 0;

        input = scnr.nextInt();
        System.out.printf("You answered: %d\n", input);

        if (input == math)
        {
            Clayton_3_p1.correct++;
            int randIntThree = rand.nextInt(4);
            int positive = randIntThree;
            String correctResponse;

            switch (positive)
            {
                case 1:
                    correctResponse = "Very good!";
                    break;
                case 2:
                    correctResponse = "Excellent!";
                    break;
                case 3:
                    correctResponse = "Nice work!";
                    break;
                default:
                    correctResponse = "Keep up the good work!";
                    break;
            }
            System.out.println(correctResponse);
        }

        else
        {
            int randIntFour = rand.nextInt(4);
            int negative = randIntFour;
            String incorrectResponse;
            Clayton_3_p1.incorrect++;

            switch (negative)
            {
                case 1:
                    incorrectResponse = "No. Please try again.";
                    break;
                case 2:
                    incorrectResponse = "Wrong try once more.";
                    break;
                case 3:
                    incorrectResponse = "I believe in you!";
                    break;
                default:
                    incorrectResponse = "Don't give up!";
                    break;
            }
            System.out.println(incorrectResponse);

        }
    }


    public static void questionThree ()
    {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int randIntOne = rand.nextInt(1000);
        int randIntTwo = rand.nextInt(1000);

        System.out.printf("What is %d x %d?\n", randIntOne, randIntTwo);

        int math = randIntOne * randIntTwo;
        int input = 0;

        input = scnr.nextInt();
        System.out.printf("You answered: %d\n", input);

        if (input == math)
        {
            Clayton_3_p1.correct++;
            int randIntThree = rand.nextInt(4);
            int positive = randIntThree;
            String correctResponse;

            switch (positive)
            {
                case 1:
                    correctResponse = "Very good!";
                    break;
                case 2:
                    correctResponse = "Excellent!";
                    break;
                case 3:
                    correctResponse = "Nice work!";
                    break;
                default:
                    correctResponse = "Keep up the good work!";
                    break;
            }
            System.out.println(correctResponse);
        }

        else
        {
            int randIntFour = rand.nextInt(4);
            int negative = randIntFour;
            String incorrectResponse;
            Clayton_3_p1.incorrect++;

            switch (negative)
            {
                case 1:
                    incorrectResponse = "No. Please try again.";
                    break;
                case 2:
                    incorrectResponse = "Wrong try once more.";
                    break;
                case 3:
                    incorrectResponse = "I believe in you!";
                    break;
                default:
                    incorrectResponse = "Don't give up!";
                    break;
            }
            System.out.println(incorrectResponse);

        }
    }

    public static void questionFour ()
    {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int randIntOne = rand.nextInt(10000);
        int randIntTwo = rand.nextInt(10000);

        System.out.printf("What is %d x %d?\n", randIntOne, randIntTwo);

        int math = randIntOne * randIntTwo;
        int input = 0;

        input = scnr.nextInt();
        System.out.printf("You answered: %d\n", input);

        if (input == math)
        {
            Clayton_3_p1.correct++;
            int randIntThree = rand.nextInt(4);
            int positive = randIntThree;
            String correctResponse;

            switch (positive)
            {
                case 1:
                    correctResponse = "Very good!";
                    break;
                case 2:
                    correctResponse = "Excellent!";
                    break;
                case 3:
                    correctResponse = "Nice work!";
                    break;
                default:
                    correctResponse = "Keep up the good work!";
                    break;
            }
            System.out.println(correctResponse);
        }

        else
        {
            int randIntFour = rand.nextInt(4);
            int negative = randIntFour;
            String incorrectResponse;
            Clayton_3_p1.incorrect++;

            switch (negative)
            {
                case 1:
                    incorrectResponse = "No. Please try again.";
                    break;
                case 2:
                    incorrectResponse = "Wrong try once more.";
                    break;
                case 3:
                    incorrectResponse = "I believe in you!";
                    break;
                default:
                    incorrectResponse = "Don't give up!";
                    break;
            }
            System.out.println(incorrectResponse);
        }
    }
}