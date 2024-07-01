import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// ================ Task 1 ================
// 1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.

        System.out.print("Enter your weight(kg): ");
        float weight = input.nextFloat(); // 70

        System.out.print("Enter your height(m): ");
        float height = input.nextFloat(); // 1.75

        float calcBmi = weight / (height * height);
        System.out.printf("BMI = %.2f",calcBmi); // 22.86


// ================ Task 2 ================
// 2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.

        System.out.print("Obtained marks = ");
        float obMarks = input.nextFloat(); // 85

        System.out.print("Total marks = ");
        float totalMarks = input.nextFloat(); // 100

        float precentage = (obMarks / totalMarks) * 100.0f;
        System.out.println("Precentage = "+ precentage + "%"); // 85.0%


// ================ Task 3 ================
// 3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.

        System.out.print("Amount in USD = ");
        float amount = input.nextFloat(); // 100

        System.out.print("Exchange Rate (USD to EUR) = ");
        float exchangeRate = input.nextFloat(); // 0.85

        float converted = amount * exchangeRate;
        System.out.println("Amount in EUR = " + converted); // 85.0


// ================ Task 4 ================
// 4. Create a program that takes a string as input, calculates its length, and then reverses  the string using the StringBuilder class, finally printing both the length and reversed string.

        System.out.print("Enter the word: ");
        String str = input.nextLine(); // Hello, World!
        StringBuilder reverse = new StringBuilder(str).reverse();
        System.out.println("Length of the string: " + str.length() + " And Reversed string: " + reverse); // 13 , !dlroW ,olleH

// ================ Task 5 ================
// 5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.

        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine(); // The quick brown fox jumps over the lazy dog
        String subStr = sentence.substring(10, 20);
        System.out.println(subStr); // brown fox


// ================ Task 6 ================
// 6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.

        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine(); // The quick brown fox jumps over the lazy dog

        System.out.print("Enter the Keyword: ");
        String keyword = input.nextLine(); //  jumps

        System.out.println("Keyword \"jumps\" is present in the sentence: " + sentence.contains(keyword)); // True

// ================ Task 7 ================
// 7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.

        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine(); // The quick brown fox jumps over the lazy dog

        System.out.print("Enter the replace word: ");
        String replaceWord = input.nextLine(); // fox

        System.out.print("Enter the replacement word: ");
        String replacmentWord = input.nextLine(); // cat

        System.out.println(sentence.replaceAll(replaceWord, replacmentWord)); // The quick brown cat jumps over the lazy dog

// ================ Task 8 ================
// 8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.

        System.out.print("Text one: ");
        String textOne = input.nextLine(); // Hello

        System.out.print("Text Tow: ");
        String textTwo = input.nextLine(); // hello
        System.out.println("String are equal (ignoring case): " + textOne.equalsIgnoreCase(textTwo)); // true

    }

}