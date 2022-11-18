package com.janhavi.Stacks;

public class DynamicStack extends Stack{

    public DynamicStack() {
        super(); //it will call Stack
    }

    public DynamicStack(int size) {
        super(size); //it will call stack(int size)
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()) {
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous items in new data
            for(int i = 0; i < data.length; i ++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }
}
