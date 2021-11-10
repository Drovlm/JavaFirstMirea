package ru.mirea.task8;

    public abstract class Shape {
        // regular instance variable declarations
        private int x1, x2, y1, y2;

        // regular constructor and method declarations
        public Shape(int a, int b) { }
        public Shape(int newX1, int newY1, int newX2,
                     int newY2) {
            x1 = newX1;
            x2 = newX2;
            y1 = newY1;
            y2 = newY2;
        }
        public int getX1() { return x1; }
        public int getX2() { return x2; }
        public int getY1() { return y1; }
        public int getY2() { return y2; }

        // Abstract method declaration
        public abstract void draw();
    }

