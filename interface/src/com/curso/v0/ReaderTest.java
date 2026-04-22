package com.curso.v0;

interface Classic {
    int version = 1; //public static final
    void read() ; //public abstract
}

class MediaReader implements Classic{
    int version = 2;
    @Override
    public void read() {
        //Insert code here => 1
    	System.out.println(((Classic)this).version); //1
    	System.out.println(Classic.version); //1
    	//System.out.println(MediaReader.version); //DONT COMPILE
    	//System.out.println(this.Classic.version); //DONT COMPILE
    	//System.out.println((Classic)version); //DONT COMPILE
    	System.out.println(this.version); //2
    }
}

public class ReaderTest{
    public static void main(String[] args) {
        MediaReader mr = new MediaReader();
        mr.read();
    }
}