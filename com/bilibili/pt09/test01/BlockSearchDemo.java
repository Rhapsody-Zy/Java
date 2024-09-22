package com.yeu.pt09.test01;

public class BlockSearchDemo {
    public static void main(String[] args) {
        /*原则1：
        块内无序，块间有序：前一块中的最大数据，一定小于后一块中的所有数据
        原则2：
        块的数量一般等于数字的个数开根号
        */

        int[] arr = {16,5,9,12,21,18,
                    32,23,37,26,45,34,
                    50,48,61,52,73,66};

        //创建三个块的对象
        Block block1 = new Block(21,0,5);
        Block block2 = new Block(45,6,11);
        Block block3 = new Block(73,12,17);

        //定义数组用来管理三个块的对象（索引表）
        Block[] blockArr = {block1,block2,block3};

        //定一个要查找的值
        int number = 30;

        int index = getIndex(blockArr,arr,number);
        System.out.println(index);


    }

    //1.确定number在索引表的位置
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        int indexBlock = finIndexBlock(blockArr,number);

        if (indexBlock == -1) {
            //表示number不在数组中
            return -1;
        }

        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //定义一个方法确认number在哪个块中
    private static int finIndexBlock(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }


}

class Block {
    private int max; //块中最大值
    private int startIndex; //起始索引
    private int endIndex;   //结束索引


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }


    public int getMax() {
        return max;
    }


    public void setMax(int max) {
        this.max = max;
    }


    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }


    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
