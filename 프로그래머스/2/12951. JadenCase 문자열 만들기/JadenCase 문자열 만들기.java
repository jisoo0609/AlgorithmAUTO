class Solution {
    public static String solution(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            if (str[i].isEmpty()) {
                sb.append(" ");
                continue;
            }

            sb.append(str[i].substring(0, 1).toUpperCase());
            sb.append(str[i].substring(1).toLowerCase());

        if (i < str.length - 1 || s.endsWith(" ")) {
            sb.append(" ");
        }
        }
        return sb.toString();
    }
}