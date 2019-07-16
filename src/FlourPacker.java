public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(3, 4, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0 || bigCount * 5 + smallCount < goal) {
            return false;
        } else {
            for (int i = 1; i <= bigCount; i++) {
                for (int j = 1; j <= smallCount; j++) {

                    if (i*5+j == goal) {
                        return true;
                    }
                    else return false;

                }
            }
        }
        return false;
    }
}
