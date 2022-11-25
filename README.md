# DAA-Assignment
## Problem-Statement: Give an application and implementation to demonstrate the Boyer Moore text pattern searching algorithm

In this experiment we have created a code for Boyer Moore searching algorithm in Java language. Pattern searching is an important problem in computer science. When we do search for a string in a notepad/word file, browser, or database, pattern searching algorithms are used to show the search results. A typical problem statement would be- 
Given a text txt[0..n-1] and a pattern pat[0..m-1] where n is the length of the text and m is the length of the pattern, write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in txt[]. You may assume that n > m. 

### Features of Boyer Moore Algorithm
1. It compares character by character from right to left;
2. The preprocessing phase in O(m+)time and space complexity.
3. The complexity of the searching phase is O(mn).
4. In the worst case (when searching for a non-periodic pattern), it makes 3n text character comparisons.
5. Its best performance complexity is O(n / m).


### Application
Boyer-Moore-Horspool is faster, simpler and optimized the searches of substrings. It has the following uses,

1. Searchbars
2. Auto-correctors
3. String Analyzers
4. Big Data
5. Text labeling
