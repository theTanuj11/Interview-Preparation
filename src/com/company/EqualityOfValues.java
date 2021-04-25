package com.company;
class EqualityOfValues {
    public static int main(String[] args) {
        int a=1;
        int b=2;
        int c=1;
        if(JavaUtils.isEqualThree(a,b,c)) {
            return 3;
        }
        if(JavaUtils.isEqualTwo(a,b,c)) {
            return 2;
        }
        else {
            return 0;
        }
    }
}
