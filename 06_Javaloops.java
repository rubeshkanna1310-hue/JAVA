
HackerRank Home
|
Prepare
Certify
Compete


2
|
Switch to..

PrepareJavaIntroductionJava Loops I
Java Loops I

2 more points to get your next star!
Rank: 1242916|Points: 48/50
Java
You have successfully solved Java Loops I  
You are now 2 points away from the 2nd star for your java badge.
Try the next challenge | Try a Random Challenge
Problem
Submissions
Leaderboard
Discussions
Editorial
HackerRank Logo
|
PrepareJavaIntroductionJava Loops I
Exit Full Screen View
Problem	Submissions	Leaderboard	Discussions	Editorial
Objective
In this challenge, we're going to use loops to help us do some simple math.
Task
Given an integer, , print its first  multiples. Each multiple (where ) should be printed on a new line in the form: N x i = result.
Input Format
A single integer, .
Constraints

Output Format
Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
Sample Input
2
Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
Change Theme
Language
Java 7


More
1234567891011121314151617
import java.util.*;public class Solution {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int N = sc.nextInt();        for(int i = 1; i <= 10; i++) {            System.out.println(N + " x " + i + " = " + (N *             i));        }        sc.close();    }}

Line: 17 Col: 1

Submit Code

Run Code

Upload Code as File

Test against custom input
Congratulations
You solved this challenge. Would you like to challenge your friends?Share on FacebookShare on TwitterShare on LinkedIn
Next Challenge


Test case 0


Test case 1



Test case 2

Compiler Message
Success
Input (stdin)

Download
2
Expected Output

Download
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12#
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
BlogScoringEnvironmentFAQAbout UsHelpdeskCareersTerms Of ServicePrivacy Policy
