package datastructure.bigointerviewquiz;

/**
 * Which of the following are equivalent to O(N)? Why?
 */
public class InterviewQuiz7 {
    // 1. O(N+P), where P < N/2 ---> O(N), drop non dominant
    // 2. O(2N)  ---> O(N) , drop constant
    // 3. O(N + logN) ---> O(N), drop logN, non dominant
    // 4. O(N + NlogN) ---> O(NlogN), drop O(N), non dominant
    // 5. O(N+M)
}
