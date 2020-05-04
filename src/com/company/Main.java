package com.company;

public class Main {

    enum Size {
        XS(34), S(36), M(38), L(40), XL(42);



        private int sizeClothes;

        private Size(int sizeClothes) {
            this.sizeClothes = sizeClothes;
        }

        public int getSizeClothes() {
            return sizeClothes;
        }
    }

    public static void main(String[] args) {
        Size size =Size.M;
        System.out.println(size.getSizeClothes());

        Size[] sizes = Size.values();
    }
}
