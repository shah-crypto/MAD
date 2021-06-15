import java.util.*;

abstract class Topic {
    Scanner sc1 = new Scanner(System.in);

    abstract void questions();
}

class JavaQuiz extends Topic {
    int javaCorrectAnswerCount = 0;

    void questions() {
        int ch1, ch2, ch3, ch4;
        System.out.println(
                "\nWhich of the following is not a Java features?\n1) Dynamic\n2) Architecture Neutral\n3) Use of pointers\n4) Object-oriented\nEnter your choice - ");
        ch1 = sc1.nextInt();
        if (ch1 == 3)
            javaCorrectAnswerCount++;

        System.out.println(
                "\nEvaluate the following Java expression, if x=3, y=5, and z=10:\n++z + y - y + z + x++\n1) 24\n2) 23\n3) 20\n4) 25\nEnter your choice - ");
        ch2 = sc1.nextInt();
        if (ch2 == 1)
            javaCorrectAnswerCount++;

        System.out.println(
                "\nWhich of these is used to find and fix bugs in the Java programs?\n1) JVM\n2) JRE\n3) JDK\n4) JDB\nEnter your choice - ");
        ch3 = sc1.nextInt();
        if (ch3 == 4)
            javaCorrectAnswerCount++;

        System.out.println(
                "\nWhich keyword is used for accessing the features of a package?\n1) package\n2) import\n3) extends\n4) export\nEnter your choice - ");
        ch4 = sc1.nextInt();
        if (ch4 == 2)
            javaCorrectAnswerCount++;
    }
}

class MathQuiz extends Topic {
    int mathCorrectAnswerCount = 0;

    void questions() {
        int ch1, ch2, ch3, ch4;
        System.out.println(("\nWhich polygon has eight sides?\n1) Octagon\n2) Hexagon\n3) Pentagon\n4) Square\nEnter your choice - "));
        ch1 = sc1.nextInt();
        if (ch1 == 1)
            mathCorrectAnswerCount++;

        System.out.println(("\nWhat is one half of a foot?\n1) 15 inches\n2) 12 inches\n3) 18 inches\n4) 6 inches\nEnter your choice - "));
        ch2 = sc1.nextInt();
        if (ch2 == 4)
            mathCorrectAnswerCount++;

        System.out.println(("\n20+(90÷2) is equal to?\n1) 50\n2) 55\n3) 65\n4) 60\nEnter your choice - "));
        ch3 = sc1.nextInt();
        if (ch3 == 3)
            mathCorrectAnswerCount++;

        System.out.println(("\nWhat is the next prime number after 5?\n1) 6\n2) 7\n3) 9\n4) 11\nEnter your choice - "));
        ch4 = sc1.nextInt();
        if (ch4 == 2)
            mathCorrectAnswerCount++;
    }
}

class NetworksQuiz extends Topic
{
    int cnCorrectAnswerCount = 0;

    int ch1,ch2,ch3,ch4;
    void questions()
    {
        System.out.println(("\nThe OSI Model has how many layers?\n1) 6\n2) 7\n3) 8\n4) 9\nEnter your choice - "));
        ch1 = sc1.nextInt();
        if (ch1 == 2)
            cnCorrectAnswerCount++;

        System.out.println(("\nWhich of the following transmission directions listed is not a legitimate channel?\n1) Simplex\n2) Half Duplex\n3) Full Duplex\n4) Double Duplex\nEnter your choice - "));
        ch2 = sc1.nextInt();
        if (ch2 == 4)
            cnCorrectAnswerCount++;

        System.out.println(("\n'Parity bits' are used for which of the following purposes?\n1) Encyption of data\n2) To transmit faster\n3) To detect errors\n4) To identify the user\nEnter your choice - "));
        ch3 = sc1.nextInt();
        if (ch3 == 3)
            cnCorrectAnswerCount++;

        System.out.println(("\nWhich software prevents the external access to a system?\n1) Firewall\n2) Gateway\n3) Router\n4) Virus checker\nEnter your choice - "));
        ch4 = sc1.nextInt();
        if (ch4 == 1)
            cnCorrectAnswerCount++;
    }
}

public class mainp 
{
    public static void main(String args[]) 
    {
        System.out.println("\nWelcome to our quiz");
        int choice,totalPoints = 0,totalQuizzes = 0;
        Scanner sc = new Scanner(System.in);
        do 
        {
            System.out.println("\nSelect and enter any one of the following topics\n1. Java\n2. Math\n3. CN\n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // System.out.println("You selected Java");
                    JavaQuiz jq = new JavaQuiz();
                    jq.questions();
                    System.out.println("\n--------------------------------");
                    System.out.println("You scored " + jq.javaCorrectAnswerCount + "/4 in your Java Quiz");
                    System.out.println("--------------------------------");
                    totalPoints += jq.javaCorrectAnswerCount;
                    totalQuizzes+= 4;
                    break;
                case 2:
                    // System.out.println("You selected Math");
                    MathQuiz mq = new MathQuiz();
                    mq.questions();
                    System.out.println("\n--------------------------------");
                    System.out.println("You scored " + mq.mathCorrectAnswerCount + "/4 in your Math Quiz");
                    System.out.println("--------------------------------");
                    totalPoints += mq.mathCorrectAnswerCount;
                    totalQuizzes += 4;
                    break;
                case 3:
                    // System.out.println("You selected CN");
                    NetworksQuiz nq = new NetworksQuiz();
                    nq.questions();
                    System.out.println("\n------------------------------------");
                    System.out.println("You scored " + nq.cnCorrectAnswerCount + "/4 in your Networks Quiz");
                    System.out.println("------------------------------------");
                    totalPoints += nq.cnCorrectAnswerCount;
                    totalQuizzes += 4;
                    break;
            }
        } while (choice < 4);
        if (choice == 4) {
            System.out.println("Your total score is " + totalPoints + "/" + totalQuizzes);
            System.out.println("Exiting...");
        } else {
            System.out.println("Choice not recognized");
        }
    }
}
