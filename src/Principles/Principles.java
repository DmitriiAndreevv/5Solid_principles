package Principles;

public class Principles {/** Liskov Substitution Principle суть принципа в создании классов и наследования их, но при наследовании мы не должны трогать функционал и параметры родительских классов  */
    static Rectangle getRect(){
        return new Rectangle();
    }
    public static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeight(10);
        rectangle.setWith(5);
        System.out.println(rectangle.getSquare());
    }
interface Shape{
        int getSquare();
}

 static class Rectangle implements Shape{
        int width;
        int height;

     public int getWith() {
         return width;
     }

     public void setWith(int with) {
         this.width = with;
     }

     public int getHeight() {
         return height;
     }

     public void setHeight(int height) {
         this.height = height;
     }
     @Override
     public int getSquare(){
         return width * height;
     }
 }
static class Square implements Shape{

        int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getSquare() {
        return width * width;
    }
}
}
