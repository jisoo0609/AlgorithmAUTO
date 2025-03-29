class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) {
            String tryId = id_pw[0];
            String tryPw = id_pw[1];
            
            String dbId = db[i][0];
            String dbPw = db[i][1];
            
            if (tryId.equals(dbId)) {
                if (tryPw.equals(dbPw)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            } 
        }
        return "fail";
    }
}