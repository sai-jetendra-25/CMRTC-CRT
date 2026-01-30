package RelationshipBtwClasses;

// Local Member Inner Classes:
public class LoginService {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        service.login("123423");
        service.login("123456");

    }

    private void login(String enterOtp) {
        final String generatedOtp = "123456";
        class OtpValidator {
            boolean validate() {
                return enterOtp.equals(generatedOtp);
            }
        }
        OtpValidator val = new OtpValidator();
        if (val.validate())
            System.out.println("Login sucessfull");
        else
            System.out.println("Invalid OTP");
    }

}
