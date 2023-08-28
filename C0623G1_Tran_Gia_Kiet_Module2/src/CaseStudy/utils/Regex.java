package CaseStudy.utils;

import java.time.Period;
import java.util.regex.Pattern;

public class Regex {
    public static boolean validateEmployeeId(String id) {
        Pattern pattern = Pattern.compile("^NV-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateCustomerId(String id) {
        Pattern pattern = Pattern.compile("^KH-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateVillaId(String id) {
        Pattern pattern = Pattern.compile("^SVVL-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateHouseId(String id) {
        Pattern pattern = Pattern.compile("^SVHO-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateRoomId(String id) {
        Pattern pattern = Pattern.compile("^SVRO-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateIdentNumber(String id) {
        Pattern pattern1 = Pattern.compile("^[0-9]{9}$");
        Pattern pattern2 = Pattern.compile("^[0-9]{12}$");
        return pattern1.matcher(id).matches() || pattern2.matcher(id).matches();
    }

    public static boolean validatePhoneNumber(String id) {
        Pattern pattern = Pattern.compile("^0[0-9]{9}$");
        return pattern.matcher(id).matches();
    }
}
