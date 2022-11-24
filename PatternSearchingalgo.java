import java.util.HashMap;
import java.util.Map;

public class PatternSearchingalgo
{
    public static int BoyerMoore(char[] text, char[] searching_text)
    {
        System.out.println("Applying Boyer-Moore algo and searching for " + String.valueOf(searching_text) + " in " + String.valueOf(text));
        int n = text.length;
        int m = searching_text.length;

        if (m == 0) return 0;

        Map<Character, Integer> last = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            last.put(text[i], -1);
        }
        for (int i = 0; i < m; i++)
        {
            last.put(searching_text[i], i);
        }

        int i = m - 1;
        int k = m - 1;
        while (i < n)
        {
            if (text[i] == searching_text[k])
            {
                if (k == 0)
                {
                    System.out.println("\tMatch found at index " + i);
                    return i;
                }
                i--;
                k--;
            }
            else
            {
                i += m - Math.min(k, 1 + last.get(text[i]));
                k = m - 1;
            }
        }
        System.out.println("\tNO MATCH FOUND!!");
        return -1;
    }

    public static void main(String args[])
    {
        char[] text = "ABDECCACBDEACEA".toCharArray();
        char[] searching_text = "BDEA".toCharArray();
        BoyerMoore(text,searching_text);
    }
}

