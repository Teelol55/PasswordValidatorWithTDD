package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @return 
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 

        if(password==null || password.length()<8)
            return PasswordStrength.INVALID;
        
        boolean hasLower = false ; 
        boolean hasUpper = false ; 
        boolean Number = false ; 

        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c))
                hasLower = true ;
            else if(Character.isUpperCase(c))
                hasUpper = true ; 
            else if(Character.isDigit(c))
                Number = true ;

    }
    if(hasLower && hasUpper && Number) return PasswordStrength.STRONG ;
    if(hasLower && Number) return PasswordStrength.MEDIUM ; 
    if(hasLower && !hasUpper) return PasswordStrength.WEAK ;
    if(hasLower && hasUpper) return PasswordStrength.MEDIUM ;
    if(Number && !hasLower && !hasUpper) return PasswordStrength.WEAK;
    if(hasUpper && !hasLower && !Number) return PasswordStrength.WEAK;
    



        return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}