/**
 * PersonalCode
 */
public class PersonalCode {

    private String code = "38705290260";

    public static void main(String[] args) {
        PersonalCode myCode = new PersonalCode();
        myCode.code = "450505050505";
        System.out.println(myCode.gender());
    }

    public String toString(){
        return "tere";
    }

    String getCode(){
        return this.code;
    }

    void setCode(String code){
        this.code = code;
    }
    
    public int getAge(){
        // vÃ¤ljastage vanus
        String yearPortion = code.substring(1, 3);

        int firstNumber = Integer.parseInt(yearPortion);
        String year;
        int ageNumber;

        if (firstNumber == 3 || firstNumber == 2){
            year = "19" + yearPortion;
        } else if (firstNumber == 4 || firstNumber == 5){
            year = "20" + yearPortion;
        }

        return 0;
    }

    String gender(){
        int firstNumber = Integer.parseInt(code.substring(0, 1));
        String gender;

        if (firstNumber % 2 == 0){
            gender = "female";
        } else {
            gender = "male";
        }

        return gender;
    }
}