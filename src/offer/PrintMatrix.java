package offer;

import java.util.ArrayList;

/**
 * @author sunjh
 * @date 2019/9/18 16:54
 */
public class PrintMatrix {
    int xi = 0;
    int yi = 0;
    int[][] data;
    int way = 0;
    //0向右
    //1向下
    //2向左
    //3向上

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        data = matrix;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(data[xi][yi]);
        data[xi][yi] = -1;
        while (canMvR() || canMvL() || canMvU() || canMvD()) {
           if (0 == way) {
                if (canMvR()) {
                    yi++;
                    list.add(data[xi][yi]);
                    data[xi][yi] = -1;
                } else {
                    changeWay();
                    if (!canMvD()) {
                        return list;
                    }
                }
            } else if (1 == way) {
                if (canMvD()) {
                    xi++;
                    list.add(data[xi][yi]);
                    data[xi][yi] = -1;
                } else {
                    changeWay();
                    if (!canMvL()) {
                        return list;
                    }
                }
            } else if (2 == way) {
                if (canMvL()) {
                    yi--;
                    list.add(data[xi][yi]);
                    data[xi][yi] = -1;
                } else {
                    changeWay();
                    if (!canMvU()) {
                        return list;
                    }
                }
            } else if (3 == way) {
                if (canMvU()) {
                    xi--;
                    list.add(data[xi][yi]);
                    data[xi][yi] = -1;
                } else {
                    changeWay();
                    if (!canMvR()) {
                        return list;
                    }
                }
            }
        }
        return list;
    }

    public void changeWay() {
        way = (way + 1) % 4;
    }

    public boolean canMvR() {
        if (yi + 1 >= data[0].length || data[xi][yi+1] == -1) {
            return false;
        }
        return true;
    }

    public boolean canMvL() {
        if (yi - 1 < 0 || data[xi][yi-1] == -1) {
            return false;
        }
        return true;
    }

    public boolean canMvU() {
        if (xi - 1 < 0 || data[xi-1][yi] == -1) {
            return false;
        }
        return true;
    }

    public boolean canMvD() {
        if (xi + 1 >= data.length || data[xi+1][yi] == -1) {
            return false;
        }
        return true;
    }
}
