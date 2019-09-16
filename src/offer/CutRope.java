package offer;

/**
 * @author sunjh
 * @date 2019/9/16 23:05
 */
public class CutRope {
    public static void main(String[] args) {
        System.out.println(cutRope(7));
    }
    public static int cutRope(int target) {
        if(target == 2){
            return 1;
        }
        if(target == 3){
            return 2;
        }
        int[] array = new int[target+1];
        array[0] = 1;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        for(int i=4;i<array.length;i++){
            array[i] = Math.max(Math.max(array[i-1],array[i-2]*2),array[i-3]*3);
        }
        return array[target];
    }
}
