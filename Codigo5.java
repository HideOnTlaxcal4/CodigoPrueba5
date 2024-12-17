class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) { // Compara subcadena con needle
                return i; // Retorna el índice de la primera ocurrencia
            }
        }

        return -1; // Si no se encuentra needle en haystack, retorna -1
    }
}
