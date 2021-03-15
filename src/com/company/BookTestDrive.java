package com.company;

public class BookTestDrive {
    public static void main(String[] args){
        Book myBooks = new Book();
        int x = 0;
        Book[] myBook = new Book[3];
        myBook[0] = new Book();
        myBook[1] = new Book();
        myBook[2] = myBooks;


        myBook[0].title = "Плоды Java";
        myBook[1].title = "Java getsbi";
        myBook[2].title = "Сборник рецептов по Java";


        myBook[0].author = "Bob";
        myBook[1].author = "Sya";
        myBook[2].author = "Yan";

        while ( x < 3 ){
            System.out.print(myBook[x].title);
            System.out.print(", author ");
            System.out.println(myBook[x].author);
            x = x + 1;
        }
    }
}
