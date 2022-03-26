
package com.syntax.class24;

abstract class File{
    abstract void open();
    void edit(){
        System.out.println("Editing a file");
    }
    void close(){
        System.out.println("Closing the file");
    }
}
class JavaFile extends File{
    void open(){
        System.out.println("Use intellij to open java files");
    }
}
class WordFile extends File{
    void open(){
        System.out.println("Use microsoft word to open this file");
    }
}
class PDFFile extends File{
    void open(){
        System.out.println("Use Adobe reader to open the file");
    }
}
public class Task2 {
    /*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
implementation of open behaviour: Example: to open .java file we need notepad++ or
sublime text, to open .doc file we need Microsoft word to be installed etc
 */

    public static void main(String[] args) {
        /*
        if a method is not present inside the parent class
        we cant call that method using polymorphism
         Object[] files={new JavaFile(), new PDFFile(), new WordFile()};
         Object[0].
         */
        File[] files={new JavaFile(), new PDFFile(), new WordFile()};
        for (int i = 0; i <files.length; i++){
            files[i].open();
            files[i].edit();
            files[i].close();
        }
        /*int i =0;
        while(i < files.length){
            files[i].open();
            files[i].edit();
            files[i].close();
            i++;
        }*/
    }
}
