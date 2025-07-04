package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านตัวเล็กหมดจะเป็น WEAK
        pw = "abcdefghijkwd" ; 
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+"Passed: lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+"FAILED: Expected INVALID but got " + result2);
        }

        //Test Case 3 : รหัสผ่านตัวเล็ก+ตัวใหญ่อย่างเดียวเป็น MEDIUM
        pw = "ABCawdAawa" ; 
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 : "+pw+"Passed: Lowercase + Uppercase password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 : "+pw+"FAILED: Expected INVALID but got " + result3);
        }

        //Test Case 4 : รหัสผ่านตัวเล็ก+ตัวเลขอย่างเดียวเป็น MEDIUM
        pw = "abcdefse123" ; 
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 : "+pw+"Passed: Lowercase + Number password is MEDIUM.");
        } else {
            System.out.println("Test Case 4 : "+pw+"FAILED: Expected INVALID but got " + result4);
        }

        //Test Case 5 : รหัสผ่านตัวใหญ่+ตัวเลข+ตัวเล็กเป็น STRONG
        pw = "ABcdefg123" ; 
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 5 : "+pw+"Passed: Uppercase + Lowercase + Numberpassword is STRONG.");
        } else {
            System.out.println("Test Case 5 : "+pw+"FAILED: Expected INVALID but got " + result5);
        }


        // Test Case 6: รหัสผ่านตัวเลขหมดจะเป็น WEAK
        pw = "12342344224" ; 
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.WEAK) {
            System.out.println("Test Case 6 : "+pw+"Passed: Number password is WEAK.");
        } else {
            System.out.println("Test Case 6 : "+pw+"FAILED: Expected INVALID but got " + result6);
        }




        //Test Case 7 : รหัสผ่านตัวใหญ่หมดจะเป็น WEAK
        pw = "QDADAWDAWDAW" ; 
        PasswordStrength result7 = PasswordValidator.validate(pw);
        if (result7 == PasswordStrength.WEAK) {
            System.out.println("Test Case 6 : "+pw+"Passed: Uppercase password is WEAK.");
        } else {
            System.out.println("Test Case 6 : "+pw+"FAILED: Expected INVALID but got " + result7);
        }


        System.out.println("--------------------------------");
    }

        //Test Case 7 : รหัสผ่านตัวใหญ่หมดจะเป็น WEAK

}


