
public class Student {

    public static String getGrade(int number) {
        //if number is grater than 50 then pass else fail
//        if (number > 50) {
//            return "P";
//        } else {
//            return "F";
//        }

//        if (number >= 80) {
////            return "A+";
////        } else if(number >= 70) {
////            return "A";
////        } else if (number >= 60) {
////            return "A-";
////        } else if (number >= 50) {
////            return "B+";
////        }
////
////        return "F";

        if (number >= 80) {
            return "A+";
        } else if(number >= 70) {
            return "A";
        } else if (number >= 60) {
            return "A-";
        } else if (number >= 50) {
            return "B+";
        } else {
            return "F";
        }
    }
}
