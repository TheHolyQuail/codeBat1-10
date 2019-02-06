
public class Runner {
    public static void main(String[] args) {
        System.out.println(in3050(31, 51));
        System.out.println(doubleX("xxddx"));
        System.out.println(frontAgain("cdsfasxc"));

        int[] z = {2,2,3};
        System.out.println(fix23(z));

        System.out.println(squirrelPlay(89, false));
        System.out.println(makeChocolate(5, 4, 22));
        System.out.println(catDog("catdogdfhcadog"));
        System.out.println(gHappy("catdog"));

        int[] x = {2,2,1,3,4};
        System.out.println(countEvens(x));

        int[] y = {10, 0, 1, -1, 10};
        System.out.println(canBalance(y));
    }

    public static boolean in3050(int a, int b) {
        if(a >= 30 && b >=30){
            if(a <= 40 && b <= 40){
                return true;
            }else if(a >= 40 && b >= 40){
                if(a <= 50 && b <= 50){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean doubleX(String str) {
        for(int i = 0;i < str.length() - 1;i++){
            if(str.substring(i,i+1).equals("x")){
                if(str.substring(i+1,i+2).equals("x")){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean frontAgain(String str) {
        if(str.length() < 2){
            return false;
        }else{
            String front = str.substring(0,2);
            String back = str.substring(str.length()-2,str.length());
            if(front.equals(back)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static int[] fix23(int[] nums) {
        int[] result = nums;
        for(int i = 0; i < 2; i++){
            if(result[i] == 2){
                if(result[i+1] == 3){
                    result[i+1] = 0;
                }
            }
        }
        return result;
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp >= 60 && temp <= 100){
            return (isSummer || temp <= 90);
        }else{
            return false;
        }
    }

    public static int makeChocolate(int small, int big, int goal) {
        int x = goal;
        int result = -1;

        for(int i = 0; i < big; i++){
            if(x - 5 >= 0){
                x -= 5;
            }
            if(small >= x){
                result = x;
            }
        }
        return result;
    }

    public static boolean catDog(String str) {
        int cats = 0;
        int dogs = 0;
        for(int i = 0;i < str.length() - 2;i++){
            if(Character.toString(str.charAt(i)).equals("c")){
                if(Character.toString(str.charAt(i+1)).equals("a")){
                    if(Character.toString(str.charAt(i+2)).equals("t")){
                        cats += 1;
                    }
                }
            } else if(Character.toString(str.charAt(i)).equals("d")){
                if(Character.toString(str.charAt(i+1)).equals("o")){
                    if(Character.toString(str.charAt(i+2)).equals("g")){
                        dogs += 1;
                    }
                }
            }
        }
        if(dogs == cats){
            return true;
        }else{
            return false;
        }
    }

    public static boolean gHappy(String str) {
        boolean result = false;
        if(str.length() < 1){
            return true;
        }
        for(int i = 0; i < str.length() - 1;i++){
            if(Character.toString(str.charAt(i)).equals("g")){
                if(Character.toString(str.charAt(i+1)).equals("g") || Character.toString(str.charAt(i-1)).equals("g")){
                    result = true;
                } else {
                    return false;
                }
            }
        }
        if(Character.toString(str.charAt(str.length()-1)).equals("g")){
            if(str.length() == 1){
                return false;
            }else if(!Character.toString(str.charAt(str.length()-2)).equals("g")){
                return false;
            }
        }
        return true;
    }

    public static int countEvens(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] % 2 == 0){
                result += 1;
            }
        }
        return result;
    }

    public static boolean canBalance(int[] nums) {
        if(nums.length == 1){
            return false;
        }

        int a = 0;
        int b = 0;
        int aSet = 0;
        int bSet = nums.length - 1;
        int ii = nums.length;
        while(ii >= 0){
            a += nums[aSet];
            aSet += 1;
            ii -= 1;
            while(b <= a){
                b += nums[bSet];
                bSet -= 1;
                ii -= 1;
            }
        }
        if(a + nums[0] == b || b + nums[0] == a){
            return true;
        } else{
            return false;
        }
    }
}
