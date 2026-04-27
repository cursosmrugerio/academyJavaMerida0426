package com.curso.v0;

class Bandwidth{
    public int available = 0;
    public int getAvailable(){
        return available;
    }
    public Bandwidth(int quota){
        this.available = quota;
    }
    public void addMore(int more){
        available += more;
    }    
}

class Principal {
	
	public static void main(String[] args) {
        Bandwidth bw = new Bandwidth(100);
        //INSERT CODE HERE
        //bw(0);
        //bw.available = 0; //correcto
        //bw.setAvailable(0);
        //bw = new Bandwidth();
        //bw.addMore(-bw.getAvailable());//correcto
        bw.available--;
        
        System.out.println(bw.getAvailable()); //0
	}

}
